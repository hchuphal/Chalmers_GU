/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var error           = monitor.require('error');
  var _function       = monitor.require('function');

  var Value           = monitor.require('values').Value;

  var Ecma            = ecma.Ecma;
  var BiFO            = _function.BuiltinFunctionObject;
  var Unimplemented   = _function.Unimplemented;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.NumberObject = NumberObject;
  module.allocate     = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var numberConstructor = new NumberConstructor(host.Number);
    var numberPrototype   = numberConstructor._proto;

    return { NumberConstructor : numberConstructor,
             NumberPrototype   : numberPrototype 
           };
  }

  // ------------------------------------------------------------
  // The Number Constructor, 15.7.2

  function NumberConstructor(host) {
    Ecma.call(this);
    
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Function';
    // not mandated by standard
    this.Extensible = true;

    this.host = host
    this._proto = new NumberPrototype(this);
    
    ecma.DefineFFF(this, constants.length           , 1);
    ecma.DefineFFF(this, constants.prototype        , this._proto);

    ecma.DefineFFF(this, constants.MAX_VALUE        , this.host.MAX_VALUE);
    ecma.DefineFFF(this, constants.MIN_VALUE        , this.host.MIN_VALUE);
    ecma.DefineFFF(this, constants.NaN              , this.host.NaN);
    ecma.DefineFFF(this, constants.NEGATIVE_INFINITY, this.host.NEGATIVE_INFINITY);
    ecma.DefineFFF(this, constants.POSITIVE_INFINITY, this.host.POSITIVE_INFINITY);
  }

  prelude.inherits(NumberConstructor,Ecma);
  NumberConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.7.1.1
  NumberConstructor.prototype.Call = function(thisArg,args) {
    if (!args[0]) {
      return new Value(0,bot);
    }

    return conversion.ToNumber(args[0]);
  };

  // 15.7.2.1
  NumberConstructor.prototype.Construct = function(args) {
    var arg0 = args[0] ? conversion.ToNumber(args[0]) : new Value(0,bot);
    var res = new NumberObject(arg0.value, arg0.label);
    return new Value(res,bot);
  };
  
  // ------------------------------------------------------------
  // The Number Prototype, 15.7.4
  function NumberPrototype(constructor) {
    Ecma.call(this);
    this.Class          = 'Number';
    this.Prototype      = new Value(monitor.instances.ObjectPrototype,bot);
    this.PrimitiveValue = new Number(0);
    this.PrimitiveLabel = bot;

    this.host = constructor.host.prototype;

    ecma.DefineFFF(this, constants.length        , 0);
    ecma.DefineTFT(this, constants.constructor   , constructor);
    ecma.DefineTFT(this, constants.toString      , new BiFO(toString      , 1, this.host.toString));
    ecma.DefineTFT(this, constants.toLocaleString, new BiFO(toLocaleString, 0, this.host.toLocaleString));
    ecma.DefineTFT(this, constants.valueOf       , new BiFO(valueOf       , 0, this.host.valueOf));
    ecma.DefineTFT(this, constants.toFixed       , new BiFO(toFixed       , 0, this.host.toFixed));
    ecma.DefineTFT(this, constants.toExponential , new BiFO(toExponential , 0, this.host.toExponential));
    ecma.DefineTFT(this, constants.toPrecision   , new BiFO(toPrecision   , 0, this.host.toPrecision));
  }

  prelude.inherits(NumberPrototype,Ecma);

  // ------------------------------------------------------------
  // toString, 15.7.4.2
  var toString = function(thisArg,args) {

    if ( ! (typeof thisArg.value === 'number' || (thisArg.value !== null  && typeof thisArg.value === 'object' && thisArg.value.Class === 'Number'))) {
      monitor.Throw(
        error.TypeErrorObject,
        'Number.prototype.toString is not generic',
        thisArg.label
      );
    }

    var radix = args[0] || new Value(undefined, bot);
    if (radix.value === undefined) {
      radix.value = 10;
    }

    radix = conversion.ToInteger(radix);
    var result;
    if ( typeof thisArg.value === 'number') {
        result = thisArg.value.toString(radix.value);
        return new Value(result, lub(thisArg.label, radix.label));
    }
    else {
        result = thisArg.value.PrimitiveValue.toString(radix.value);
        return new Value(result, lub(thisArg.value.PrimitiveLabel, radix.label));
    }

  };

  // ------------------------------------------------------------
  // toLocaleString, 15.7.4.3
  var toLocaleString = function(thisArg,args) { 
    var O = conversion.ToObject(thisArg);
    var result = O.value.PrimitiveValue.toLocaleString();
    return new Value(result, O.value.PrimitiveLabel);
  }  

  // ------------------------------------------------------------
  // valueOf, 15.7.4.4
  var valueOf = function(thisArg,args) {

    if ( ! (typeof thisArg.value === 'number' || (thisArg.value !== null  && typeof thisArg.value === 'object' && thisArg.value.Class === 'Number'))) {
      monitor.Throw(
        error.TypeErrorObject,
        'Number.prototype.valueOf is not generic',
        thisArg.label
      );
    }

    if (typeof thisArg.value === 'number') {
      return thisArg;
    }

    var result = thisArg.value.PrimitiveValue.valueOf();
    return new Value(result, thisArg.value.PrimitiveLabel);
  };

  // ------------------------------------------------------------
  // toFixed, 15.7.4.5
  var toFixed = function(thisArg,args) {
    var precision = args[0] ? conversion.ToInteger(args[0]) : new Value(undefined,bot);
    conversion.CheckObjectCoercible(thisArg);
    var _this = conversion.ToObject(thisArg);
    return new Value(_this.value.PrimitiveValue.toFixed(precision.value), lub(precision.label, _this.label));
  };

  // ------------------------------------------------------------
  // toExponential, 15.7.4.6
  var toExponential = function(thisArg,args) {
    var precision = args[0] ? conversion.ToInteger(args[0]) : new Value(undefined,bot);
    conversion.CheckObjectCoercible(thisArg);
    var _this = conversion.ToObject(thisArg);
    return new Value(_this.value.PrimitiveValue.toExponential(precision.value), lub(precision.label, _this.label));
  };

  // ------------------------------------------------------------
  // toPrecision, 15.7.4.7
  var toPrecision = function(thisArg,args) {
    var precision = args[0] ? args[0] : new Value(undefined,bot);
    var lbl = lub(precision.label, thisArg.label);
    if (precision.value === undefined) {
        var strX = conversion.ToString(thisArg); //step 2
        return new Value(strX.value,lbl);
    }
    var p = conversion.ToInteger(precision); //step 3
    if (thisArg.value === NaN) return new Value('NaN', lbl); //step 4

    return new Value(thisArg.value.toPrecision(precision.value), lbl);
  };


  // ------------------------------------------------------------
  // Number Object, 15.7.5

  function NumberObject(val,lbl) {
    Ecma.call(this);

    this.Class          = 'Number';
    this.PrimitiveValue = new Number(val);
    this.PrimitiveLabel = lbl;
    this.Extensible     = true;
    this.Prototype      = new Value(monitor.instances.NumberPrototype,bot);
  };
  
  prelude.inherits(NumberObject,Ecma);

  // ---

  NumberObject.prototype.toNative = function(deep) {
    var v = new Number(this.PrimitiveValue);
    return new Value(v, this.PrimitiveLabel);
  };

  // ---
  return module;
};

