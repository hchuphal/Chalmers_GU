/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var label = monitor.require('label');

  var Stack = monitor.require('stack').Stack;
  var Value = monitor.require('values').Value;
  var pp    = monitor.require('pp');
  var Label = label.Label;
  var lub   = label.lub;
  var bot   = Label.bot;


  var module = {};
  module.Context = Context;
  module.Result  = Result;
   
  function Bucket(element, prev, next) {
    this.element = element;
    this.next    = next || null;
    this.prev    = prev || null;
  }

  function WorkList() {

    this.length  = 0;
    this.head    = null;
    this.thenloc = null;

  }

  WorkList.prototype.toString = function() {
    var pos = this.head;
    var str = 'worklist:';
    var cnt = 1;
    while (pos) {
      var element = pos.element;
      var line;
      if (typeof element === 'function') {
        line = cnt + ': ' + String(element);
      } else if ('func' in element && 'data' in element) {
        line = cnt + ': ' + String(element.func);
      } else {
        line = cnt + ': ' + element.type + ' ' + pp.pretty(element);
      }

      var ix = line.indexOf('\n');
      if (ix > 0) {
        line = line.slice(0,ix);
      }
       
      str = str + '\n' + line;
      pos = pos.next;
      cnt++;
    }
    return str;
  };

  WorkList.prototype.push = function(element) {
    this.head = new Bucket(element, null, this.head);

    if (this.head.next) {
      this.head.next.prev = this.head;
    }

    this.length++;
  };

  WorkList.prototype.prepend = function(elements) {
    for (var i = elements.length-1; i >= 0; i--) {
      this.push(elements[i]);
    }
  };

  WorkList.prototype.peek = function() {
    return this.head.element;
  };

  WorkList.prototype.pop = function() {
    var element = this.head.element;
    this.head = this.head.next;
    this.length--;
    return element;
  };

  WorkList.prototype.empty = function() {
    return (this.head === null);
  };

  WorkList.prototype.top = function() {
    return new WorkListPtr(this, null);
  };

  WorkList.prototype.first = function(element) {
    if (element) {
      this.push(element);
      this.thenloc = this.head; 
    } else {
      // if no element given, reset thenloc to force next called 'then'
      // to be a 'first'
      this.thenloc = null;
    }
  };

  WorkList.prototype.then = function(element) {
    if (!this.thenloc) {
    
      this.first(element);

    } else {

      var before = this.thenloc;
      var after  = this.thenloc.next;
      
      var bucket = new Bucket(element,before,after);

      before.next  = bucket;
      this.thenloc = before.next;

      if (after) {
        after.prev  = before.next;
      }

      this.length++;
    }
  };

  // -------------------------------------------------------------

  function WorkListPtr(worklist, pos) {
    this.worklist = worklist;
    this.pos = pos;
  }

  WorkListPtr.prototype.then = function(element, data) {
  
    if (!element) {
      throw Error();
    }

    var thing = element;
    if (data) {
      thing = { func : element, data : data };
    }
  
    if (this.pos) {
      var before = this.pos;
      var after  = this.pos.next;

      var bucket = new Bucket(thing,before,after);

      before.next = bucket;
      this.pos    = before.next;

      if (after) {
        after.prev  = before.next;
      }

      this.worklist.length++;

    } else {

      this.worklist.push(thing);
      this.pos = this.worklist.head;

    }

    return this;
  };

  // ------------------------------------------------------------
  // The Completion Specification Type, 8.9

  function Result(value) {
      this.type   = 'normal'; // normal, break, continue, return, throw;
      this.value  = value || null; // null or a value
      this.target = null; // null or a string
  }

  // -------------------------------------------------------------
  // The Execution Context

  function Context(thisValue,variableEnv,lexicalEnv) {
      
      this.thisValue   = thisValue;
      this.variableEnv = variableEnv;
      this.lexicalEnv  = lexicalEnv;

      this.pcStack = new Stack();
      this.pcStack.push(Label.bot);
      
      var _this   = this;
      this.labels = {};
      this.labels.__defineGetter__('pc', function() {
        return _this.pcStack.peek();
      });

      this.labels.__defineSetter__('pc', function(l) {
        _this.pcStack.pop();
        _this.pcStack.push(l);
      });

      this.labels.exc  = Label.bot;
      this.labels.ret  = Label.bot; 

      // statement label map
      this.labels.labelmap = [];


      this.__defineGetter__('effectivePC', function() {

        if (monitor.options.get('monitor.taintMode')) {
          return bot;
        }

        return lub(this.labels.pc, this.labels.exc, this.labels.ret); 
      });


      this.workList     = new WorkList();
      this.result       = new Result();
      this.valueStack   = new Stack();
  }

  Context.prototype.clone = function(thisValue, variableEnv, lexicalEnv) {

    var tV = thisValue || this.thisValue;
    var lE = lexicalEnv || this.lexicalEnv;
    var vE = variableEnv || this.variableEnv;

    var newCtx = new Context(tV,vE,lE);
    newCtx.labels.pc  = this.effectivePC;
    newCtx.labels.exc = this.labels.exc;
    newCtx.labels.ret = this.labels.ret;
    return newCtx;
  };


  Context.prototype.pushPC = function(l) {
    this.pcStack.push(lub(l,this.labels.pc));
  };

  Context.prototype.raisePC = function(l) {
    this.labels.pc = lub(this.labels.pc, l);
  };

  Context.prototype.popPC = function() {
    return this.pcStack.pop();
  };

  Context.prototype.ctx = function() {
    return lub(this.labels.pc, this.labels.exc, this.internal.pc);
  };

  return module;
};
