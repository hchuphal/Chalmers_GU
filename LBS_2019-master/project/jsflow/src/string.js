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
  module.StringObject = StringObject;
  module.allocate = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var stringConstructor = new StringConstructor(host.String);
    var stringPrototype   = stringConstructor._proto;

    return { StringConstructor : stringConstructor,
             StringPrototype   : stringPrototype 
           };
  }

  // ------------------------------------------------------------
  // The String Constructor, 15.5.2

  function StringConstructor(host) {
    Ecma.call(this);
    
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Function';
    // not mandated by standard
    this.Extensible = true;

    this.host       = host;
    this._proto     = new StringPrototype(this, host.prototype);

    ecma.DefineFFF(this, constants.length,1);
    ecma.DefineFFF(this, constants.prototype   ,this._proto);
    ecma.DefineTFT(this, constants.fromCharCode, new BiFO(fromCharCode , 1, this.host.fromCharCode));
  }

  prelude.inherits(StringConstructor,Ecma);
  StringConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.5.1.1 -----------------------------------------------------------------
  StringConstructor.prototype.Call = function(thisArg,args) {

    if (!args[0]) {
      return new Value('',bot);
    }

    var str = conversion.ToString(args[0]);
    return str;
  };

  // 15.5.2.1 ----------------------------------------------------------------- 
  StringConstructor.prototype.Construct = function(args) {
    var value = args[0];

    var str;
    if (value) {
      var x = conversion.ToString(value);
      str = new StringObject(x.value, x.label);
    } else {
      str = new StringObject('');
    }
    return new Value(str,bot);
  };
  
  // --------------------------------------------------------------------------
  // fromCharCode, 15.5.3.2 
  var fromCharCode = function(thisArg, args) {

    var lbl   = new Label();
    var _args = [];
    for (var i = 0, len = args.length; i < len; i++) {
      var arg = conversion.ToUInt16(args[i]);
      lbl.lub(arg.label);
      _args[i] = arg.value;
    }   

    var _String = monitor.instances.StringConstructor.host;
    var v = _String.fromCharCode.apply(_String,_args);
    return new Value(v,lbl);
  };

  // ------------------------------------------------------------
  // The String Prototype, 15.5.4
  function StringPrototype(constructor) {
    Ecma.call(this);
    this.Class          = 'String';
    this.PrimitiveValue = '';
    this.PrimitiveLabel = bot;
    this.Prototype      = new Value(monitor.instances.ObjectPrototype,bot);


    this.properties     = new String('');
    this.labels.length  = {
      value     : bot,
      existence : bot
    };

    this.host           = constructor.host.prototype;

    ecma.DefineTFT(this, constants.constructor       ,constructor);
    ecma.DefineTFT(this, constants.toString         , new BiFO(toString         , 0, this.host.toString));
    ecma.DefineTFT(this, constants.valueOf          , new BiFO(valueOf          , 0, this.host.valueOf));
    ecma.DefineTFT(this, constants.charAt           , new BiFO(charAt           , 1, this.host.charAt));
    ecma.DefineTFT(this, constants.charCodeAt       , new BiFO(charCodeAt       , 1, this.host.charCodeAt));
    ecma.DefineTFT(this, constants.concat           , new BiFO(concat           , 1, this.host.concat));
    ecma.DefineTFT(this, constants.indexOf          , new BiFO(indexOf          , 1, this.host.indexOf));
    ecma.DefineTFT(this, constants.lastIndexOf      , new BiFO(lastIndexOf      , 1, this.host.lastIndexOf));
    ecma.DefineTFT(this, constants.localeCompare    , new BiFO(localeCompare    , 1, this.host.localeCompare));
    ecma.DefineTFT(this, constants.match            , new BiFO(match            , 1, this.host.match));
    ecma.DefineTFT(this, constants.replace          , new BiFO(replace          , 2, this.host.replace));
    ecma.DefineTFT(this, constants.search           , new BiFO(search           , 1, this.host.search));
    ecma.DefineTFT(this, constants.slice            , new BiFO(slice            , 2, this.host.slice));
    ecma.DefineTFT(this, constants.split            , new BiFO(split            , 2, this.host.split));
    ecma.DefineTFT(this, constants.substring        , new BiFO(substring        , 2, this.host.substring));
    ecma.DefineTFT(this, constants.toLowerCase      , new BiFO(toLowerCase      , 0, this.host.toLowerCase));
    ecma.DefineTFT(this, constants.toLocaleLowerCase, new BiFO(toLocaleLowerCase, 0, this.host.toLocaleLowerCase));
    ecma.DefineTFT(this, constants.toUpperCase      , new BiFO(toUpperCase      , 0, this.host.toUpperCase));
    ecma.DefineTFT(this, constants.toLocaleUpperCase, new BiFO(toLocaleUpperCase, 0, this.host.toLocaleUpperCase));
    ecma.DefineTFT(this, constants.trim             , new BiFO(trim             , 0, this.host.trim));

    ecma.DefineTFT(this, constants.substr           , new BiFO(substr           , 2, this.host.substr));

  }

  prelude.inherits(StringPrototype,Ecma);

  // ------------------------------------------------------------
  // toString, 15.5.4.2
  var toString = function(thisArg,args) {

    if (typeof thisArg.value === 'string') {
      return thisArg;
    }

    if (typeof thisArg.value !== 'object' || thisArg.value.Class !== 'String') 
    {
      monitor.Throw(
        error.TypeErrorObject,
        'String.prototype.toString is not generic',
        thisArg.label
      );
    }

    var result = thisArg.value.PrimitiveValue.toString();
    return new Value(result, thisArg.value.PrimitiveLabel);
  };

  // ------------------------------------------------------------
  // valueOf, 15.5.4.3
  var valueOf = toString;

  // ------------------------------------------------------------
  // charAt, 15.5.4.4
  var charAt = function(thisArg,args) {
    var pos = args[0] || new Value(undefined,bot);
    conversion.CheckObjectCoercible(thisArg);
    var S        = conversion.ToString(thisArg);
    var position = conversion.ToInteger(pos);

    var c = S.value.charAt(position.value);
    return new Value(c,lub(position.label,S.label));
  };

  // ------------------------------------------------------------
  // charCodeAt, 15.5.4.5
  var charCodeAt = function(thisArg, args) {
    var pos = args[0] || new Value(undefined,bot);
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var position = conversion.ToInteger(pos);

    var c = S.value.charCodeAt(position.value);
    return new Value(c, lub(position.label, thisArg.label));
  };

  // ------------------------------------------------------------
  // concat, 15.5.4.6
  var concat = function(thisArg, args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var lbl = new Label();
    var _args = [];
    for (var i = 0, len = args.length; i < len; i++) {
      var arg = conversion.ToString(args[i]); 
      lbl.lub(arg.label);
      _args[i] = arg.value;
    }
    var str = S.value.concat.apply(S.value, _args);
    lbl.lub(thisArg.label);
    return new Value(str, lbl);
  };

  // ------------------------------------------------------------
  // indexOf, 15.5.4.7
  var indexOf = function(thisArg, args) {
    var searchString = args[0] || new Value(undefined,bot);
    var position     = args[1] || new Value(0,bot);
    
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var searchStr = conversion.ToString(searchString);
    var pos = conversion.ToInteger(position);
  
    var lbl = lub(S.label,searchStr.label,pos.label);
    var str = S.value.indexOf(searchStr.value,pos.value);

    return new Value(str,lbl);
  };

  // ------------------------------------------------------------
  // lastIndexOf, 15.5.4.8
  var lastIndexOf = function(thisArg, args) {
    var searchString = args[0] || new Value(undefined,bot);
    var position     = args[1] || new Value(undefined,bot);
    
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var searchStr = conversion.ToString(searchString);
    var pos = conversion.ToInteger(position);
  
    var lbl = lub(S.label,searchStr.label,pos.label);
    var str = S.value.lastIndexOf(searchStr.value,pos.value);

    return new Value(str,lbl);
  };

  // ------------------------------------------------------------
  // localeCompare, 15.5.4.9
  var localeCompare = function(thisArg, args) {
    var that = args[0] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    that = conversion.ToString(that);
   
    var lbl = lub(S.label,that.label);
    var result = S.value.localeCompare(that.value);
    
    return new Value(result,lbl);
  };

  // ------------------------------------------------------------
  // match, 15.5.4.10
  var match = function(thisArg,args) {
    var regexp = args[0] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);

    var rx = regexp;
    if (rx.value === null || typeof rx.value !== 'object'  || rx.value.Class !== 'RegExp') {
      rx = monitor.instances.RegExpConstructor.Construct([regexp]);
    }

    var lbl = lub(S.label, rx.value.PrimitiveLabel);
    monitor.assert(
      le(rx.label, rx.value.PrimitiveLabel),
      'String.prototype.match: label of regular expression object not below regular expression label'
    );

    rx.value.PrimitiveLabel = lbl;
    var primitiveArray = S.value.match(rx.value.PrimitiveValue);
    
    if (primitiveArray === null) {
      return new Value(null,lbl);
    }

    var array = monitor.modules.array.ArrayObject.fromArray(primitiveArray,lbl,lbl);

    array.DefineOwnProperty(constants.index, 
      { value        : primitiveArray.index,
        writable     : true,
        enumerable   : true,
        configurable : true,
        label        : lbl
      }
    );

    array.DefineOwnProperty(constants.input,
      { value        : primitiveArray.input,
        writable     : true,
        enumerable   : true,
        configurable : true,
        label        : lbl
      }
    );

    return new Value(array, bot);
  };

  // ------------------------------------------------------------
  // replace, 15.5.4.11
  var replace = function(thisArg, args) {
    var searchValue  = args[0] || new Value(undefined, bot);
    var replaceValue = args[1] || new Value(undefined, bot);
    
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    
    var sV, rV;

    if (typeof searchValue.value === 'object' && searchValue.value.Class === 'RegExp') {
      sV = searchValue.value.PrimitiveValue;
    } else { 
      searchValue = conversion.ToString(searchValue);
      sV = searchValue.value;
    }

    var fL = bot;

    if (typeof replaceValue.value === 'object' && replaceValue.value.Class === 'Function') {
      rV = function() {
        var l = lub(searchValue.label, replaceValue.label);
        var _args = {};
        for (var i = 0 ; i < arguments.length; i++) {
          _args[i] = new Value(arguments[i],l);
        }
        _args.length = arguments.length;
        var res = replaceValue.Call(replaceValue,_args);
        fL = lub(fL,res.label);
        return res.value;
      };
    } else {
      replaceValue = conversion.ToString(replaceValue);
      rV = replaceValue.value;
    }

    var l   = lub(searchValue.label, replaceValue.label);
    var res = S.value.replace(sV,rV);

    return new Value(res, lub(l, fL));
  };

  // ------------------------------------------------------------
  // search, 15.5.4.12
  var search =  function(thisArg, args) {
    var regexp = args[0] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg); 
    var string = conversion.ToString(thisArg);

    var rx = regexp;
    if (rx.value === null || typeof regexp.value !== 'object' || regexp.value.Class !== 'RegExp') {
      rx = monitor.instances.RegExpConstructor.Construct([regexp]); 
    }

    var lbl = lub(string.label, rx.value.PrimitiveLabel);
    monitor.assert(
      le(rx.label, rx.value.PrimitiveLabel),
      'String.prototype.match: label of regular expression object not below regular expression label'
    );

    rx.value.PrimitiveLabel = lbl;
    var result = string.value.search(rx.value.PrimitiveValue);
    
    return new Value(result, lbl);
  };

  // ------------------------------------------------------------
  // slice, 15.5.4.13
  var slice = function(thisArg,args) {
    var c = monitor.context;

    var start = args[0] || new Value(undefined,bot);
    var end = args[1] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg); 
    var S = conversion.ToString(thisArg);
    var len = S.value.length;

    var intStart = conversion.ToInteger(start);

    c.pushPC(end.label);
      if (end.value === undefined) {
        end = new Value(len, lub(S.label, end.label));
      } else {
        end = conversion.ToInteger(end);
      }
    c.popPC();

    var str = S.value.slice(start.value, end.value);
    var lbl = lub(S.label,start.label,end.label);
    return new Value(str,lbl);
  };
    

  // ------------------------------------------------------------
  // split, 15.5.4.14
  var split = function(thisArg,args){
    var separator = args[0] || new Value(undefined,bot);
    var limit     = args[1] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg); 
    var S = conversion.ToString(thisArg);
   
    var sep;
    var lbl = lub(S.label,separator.label);

    if (separator.value && typeof separator.value === 'object' && separator.value.Class === 'RegExp') {
      sep = separator.value.PrimitiveValue;

      monitor.assert(
        le(separator.label, separator.value.PrimitiveLabel),
        'String.prototype.split: label of regular expression object not below label of regular expression'
      );

      separator.value.PrimitiveLabel = lbl;
    } else {
      separator = conversion.ToString(separator);
      sep = separator.value;
      lbl.lub(separator.label);
    }

    lbl.lub(limit.label);
    var primitiveArray = S.value.split(sep, limit.value);
    var array = monitor.modules.array.ArrayObject.fromArray(primitiveArray,lbl,lbl);
    return new Value(array,bot);
  };

  // ------------------------------------------------------------
  // substring, 15.5.4.15
  var substring = function(thisArg,args){
    var start = args[0] || new Value(undefined,bot);
    var end   = args[1] || new Value(undefined,bot);

    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);

    start = conversion.ToInteger(start);

    var len = S.value.length;
  
    if (end.value === undefined) {
      end.value = len;
    } else {
      end = conversion.ToInteger(end);
    }

    var lbl = lub(S.label,start.label,end.label);
    var str = S.value.substring(start.value,end.value);
    return new Value(str,lbl);
  };

  // ------------------------------------------------------------
  var substr = function(thisArg,args){
    var start  = args[0] || new Value(undefined,0);
    var length = args[1] || new Value(undefined,0);

    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);

    start = conversion.ToInteger(start);
    if (length,value === undefined) {
      length.value = len;
    } else {
      length = conversion.ToInteger(length);
    }

    var lbl = lub(S.label,start.label,length.label);
    var str = S.value.substr(start.value,length.value);

    return new Value(str,lbl);
  };

  // ------------------------------------------------------------
  // toLowerCase, 15.5.4.16
  var toLowerCase = function(thisArg,args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var L = S.value.toLowerCase();
    return new Value(L,S.label);
  };

  // ------------------------------------------------------------
  // toLocaleLowerCase, 15.5.4.17
  var toLocaleLowerCase = function(thisArg,args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var L = S.value.toLocaleLowerCase();
    return new Value(L,S.label);
  };

  // ------------------------------------------------------------
  // toUpperCase, 15.5.4.18
  var toUpperCase = function(thisArg,args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var L = S.value.toUpperCase();
    return new Value(L,S.label);
  };

  // ------------------------------------------------------------
  // toLocaleUpperCase, 15.5.4.19
  var toLocaleUpperCase = function(thisArg,args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var L = S.value.toLocaleUpperCase();
    return new Value(L,S.label);
  };

  // ------------------------------------------------------------
  // trim, 15.5.4.20
  var trim = function(thisArg, args) {
    conversion.CheckObjectCoercible(thisArg);
    var S = conversion.ToString(thisArg);
    var T = S.value.trim();
    return new Value(T,S.label);
  };
    

  // ------------------------------------------------------------
  // String Object, 15.5.5

  function StringObject(val, lbl) {
    Ecma.call(this);

    this.Class          = 'String';
    this.PrimitiveValue = val;
    
    lbl = lbl || bot;
    this.PrimitiveLabel = lbl;

    this.properties     = new String(val);
    for (var i = 0, len = val.length; i < len; i++) {
      this.labels[i] = {
        value : lbl,
        existence : lbl
      };
    }

    this.labels.length = {
      value : lbl,
      existence : lbl
    };

    this.Extensible     = true;
    this.Prototype      = new Value(monitor.instances.StringPrototype,bot);

    // length is not modeled in this way, but by GetOwnProperty; however, e.g.,
    // delete will use the properties field for deletion. Thus, we add a fake model.
 //   ecma.DefineFFF(this, constants.length, 0);

  }
  
  prelude.inherits(StringObject,Ecma);

  // ---

  // TODO: we don't copy other properties on the Strings

  StringObject.prototype.toNative = function(deep) {
    var v = new String(this.properties);
    return new Value(v, this.PrimitiveLabel);
  };

  // ---

  return module;
};

