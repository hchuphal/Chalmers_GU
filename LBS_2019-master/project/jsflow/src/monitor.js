/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

(function () {

  var imports = {
    esprima      : require('esprima'),
    escodegen    : require('escodegen'),
    estraverse   : require('estraverse'),
    underscore   : require('underscore'),
    'source-map' : require('source-map'),
    util         : require('util'),

    prelude      : require('./prelude'),

    stack        : require('./stack'),
    map          : require('./map'),
    set          : require('./set'),

    opt          : require('./options'),
    pp           : require('./pp'),

    label        : require('./label'),
    values       : require('./values'),
    constants    : require('./constants'),

    context      : require('./context'),

    conversion   : require('./conversion'),
    ecma         : require('./ecma'),
    'function'   : require('./function'),
    object       : require('./object'),
    error        : require('./error'),
    env          : require('./env'),

    bool         : require('./bool'),
    number       : require('./number'),
    string       : require('./string'),
    array        : require('./array'),
    regexp       : require('./regexp'),
    date         : require('./date'),
    math         : require('./math'),
    json         : require('./json'),

    global       : require('./global'),
    exec         : require('./exec')
  };

  var prelude = imports.prelude;
  var bot     = imports.label.Label.bot;

  // --------------------------------------------------------------------------

  exports.Monitor       = Monitor;
  exports.MonitorBase   = MonitorBase;
  exports.SecurityError = SecurityError;

  // --------------------------------------------------------------------------

  function SecurityError(message) {
    this.message = message;
    this.stack   = new Error().stack;
  }

  SecurityError.prototype.toString = function() {
    return this.message;
  };

  // --------------------------------------------------------------------------

  function MonitorBase() {
  
    this.modules = {};
    var load = [
      'esprima',
      'escodegen',
      'estraverse',
      'underscore',
      'source-map',
      'util',
      'prelude',
      'set',
      'map',
      'stack',
      'label',
      'pp',
      'values',
      'constants',
      'context',
      'conversion',
      'ecma',
      'function',
      'object',
      'error',
      'env',
      'bool',
      'number',
      'string',
      'array',
      'regexp',
      'date',
      'math',
      'json',
      'global',
      'exec'
    ];

    this.setup(this.modules, load, imports);

    this.options = new imports.opt.Options();

    this.__defineGetter__('context', 
      function() {
         return this.contextStack.peek();
      }
    );

    this.options.declare('monitor.taintMode', 'boolean', false, 'taint mode');
    //this.options.declare('monitor.taintMode', 'boolean', true, 'taint mode');
    
    this.debug        = {};
    this.debug.active = false;

  }

  MonitorBase.prototype.setup = function(target, load, imports) {

    for (var i = 0, len = load.length; i < len; i++) {
      var name   = load[i];

      var module = imports[name];

      if (typeof module.functor === 'function') {
        target[name] = module.functor(this);
      } else {
        target[name] = module;
      }
    }
  };

  MonitorBase.prototype.initialize = function(global) {
    this.debug.active = false;

    this.contextStack = new imports.stack.Stack();
    // needed to be able to allocate instances, since Ecma
    // reads the effective pc of the context
    var context = new this.modules.context.Context();
    context.owner = '<monitor>';
    this.contextStack.push(context);

    this.instances = {};

    // create instances to make Object.prototype and Function.prototyoe
    // available

    var functionInstances = this.modules['function'].allocate(global.Function);
    prelude.copy(functionInstances, this.instances);

    var objectInstances   = this.modules.object.allocate(global.Object);
    prelude.copy(objectInstances, this.instances);

    // now that Object.prototype is available functions can be setup
    this.modules['function'].setup();    
    var instanceList = [
      this.modules.error,
      this.modules.bool,
      this.modules.number,
      this.modules.string,
      this.modules.array,
      this.modules.regexp,
      this.modules.date,
      this.modules.math,
      this.modules.json
    ];

    for (var i = 0, len = instanceList.length; i < len; i++) {
      var instances = instanceList[i].allocate(global);
      prelude.copy(instances, this.instances);
    }
  };


  MonitorBase.prototype.running = function() {
    return this.modules.exec.running();
  };

  MonitorBase.prototype.execute = function(code, filename) {
    if (!this.initialized) {
      // TODO: throw error
    }
    var ret = this.modules.exec.executeGlobalCode(code,filename);
    return ret;
  };

  MonitorBase.prototype.resume = function() {
    this.debug.active = false;
    return this.modules.exec.resume();
  };

  MonitorBase.prototype.step = function() {
    return this.modules.exec.resume();
  };

  MonitorBase.prototype.printWorkList = function() {
    console.log('context owner: ' + this.context.owner);
    console.log(String(this.context.workList));
  };

  MonitorBase.prototype.require = function(name) {
    var path = name.split('/');
    var current = this.modules;

    for (var i = 0, len = path.length; i < len; i++) {
      if (current === undefined) {
        break;
      }
      current = current[path[i]];
    }

    if (!current) {
      this.fatal('Module ' + name + ' not found');
    }
    return current;
  };

  MonitorBase.prototype.fatal = function(msg) {
    var exc  = new Error(msg);
    exc.type = 'Fatal';
    throw exc;
  };

  MonitorBase.prototype.stop = function (msg) {
    var exc  = new Error(msg);
    exc.type = 'Stop';
    throw exc;
  };

  MonitorBase.prototype.Throw = function (exc,msg,lbl) {

    this.assert(
      this.modules.label.le(this.context.effectivePC, this.context.labels.exc),
      'throw: effective pc ' + this.context.effectivePC + 
      ' not below exception label ' + this.context.labels.exc
    );

    var Value = this.modules.values.Value;
    this.offendingTrace = this.stackTrace();
    throw new Value(new exc(new Value(msg,lbl)), lbl);
  };

  MonitorBase.prototype.stackTrace = function() {
    return new StackTrace(this.contextStack.toArray());
  };

  MonitorBase.prototype.securityError = function(message) {
    var exc = new SecurityError(message);
    throw exc;

   // if (this.options.get('monitor.unsoundMode')) {
   //   this.warn('[Security violation] ' + msg);
   //   this.warn(codeLocation());
   // } else {
   //   var exc  = new Error('[Security violation] ' + msg + '\n');
   //   exc.type = 'Security';
   //   throw exc;
   // }
  };

  MonitorBase.prototype.assert = function(b,msg) {
    if (!b) this.securityError(msg); 
  };

  MonitorBase.prototype.liftException = function(e, Throw) {
    if (e instanceof SecurityError) {
      throw e;
    }

    if (Throw) {
      this.Throw(
        this.modules.error.nativeTable[e.name],
        e.message,
        bot
      );
    }
  };

  // --------------------------------------------------------------------------

  function Monitor(global, log, print, error, warn) {
    MonitorBase.call(this);

    this.log   = log ? log : console.log;
    this.print = print ? print : console.log;
    this.error = error ? error : console.log;
    this.warn  = warn ? warn : console.log;

    this.initialize(global);
  }

  prelude.inherits(Monitor, MonitorBase);

  Monitor.prototype.initialize = function(global) {
    MonitorBase.prototype.initialize.call(this,global);

    var globalInstance = this.modules.global.allocate(global);
    prelude.copy(globalInstance, this.instances);

    this.modules.exec.initialize();
  };

  // --------------------------------------------------------------------------- 

  function StackTrace(stack) {

    this.trace = [];
    for (var i = 0, len = stack.length; i < len; i++) {
      var context = stack[i];

      var stmt = context.currentStatement;
      if (stmt === undefined) {
        break;
      }

      var loc  = stmt.loc;
      var source = loc.source;

      this.trace.push({ owner : context.owner, source : source, loc : loc.start, stmt : stmt });
    }
  }

  StackTrace.prototype.toString = function() {

    if (this.trace.length === 0) {
      return '';
    }
    
    var result;

    var len = this.trace.length;
    // last entry contains offending command
    var last = this.trace[len-1];

    result = last.source + ':' + last.loc.line + ':' + last.loc.column + '\n';
    result = result + '    ' + escodegen.generate(last.stmt) + '\n\n';
    
    for (var i = len-2; i >= 0; i--) {
      var tr = this.trace[i];
      if (tr.owner) {
        result = result + 'at ' + tr.owner + ' ';
      }
      result = result + '(' + tr.source + ':' + tr.loc.line + ':' + tr.loc.column + ')\n';
    }
    return result;
  };

})();
