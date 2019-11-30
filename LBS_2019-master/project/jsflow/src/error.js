/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {
   
  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var _function       = monitor.require('function');

  var Value           = monitor.require('values').Value;

  var Ecma            = ecma.Ecma;
  var BiFO            = _function.BuiltinFunctionObject;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.EvalErrorObject      = EvalErrorObject;
  module.RangeErrorObject     = RangeErrorObject;
  module.ReferenceErrorObject = ReferenceErrorObject;
  module.SyntaxErrorObject    = SyntaxErrorObject;
  module.TypeErrorObject      = TypeErrorObject;
  module.URIErrorObject       = URIErrorObject;
  module.ErrorObject          = ErrorObject;
  module.allocate             = allocate;
  module.nativeTable = {
    'EvalError' : EvalErrorObject,
    'RangeError' : RangeErrorObject,
    'ReferenceError' : ReferenceErrorObject,
    'SyntaxError' : SyntaxErrorObject,
    'TypeError' : TypeErrorObject,
    'URIError' : URIErrorObject
  };

  // ------------------------------------------------------------


  function allocate(global) {

    var errorConstructor          = new ErrorConstructor();
    var errorPrototype            = errorConstructor._proto;

    // 15.11.5
    var evalErrorConstructor      = new NativeErrorConstructor(global,'EvalError');
    var rangeErrorConstructor     = new NativeErrorConstructor(global,'RangeError');
    var referenceErrorConstructor = new NativeErrorConstructor(global,'ReferenceError');
    var syntaxErrorConstructor    = new NativeErrorConstructor(global,'SyntaxError');
    var typeErrorConstructor      = new NativeErrorConstructor(global,'TypeError');
    var URIErrorConstructor       = new NativeErrorConstructor(global,'URIError');

    var evalErrorPrototype        = evalErrorConstructor._proto;
    var rangeErrorPrototype       = rangeErrorConstructor._proto;
    var referenceErrorPrototype   = referenceErrorConstructor._proto;
    var syntaxErrorPrototype      = syntaxErrorConstructor._proto;
    var typeErrorPrototype        = typeErrorConstructor._proto;
    var uriErrorPrototype         = URIErrorConstructor._proto;

    return { ErrorConstructor          : errorConstructor,
             ErrorPrototype            : errorPrototype,
             EvalErrorConstructor      : evalErrorConstructor,
             EvalErrorPrototype        : evalErrorPrototype,
             RangeErrorConstructor     : rangeErrorConstructor,
             RangeErrorPrototype       : rangeErrorPrototype,
             ReferenceErrorConstructor : referenceErrorConstructor,
             ReferenceErrorPrototype   : referenceErrorPrototype,
             SyntaxErrorConstructor    : syntaxErrorConstructor,
             SyntaxErrorPrototype      : syntaxErrorPrototype,
             TypeErrorConstructor      : typeErrorConstructor,
             TypeErrorPrototype        : typeErrorPrototype,
             URIErrorConstructor       : URIErrorConstructor,
             URIErrorPrototype         : uriErrorPrototype
    };
  }

  // ------------------------------------------------------------
  // 15.11 - The Error Constructor

  function ErrorConstructor(host) {
    Ecma.call(this);

    this.Class      = 'Function';
    this.host       = host;
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Extensible = true;
    this.name       = 'Error';

    this._proto     = new ErrorPrototype(this);

    ecma.DefineFFF(this,constants.length,1);
    ecma.DefineFFF(this,constants.prototype,this._proto);
  }

  prelude.inherits(ErrorConstructor,Ecma);

  ErrorConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.11.2
  ErrorConstructor.prototype.Call = function(thisArg,args) {
    return this.Construct(args);
  };

  // 15.11.2.1
  ErrorConstructor.prototype.Construct = function(args) {
    var arg0 = args[0] ? args[0] : new Value(undefined,bot);
    var o = new ErrorObject(arg0);
    return new Value(o,bot);
  };
    
  // ------------------------------------------------------------
  // 15.11.4 The Error Prototype

  function ErrorPrototype(constructor) {
    Ecma.call(this);

    this.Class     = 'Error';
    this.Prototype = new Value(monitor.instances.ObjectPrototype,bot);
    
    ecma.DefineTFT(this,constants.constructor,constructor);
    ecma.DefineTFT(this,constants.name, 'Error');
    ecma.DefineTFT(this,constants.message, '');

    ecma.DefineTFT(this , constants.toString , new BiFO(ToString, 0, undefined));   
  }

  prelude.inherits(ErrorPrototype,Ecma);

  // ------------------------------------------------------------

  function ToString(thisArg, args) {
    var c = monitor.context;

    if (  thisArg.value === null 
       || typeof thisArg.value !== 'object' 
       || thisArg.value.Class !== 'Error' ) {

      c.pushPC(thisArg.label);
      monitor.Throw(
        TypeErrorObject,
        'Error object expected',
        bot
      );
    }

    var name = thisArg.Get(constants.name);

    if (name.value === undefined)  {
      name.value = 'Error';
    } else {
      c.pushPC(name.label);
        name = conversion.ToString(name);
      c.popPC();
    }

    var msg = thisArg.Get(constants.message);

    if (msg.value === undefined) {
      msg.value = '';
    } else {
      c.pushPC(msg.label);
        msg = conversion.ToString(msg);
      c.popPC();
    }

    if (name.value === '') {
      msg.raise(name.label);
      return msg;
    }

    if (msg.value === '') {
      name.raise(msg.label);
      return name;
    }

    name.value += ': ' + msg.value;
    name.raise(msg.label);
    return name;
  }

  // ------------------------------------------------------------

  function ErrorObject(v) {
    Ecma.call(this);

    this.Prototype  = new Value(monitor.instances.ErrorPrototype, bot);
    this.Class      = 'Error';
    this.Extensible = true;

    if (v.value !== undefined)  {
      v = conversion.ToString(v);
      this.DefineOwnProperty(
        constants.message,
        { value        : v.value,
          label        : v.label,
          writable     : true,
          enumerable   : false,
          configurable : true
        }
      );
    }
  }

  prelude.inherits(ErrorObject,Ecma);

  ErrorObject.prototype.toString = function() {
    var str = ToString(new Value(this, bot));
    return str.value;
  };

  // ------------------------------------------------------------
  // 15.11.7 The NativeError Constructor

  function NativeErrorConstructor(global,name) {
    Ecma.call(this);

    this.Class      = 'Function';
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Extensible = true;

    this.name       = name;
    this.host       = global[name];

    this._proto     = new NativeErrorPrototype(this,name);

    ecma.DefineFFF(this,constants.length,1);
    ecma.DefineFFF(this,constants.prototype,this._proto);

  }

  prelude.inherits(NativeErrorConstructor,Ecma);
  
  NativeErrorConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.11.7.2
  NativeErrorConstructor.prototype.Call = function(thisArg,args) {
    return this.Construct(args);
  };

  // 15.11.7.4
  NativeErrorConstructor.prototype.Construct = function(args) {
    var message = args[0] || new Value(undefined,bot);
    var o = new NativeErrorObject(this._proto,message);
    return new Value(o,bot);
  };

  // ------------------------------------------------------------
  // 15.11.7.6 The NativeError Prototype

  function NativeErrorPrototype(constructor,name) {
    Ecma.call(this);

    this.Class     = 'Error';
    this.Prototype = new Value(monitor.instances.ObjectPrototype,bot);
      
    ecma.DefineTFT(this, constants.constructor,constructor); 
    ecma.DefineTFT(this, constants.name, name);
    ecma.DefineTFT(this, constants.message, ''); 
    ecma.DefineTFT(this, constants.toString , new BiFO(ToString, 0, undefined));   
  }

  prelude.inherits(NativeErrorPrototype,Ecma);
    
  // ------------------------------------------------------------
  function NativeErrorObject(proto,message) {
    Ecma.call(this);
    this.Prototype  = new Value(proto, bot);
    this.Class      = 'Error';
    this.Extensible = true;
  
    this.stack = monitor.stackTrace();
    
    if (message.value !== undefined)  {
      message = conversion.ToString(message);
      
      this.DefineOwnProperty(constants.message,
        { value        : message.value,
          writable     : true,
          configurable : true,
          label        : message.label
        }
      );
    }
  
  }

  prelude.inherits(NativeErrorObject,Ecma);
  
  NativeErrorObject.prototype.toString = function() {
    var str = ToString(new Value(this, bot));
    return str.value;
  };

  // -------------------------------------------------------------------------- 

  function EvalErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.EvalErrorPrototype,v);
    this.Type = 'EvalError';
  }
  prelude.inherits(EvalErrorObject,NativeErrorObject);

  function RangeErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.RangeErrorPrototype,v);
    this.Type = 'RangeError';
  }
  prelude.inherits(RangeErrorObject,NativeErrorObject);

  function ReferenceErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.ReferenceErrorPrototype,v);
    this.Type = 'ReferenceError';
  }
  prelude.inherits(ReferenceErrorObject,NativeErrorObject);

  function SyntaxErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.SyntaxErrorPrototype,v);
    this.Type = 'SyntaxError';
  }
  prelude.inherits(SyntaxErrorObject,NativeErrorObject);

  function TypeErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.TypeErrorPrototype,v);
    this.Type = 'TypeError';
  }
  prelude.inherits(TypeErrorObject,NativeErrorObject);

  function URIErrorObject(v) {
    NativeErrorObject.call(this,monitor.instances.UriErrorPrototype,v);
    this.Type = 'URIError';
  }
  prelude.inherits(URIErrorObject,NativeErrorObject);

  // -------------------------------------------------------------------------- 
  
  return module;
};
