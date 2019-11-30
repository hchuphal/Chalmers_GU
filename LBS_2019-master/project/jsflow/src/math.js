/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// 15.8
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
  var Unimplemented   = _function.Unimplemented;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.allocate = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var mathObject = new MathObject(host.Math);
    return { MathObject : mathObject };
  }

  // ------------------------------------------------------------
  // The Math Object, 15.8.2

  function MathObject(host) {
    Ecma.call(this);
    
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Math';
    // not mandated by standard
    this.Extensible = true; 
    this.host       = host;

    ecma.DefineFFF(this,constants.length, 1);
    ecma.DefineFFF(this,constants.prototype, monitor.instances.ObjectPrototype);

    ecma.DefineFFF(this, constants.E, this.host.E);
    ecma.DefineFFF(this, constants.LN10, this.host.LN10);
    ecma.DefineFFF(this, constants.LN2, this.host.LN2);
    ecma.DefineFFF(this, constants.LOG2E, this.host.LOG2E);
    ecma.DefineFFF(this, constants.LOG10E, this.host.LOG10E);
    ecma.DefineFFF(this, constants.PI, this.host.PI);
    ecma.DefineFFF(this, constants.SQRT1_2, this.host.SQRT1_2);
    ecma.DefineFFF(this, constants.SQRT2, this.host.SQRT2);
    
    ecma.DefineTFT(this, constants.abs   , new BiFO(abs   , 1, this.host.abs));
    ecma.DefineTFT(this, constants.acos  , new BiFO(acos  , 1, this.host.acos));
    ecma.DefineTFT(this, constants.asin  , new BiFO(asin  , 1, this.host.asin));
    ecma.DefineTFT(this, constants.atan  , new BiFO(atan  , 1, this.host.atan));
    ecma.DefineTFT(this, constants.atan2 , new BiFO(atan2 , 2, this.host.atan2));
    ecma.DefineTFT(this, constants.ceil  , new BiFO(ceil  , 1, this.host.ceil));
    ecma.DefineTFT(this, constants.cos   , new BiFO(cos   , 1, this.host.cos));
    ecma.DefineTFT(this, constants.exp   , new BiFO(exp   , 1, this.host.exp));
    ecma.DefineTFT(this, constants.floor , new BiFO(floor , 1, this.host.floor));
    ecma.DefineTFT(this, constants.log   , new BiFO(log   , 1, this.host.log));
    ecma.DefineTFT(this, constants.max   , new BiFO(max   , 2, this.host.max));
    ecma.DefineTFT(this, constants.min   , new BiFO(min   , 2, this.host.min));
    ecma.DefineTFT(this, constants.pow   , new BiFO(pow   , 2, this.host.pow));
    ecma.DefineTFT(this, constants.random, new BiFO(random, 0, this.host.random));
    ecma.DefineTFT(this, constants.round , new BiFO(round , 1, this.host.round));
    ecma.DefineTFT(this, constants.sin   , new BiFO(sin   , 1, this.host.sin));
    ecma.DefineTFT(this, constants.sqrt  , new BiFO(sqrt  , 1, this.host.sqrt));
    ecma.DefineTFT(this, constants.tan   , new BiFO(tan   , 1, this.host.tan));
  }

  prelude.inherits(MathObject,Ecma);

  // ------------------------------------------------------------
  // abs, 15.8.2.1
  var abs = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.abs(x.value), x.label);
  };

  // ------------------------------------------------------------
  // acos, 15.8.2.2
  var acos = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.acos(x.value), x.label);
  };

  // ------------------------------------------------------------
  // asin, 15.8.2.3
  var asin = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.asin(x.value), x.label);
  };

  // ------------------------------------------------------------
  // atan, 15.8.2.4
  var atan = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.atan(x.value), x.label);
  };

  // ------------------------------------------------------------
  // atan2, 15.8.2.5
  var atan2 = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    var y = args[1] ? conversion.ToNumber(args[1]) : new Value(undefined,bot);
    return new Value(_this.host.atan2(x.value,y.value), lub(x.label, y.label));
  };

  // ------------------------------------------------------------
  // ceil, 15.8.2.6
  var ceil = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.ceil(x.value), x.label);
  };

  // ------------------------------------------------------------
  // cos, 15.8.2.7
  var cos = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.cos(x.value), x.label);
  };

  // ------------------------------------------------------------
  // exp, 15.8.2.8
  var exp = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.exp(x.value), x.label);
  };

  // ------------------------------------------------------------
  // floor, 15.8.2.9
  var floor = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.floor(x.value), x.label);
  };

  // ------------------------------------------------------------
  // log, 15.8.2.10
  var log = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.log(x.value), x.label);
  };

  // ------------------------------------------------------------
  // max, 15.8.2.11
  var max = function(thisArg,args) {
    var _this = thisArg.value;
    if (args.length===0) return new Value(Number.NEGATIVE_INFINITY,bot);
    var myArgs=[];
    var l=bot;
    for (var i = 0; i < args.length; i++){
               myArgs[i] = args[i].value;
               l = lub(l,args[i].label);
               }
    return new Value(_this.host.max.apply(null,myArgs), l);
  };

  // ------------------------------------------------------------
  // min, 15.8.2.12
  var min = function(thisArg,args) {
    var _this = thisArg.value;
    if (args.length===0) return new Value(Number.POSITIVE_INFINITY,bot);
    var myArgs=[];
    var l=bot;
    for (var i = 0; i < args.length; i++){
               myArgs[i] = args[i].value;
               l = lub(l,args[i].label);
               }
    return new Value(_this.host.min.apply(null,myArgs), l);
  };

  // ------------------------------------------------------------
  // pow, 15.8.2.13
  var pow = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    var y = args[1] ? conversion.ToNumber(args[1]) : new Value(undefined,bot);
    return new Value(_this.host.pow(x.value,y.value), lub(x.label, y.label));
  };

  // ------------------------------------------------------------
  // random, 15.8.2.14
  var random = function(thisArg,args) {
    var _this = thisArg.value;
    return new Value(_this.host.random(), bot);
  };

  // ------------------------------------------------------------
  // round, 15.8.2.15
  var round = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.round(x.value), x.label);
  };

  // ------------------------------------------------------------
  // sin, 15.8.2.16
  var sin = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.sin(x.value), x.label);
  };

  // ------------------------------------------------------------
  // sqrt, 15.8.2.17
  var sqrt = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.sqrt(x.value), x.label);
  };

  // ------------------------------------------------------------
  // tan, 15.8.2.18
  var tan = function(thisArg,args) {
    var _this = thisArg.value;
    var x = args[0] ? conversion.ToNumber(args[0]) : new Value(undefined,bot);
    return new Value(_this.host.tan(x.value), x.label);
  };

  return module;
};

