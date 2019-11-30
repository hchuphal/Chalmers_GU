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
  var top             = Label.top;

  // ------------------------------------------------------------

  var module = {};
  module.DateObject = DateObject;
  module.allocate = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var dateConstructor = new DateConstructor(host.Date);
    var datePrototype   = dateConstructor._proto;

    return { DateConstructor : dateConstructor,
             DatePrototype   : datePrototype 
           };
  }

  // ------------------------------------------------------------
  // The Date Constructor, 15.9.3

  function DateConstructor(host) {
    Ecma.call(this);

    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Function';
    this.Extensible = true;
    this._proto     = new DatePrototype(this, host);

    this.host       = host;

    ecma.DefineFFF(this , constants.length    , 7);
    ecma.DefineFFF(this , constants.prototype , this._proto);

    ecma.DefineTFT(this , constants.parse     , new BiFO(parse  , 0 , Date.parse));
    ecma.DefineTFT(this , constants.UTC       , new BiFO(UTC    , 0 , Date.UTC));
    ecma.DefineTFT(this , constants.now       , new BiFO(now    , 0 , Date.now));
  }

  prelude.inherits(DateConstructor,Ecma);
  DateConstructor.prototype.HasInstance = _function.HasInstance;

  //----------------------------------------------------
  // 15.9.1.1
  DateConstructor.prototype.Call = function(thisArg,args) {
    var str = monitor.instances.DateConstructor.host();
    return new Value(str,bot);
  };

  //----------------------------------------------------

  // 15.9.3.1
  DateConstructor.prototype.Construct = function(args) {
    var _args = [];
    var label = new Label();
    var obj;
    var _Date = monitor.instances.DateConstructor.host;

    switch (args.length) {

      case 0 :
        obj = new DateObject(new _Date(), top);
        
      break;

      case 1 :
        var v = conversion.ToPrimitive(args[0]);
        if (typeof v.value !== 'string') {
          v = conversion.ToNumber(v);
        }

        obj = new DateObject(new _Date(v.value), v.label);
      break;

      default :
        for (var i = 0, len = args.length; i < len; i++) {
          var val = conversion.ToNumber(args[i]);
          _args[i] = val.value;
          label.lub(val.label);
        }

        if (len == 2) {
          _args[2] = 1;
        }

        for (; i < 7; i++) {
          _args[i] = 0;
        }

        var date = new _Date( 
          _args[0], _args[1], _args[2], _args[3], _args[4], _args[5], _args[6]
        );

        obj = new DateObject(date,label);
    }

    return new Value(obj,bot);
  };
  
  // ------------------------------------------------------------
  // parse, 15.9.4.2
  function parse(thisArg,args) {
    var string = args[0] || new Value(undefined,bot);
    string = conversion.ToString(string);

    var number = monitor.instances.DateConstructor.host.parse(string.value);
    return new Value(number,string.label);
  }

  // ------------------------------------------------------------
  // UTC, 15.9.4.3
  function UTC(thisArg,args) {
    var _args = [];
    var label = new Label();

    for (var i = 0, len = args.length; i < len; i++) {
      var val = conversion.ToNumber(args[i]);
      _args[i] = val.value;
      label.lub(val.label);
    }

    var number = monitor.instances.DateConstructor.host.UTC.apply(null,_args);
    return new Value(number, label);
  }

  // ------------------------------------------------------------
  // now, 15.9.4.4
  function now(thisArg,args) {

    var number = monitor.instances.DateConstructor.host.now();
    return new Value(number, top);

  }

  // ------------------------------------------------------------
  // The Date Prototype, 15.9.5
  function DatePrototype(constructor, _Date) {
    Ecma.call(this);
    this.Class          = 'Date';
    this.PrimitiveValue = new Value(NaN,bot);
    this.Prototype      = new Value(monitor.instances.ObjectPrototype,bot);

    this.host           = _Date.prototype;

    ecma.DefineFFF(this , constants.length           , 0);
    ecma.DefineTFT(this , constants.constructor,constructor);
    ecma.DefineTFT(this , constants.toString           , new BiFO(toString           , 0, _Date.prototype.toString));
    ecma.DefineTFT(this , constants.toDateString       , new BiFO(toDateString       , 0, _Date.prototype.toDateString));
    ecma.DefineTFT(this , constants.toTimeString       , new BiFO(toTimeString       , 0, _Date.prototype.toTimeString));
    ecma.DefineTFT(this , constants.toLocaleString     , new BiFO(toLocaleString     , 0, _Date.prototype.toLocaleString));
    ecma.DefineTFT(this , constants.toLocaleDateString , new BiFO(toLocaleDateString , 0, _Date.prototype.toLocaleDateString));
    ecma.DefineTFT(this , constants.toLocaleTimeString , new BiFO(toLocaleTimeString , 0, _Date.prototype.toLocaleTimeString));
    ecma.DefineTFT(this , constants.valueOf            , new BiFO(valueOf            , 0, _Date.prototype.valueOf));
    ecma.DefineTFT(this , constants.getTime            , new BiFO(getTime            , 0, _Date.prototype.getTime));
    ecma.DefineTFT(this , constants.getFullYear        , new BiFO(getFullYear        , 0, _Date.prototype.getFullYear));
    ecma.DefineTFT(this , constants.getUTCFullYear     , new BiFO(getUTCFullYear     , 0, _Date.prototype.getUTCFullYear));
    ecma.DefineTFT(this , constants.getMonth           , new BiFO(getMonth           , 0, _Date.prototype.getMonth));
    ecma.DefineTFT(this , constants.getUTCMonth        , new BiFO(getUTCMonth        , 0, _Date.prototype.getUTCMonth));
    ecma.DefineTFT(this , constants.getDate            , new BiFO(getDate            , 0, _Date.prototype.getDate));
    ecma.DefineTFT(this , constants.getUTCDate         , new BiFO(getUTCDate         , 0, _Date.prototype.getUTCDate));
    ecma.DefineTFT(this , constants.getDay             , new BiFO(getDay             , 0, _Date.prototype.getDay));
    ecma.DefineTFT(this , constants.getUTCDay          , new BiFO(getUTCDay          , 0, _Date.prototype.getUTCDay));
    ecma.DefineTFT(this , constants.getHours           , new BiFO(getHours           , 0, _Date.prototype.getHours));
    ecma.DefineTFT(this , constants.getUTCHours        , new BiFO(getUTCHours        , 0, _Date.prototype.getUTCHours));
    ecma.DefineTFT(this , constants.getMinutes         , new BiFO(getMinutes         , 0, _Date.prototype.getMinutes));
    ecma.DefineTFT(this , constants.getUTCMinutes      , new BiFO(getUTCMinutes      , 0, _Date.prototype.getUTCMinutes));
    ecma.DefineTFT(this , constants.getSeconds         , new BiFO(getSeconds         , 0, _Date.prototype.getSeconds));
    ecma.DefineTFT(this , constants.getUTCSeconds      , new BiFO(getUTCSeconds      , 0, _Date.prototype.getUTCSeconds));
    ecma.DefineTFT(this , constants.getMilliseconds    , new BiFO(getMilliseconds    , 0, _Date.prototype.getMilliseconds));
    ecma.DefineTFT(this , constants.getUTCMilliseconds , new BiFO(getUTCMilliseconds , 0, _Date.prototype.getUTCMilliseconds));
    ecma.DefineTFT(this , constants.getTimezoneOffset  , new BiFO(getTimezoneOffset  , 0, _Date.prototype.getTimezoneOffset));
    ecma.DefineTFT(this , constants.setTime            , new BiFO(setTime            , 1, _Date.prototype.setTime));
    ecma.DefineTFT(this , constants.setMilliseconds    , new BiFO(setMilliseconds    , 0, _Date.prototype.setMilliseconds));
    ecma.DefineTFT(this , constants.setUTCMilliseconds , new BiFO(setUTCMilliseconds , 0, _Date.prototype.setUTCMilliseconds));
    ecma.DefineTFT(this , constants.setSeconds         , new BiFO(setSeconds         , 0, _Date.prototype.setSeconds));
    ecma.DefineTFT(this , constants.setUTCSeconds      , new BiFO(setUTCSeconds      , 0, _Date.prototype.setUTCSeconds));
    ecma.DefineTFT(this , constants.setMinutes         , new BiFO(setMinutes         , 0, _Date.prototype.setMinutes));
    ecma.DefineTFT(this , constants.setUTCMinutes      , new BiFO(setUTCMinutes      , 0, _Date.prototype.setUTCMinutes));
    ecma.DefineTFT(this , constants.setHours           , new BiFO(setHours           , 0, _Date.prototype.setHours));
    ecma.DefineTFT(this , constants.setUTCHours        , new BiFO(setUTCHours        , 0, _Date.prototype.setUTCHours));
    ecma.DefineTFT(this , constants.setDate            , new BiFO(setDate            , 0, _Date.prototype.setDate));
    ecma.DefineTFT(this , constants.setUTCDate         , new BiFO(setUTCDate         , 0, _Date.prototype.setUTCDate));
    ecma.DefineTFT(this , constants.setMonth           , new BiFO(setMonth           , 2, _Date.prototype.setMonth));
    ecma.DefineTFT(this , constants.setUTCMonth        , new BiFO(setUTCMonth        , 0, _Date.prototype.setUTCMonth));
    ecma.DefineTFT(this , constants.setFullYear        , new BiFO(setFullYear        , 0, _Date.prototype.setFullYear));
    ecma.DefineTFT(this , constants.setUTCFullYear     , new BiFO(setUTCFullYear     , 0, _Date.prototype.setUTCFullYear));
    ecma.DefineTFT(this , constants.toUTCString        , new BiFO(toUTCString        , 0, _Date.prototype.toUTCString));
    ecma.DefineTFT(this , constants.toISOString        , new BiFO(toISOString        , 0, _Date.prototype.toISOString));
    ecma.DefineTFT(this , constants.toJSON             , new BiFO(toJSON             , 0, _Date.prototype.toJSON));

    // B.2.6 - used by google analytics
    ecma.DefineTFT(this , new Value('toGMTString' , bot) , new BiFO(toUTCString , 0, _Date.prototype.toGTMString));
  }

  prelude.inherits(DatePrototype,Ecma);

  function assertDate(v, caller) {
    
    if (v.value === null || typeof v.value !== 'object' || v.value.Class !== 'Date') {
      monitor.context.pushPC(v.label);
      monitor.Throw(
        monitor.modules.error.TypeErrorObject,
        caller + ' is not generic',
        bot
      );
    }

  }

  // ------------------------------------------------------------
  
  function mkGenericGet(fname) {
    return function(thisArg, args) {
      assertDate(thisArg, fname);
      
      var label = lub(thisArg.label, thisArg.value.PrimitiveLabel);
      var date  = thisArg.value.PrimitiveValue;

      var value = date[fname].call(date);

      return new Value(value,label);
    };
  }

  // ------------------------------------------------------------

  function mkGenericSet(fname) {
    return function(thisArg,args) {
      assertDate(thisArg, fname);

      var context = lub(thisArg.label, monitor.context.effectivePC);

      monitor.assert(le(context, thisArg.value.PrimitiveLabel),
        fname + ': context ' + context + ' not below state label of Date object ' + thisArg.value.PrimitiveLabel
      );

      var _args = [];
      var label = new Label();

      for (var i = 0, len = args.length; i < len; i++) {
        var x = conversion.ToNumber(args[i]);
        label.lub(x.label);
        _args[i] = x.value;
      }

      thisArg.value.PrimitiveLabel = lub(thisArg.value.PrimitiveLabel, label);
      label = lub(thisArg.label, thisArg.value.PrimitiveLabel);

      var date  = thisArg.value.PrimitiveValue;
      var value = date[fname].apply(date, _args);

      return new Value(value,label);
    };
  }
  // ------------------------------------------------------------
  // toISOString, 15.9.5.43
  var toISOString = mkGenericGet('toISOString');

  // ------------------------------------------------------------
  // toString, 15.9.5.2
  var toString = mkGenericGet('toString');

  // ------------------------------------------------------------
  // toDateString, 15.9.5.?
  var toDateString = mkGenericGet('toDateString');
  
  // ------------------------------------------------------------
  // toTimeString, 15.9.5.?
  var toTimeString = mkGenericGet('toTimeString');
  
  // ------------------------------------------------------------
  // toLocaleString, 15.9.5.?
  var toLocaleString = mkGenericGet('toLocaleString');
  
  // ------------------------------------------------------------
  // toLocaleDateString, 15.9.5.?
  var toLocaleDateString = mkGenericGet('toLocaleDateString');
  
  // ------------------------------------------------------------
  // toLocaleTimeString, 15.9.5.?
  var toLocaleTimeString = mkGenericGet('toLocaleTimeString');
  
  // ------------------------------------------------------------
  // valueOf, 15.9.5.?
  function valueOf(thisArg, args) {
    assertDate(thisArg, 'valueOf');
    return new Value(thisArg.value.PrimitiveValue.valueOf(), thisArg.label);
  }
  
  // ------------------------------------------------------------
  // getTime, 15.9.5.9
  var getTime = mkGenericGet('getTime');
  
  // ------------------------------------------------------------
  // getFullYear, 15.9.5.?
  var getFullYear = mkGenericGet('getFullYear');
  
  // ------------------------------------------------------------
  // getUTCFullYear, 15.9.5.?
  var getUTCFullYear = mkGenericGet('getUTCFullYear');
  
  // ------------------------------------------------------------
  // getMonth, 15.9.5.?
  var getMonth = mkGenericGet('getMonth');

  // ------------------------------------------------------------
  // getUTCMonth, 15.9.5.?
  var getUTCMonth = mkGenericGet('getUTCMonth');
  
  // ------------------------------------------------------------
  // getDate, 15.9.5.?
  var getDate = mkGenericGet('getDate');

  // ------------------------------------------------------------
  // getUTCDate, 15.9.5.?
  var getUTCDate = mkGenericGet('getUTCDate');
  
  // ------------------------------------------------------------
  // getDay, 15.9.5.?
  var getDay = mkGenericGet('getDay');

  // ------------------------------------------------------------
  // getUTCDay, 15.9.5.?
  var getUTCDay = mkGenericGet('getUTCDay');
  
  // ------------------------------------------------------------
  // getHours, 15.9.5.?
  var getHours = mkGenericGet('getHours');
  
  // ------------------------------------------------------------
  // getUTCHours, 15.9.5.?
  var getUTCHours = mkGenericGet('getUTCHours');

  // ------------------------------------------------------------
  // getMinutes, 15.9.5.?
  var getMinutes = mkGenericGet('getMinutes');
  
  // ------------------------------------------------------------
  // getUTCMinutes, 15.9.5.?
  var getUTCMinutes = mkGenericGet('getUTCMinutes');

  // ------------------------------------------------------------
  // getSeconds, 15.9.5.?
  var getSeconds = mkGenericGet('getSeconds');
  
  // ------------------------------------------------------------
  // getUTCSeconds, 15.9.5.?
  var getUTCSeconds = mkGenericGet('getUTCSeconds');

  // ------------------------------------------------------------
  // getMilliseconds, 15.9.5.?
  var getMilliseconds = mkGenericGet('getMilliseconds');
  
  // ------------------------------------------------------------
  // getUTCMilliseconds, 15.9.5.?
  var getUTCMilliseconds = mkGenericGet('getUTCMilliseconds');
  
  // ------------------------------------------------------------
  // getTimezoneOffset, 15.9.5.?
  var getTimezoneOffset = mkGenericGet('getTimezoneOffset');

  // ------------------------------------------------------------
  // setTime, 15.9.5.?
  var setTime = mkGenericSet('setTime');

  // ------------------------------------------------------------
  // setMilliseconds, 15.9.5.?
  var setMilliseconds = mkGenericSet('setMilliseconds');

  // ------------------------------------------------------------
  // setUTCMilliseconds, 15.9.5.?
  var setUTCMilliseconds = mkGenericSet('setUTCMilliseconds');

  // ------------------------------------------------------------
  // setSeconds, 15.9.5.?
  var setSeconds = mkGenericSet('setSeconds');

  // ------------------------------------------------------------
  // setUTCSeconds, 15.9.5.?
  var setUTCSeconds = mkGenericSet('setUTCSeconds');

  // ------------------------------------------------------------
  // setMinutes, 15.9.5.?
  var setMinutes = mkGenericSet('setMinutes');

  // ------------------------------------------------------------
  // setUTCMinutes, 15.9.5.?
  var setUTCMinutes = mkGenericSet('setUTCMinutes');

  // ------------------------------------------------------------
  // setHours, 15.9.5.?
  var setHours = mkGenericSet('setHours');

  // ------------------------------------------------------------
  // setUTCHours, 15.9.5.?
  var setUTCHours = mkGenericSet('setUTCHours');

  // ------------------------------------------------------------
  // setDate, 15.9.5.?
  var setDate = mkGenericSet('setDate');

  // ------------------------------------------------------------
  // setUTCDate, 15.9.5.?
  var setUTCDate = mkGenericSet('setUTCDate');

  // ------------------------------------------------------------
  // setMonth, 15.9.5.?
  var setMonth = mkGenericSet('setMonth');

  // ------------------------------------------------------------
  // setUTCMonth, 15.9.5.?
  var setUTCMonth = mkGenericSet('setUTCMonth');

  // ------------------------------------------------------------
  // setFullYear, 15.9.5.?
  var setFullYear = mkGenericSet('setFullYear');

  // ------------------------------------------------------------
  // setUTCFullYear, 15.9.5.?
  var setUTCFullYear = mkGenericSet('setUTCFullYear');

  // ------------------------------------------------------------
  // toUTCString, 15.9.5.?
  var toUTCString = mkGenericGet('toUTCString'); 
  
  // ------------------------------------------------------------
  // toJSON, 15.9.5.?
  var toJSON = mkGenericGet('toJSON');

  // ------------------------------------------------------------
  // Date Object, 15.9.5

  function DateObject(date, label) {
    Ecma.call(this);

    this.Class          = 'Date';
    this.PrimitiveValue = date;
    this.PrimitiveLabel = label;
    this.Extensible     = true;
    this.Prototype      = new Value(monitor.instances.DatePrototype,bot);
  }

  prelude.inherits(DateObject,Ecma);

  return module;
};

