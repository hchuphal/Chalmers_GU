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
  module.BooleanObject = BooleanObject;
  module.allocate      = allocate;

  // ------------------------------------------------------------

  function allocate(global) {
    var booleanConstructor = new BooleanConstructor(global.Boolean);
    var booleanPrototype   = booleanConstructor._proto;
    return { BooleanConstructor : booleanConstructor,
             BooleanPrototype   : booleanPrototype
           };
  }

  // 15.6.2 -----------------------------------------------------

  function BooleanConstructor(host){
    Ecma.call(this);

    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot); 
    this.Class      = 'Function';
    this.Extensible = true;

    this._proto     = new BooleanPrototype(this, host.prototype);
    this.host       = host;

    ecma.DefineFFF(this, constants.length,1); //REMOVE ?
    ecma.DefineFFF(this, constants.prototype, this._proto);
  }

  prelude.inherits(BooleanConstructor,Ecma);
  BooleanConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.6.1.1
  BooleanConstructor.prototype.Call = function(thisArg,args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);

    return conversion.ToBoolean(arg0);
  };

  // 15.6.2.1
  BooleanConstructor.prototype.Construct = function(args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);
    
    var b   = conversion.ToBoolean(arg0);
    var obj = new BooleanObject(b.value,b.label);

    return new Value(obj,bot);
  };

  // 15.6.4 ------------------------------------------------------------

  function BooleanPrototype(constructor,host) {
    Ecma.call(this);
  
    this.Class          = 'Boolean';
    this.PrimitiveValue = new Boolean(false);
    this.Prototype      = new Value(monitor.instances.ObjectPrototype,bot);

    this.host           = host;

    ecma.DefineFFF(this, constants.length, 1);
    ecma.DefineTFT(this, constants.constructor,constructor);
    ecma.DefineTFT(this, constants.toString, new BiFO(toString, 0, host.toString));
    ecma.DefineTFT(this, constants.valueOf , new BiFO(valueOf , 0, host.valueOf));
  }

  prelude.inherits(BooleanPrototype,Ecma);

  // toString, 15.6.4.2 -----------------------------------------

  var toString = function(thisArg,args) {
    var b = valueOf(thisArg);
    var s =  b.value ? 'true' : 'false';
    return new Value(s, b.label);
  };

  // valueOf, 15.6.4.3 ------------------------------------------ 

  var valueOf = function(thisArg,args) {

    if (typeof thisArg.value === 'boolean') {
      return thisArg;
    }

    if (thisArg.value !== null && 
        typeof thisArg.value === 'object' && 
        thisArg.value.Class === 'Boolean') {
      return new Value(thisArg.value.PrimitiveValue.valueOf(), thisArg.label);
    }

    monitor.Throw(
      monitor.modules.error.TypeErrorObject,
      'Boolean.prototype.valueOf is not generic',
      thisArg.label
    );
  };

  // ------------------------------------------------------------
  // Boolean Object, 15.6.5

  function BooleanObject(val,lbl) {
    Ecma.call(this);

    this.Class          = 'Boolean';
    this.PrimitiveValue = new Boolean(val);
    this.PrimitiveLabel = lbl;
    this.Extensible     = true;
    this.Prototype      = new Value(monitor.instances.BooleanPrototype,bot);

  }

  prelude.inherits(BooleanObject,Ecma);

  // ---

  BooleanObject.prototype.toNative = function(deep) {
    var v = new Boolean(this.PrimitiveValue);
    return new Value(v, this.PrimitiveLabel);
  };

  // ---

  return module;
};



