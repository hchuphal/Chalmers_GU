/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var prelude         = monitor.require('prelude');
  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var _               = monitor.require('underscore');
  var ecma            = monitor.require('ecma');
  var _function       = monitor.require('function');

  var BiFO            = _function.BuiltinFunctionObject;
  var Value           = monitor.require('values').Value;

  var Label           = label.Label;
  var lub             = label.lub;
  var glb             = label.glb;
  var le              = label.le;

  var bot             = Label.bot;

  // ------------------------------------------------------------
  
  var module = {};
  module.RegExpObject = RegExpObject;
  module.allocate     = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var regExpConstructor = new RegExpConstructor(host.RegExp);
    var regExpPrototype   = regExpConstructor._proto;
    return { RegExpConstructor : regExpConstructor,
             RegExpPrototype   : regExpPrototype
           };
  }

  // ------------------------------------------------------------
  // The RegExp Constructor, 15.10.5

  function RegExpConstructor(host) {
    ecma.Ecma.call(this);
    
    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Function';
    // not mandated by standard
    this.Extensible = true;
    this.host       = host;
    this._proto     = new RegExpPrototype(this, host.prototype);



    ecma.DefineFFF(this,constants.length,2);
    ecma.DefineFFF(this,constants.prototype,this._proto);
  }

  prelude.inherits(RegExpConstructor,ecma.Ecma);
  RegExpConstructor.prototype.HasInstance = _function.HasInstance;

  // 15.10.3.1
  RegExpConstructor.prototype.Call = function(thisArg,args) {
    var pattern = args[0] || new Value(undefined,bot);
    var flags   = args[1] || new Value(undefined,bot);

    if ( pattern.value &&
         typeof pattern.value === 'object' && 
         pattern.value.Class === 'RegExp'  &&
         flags.value === undefined
       ) 
    {
      return pattern;
    }

    return RegExpConstructor.prototype.Construct(args);
  };

  // 15.10.4.1
  RegExpConstructor.prototype.Construct = function(args) {
    var c = monitor.context;

    var pattern = args[0] || new Value(undefined,bot);
    var flags   = args[1] || new Value(undefined,bot);

    var P  = "";
    var F  = "";
    
    var l = lub(pattern.label, flags.label);
    c.pushPC(l);

      if (pattern.value && 
          typeof pattern.value === 'object' && 
          pattern.value.Class === 'RegExp') {
        if (flags.value === undefined) {
          var rx = pattern.value.PrimitiveValue; 
          P = rx.source;
          F = (rx.global ? 'g' : '') + (rx.ignoreCase ? 'i' : '') + (rx.multiline ? 'm' : '');
        }
        else {
          monitor.Throw(
            monitor.modules.error.TypeErrorObject,
            '',
            bot
          );
        } 
      } else {
        var _P = pattern.value === undefined ? new Value("",l) : conversion.ToString(pattern);
        var _F = flags.value === undefined ? new Value("",l) : conversion.ToString(flags);

        l  = lub(l,_P.label,_F.label);
        P = _P.value;
        F = _F.value;
      }

      var res = new RegExpObject(new RegExp(P,F),l);

    c.popPC();
    return new Value(res,bot);
  };
  
  // ------------------------------------------------------------
  // The RegExp Prototype, 15.10.6
  function RegExpPrototype(constructor, host) {
    ecma.Ecma.call(this);
    this.Class          = 'RegExp';
    this.Prototype      = new Value(monitor.instances.ObjectPrototype,bot);

    this.host           = host;

    ecma.DefineFFF(this , constants.source      , '');
    ecma.DefineFFF(this , constants.global      , false);
    ecma.DefineFFF(this , constants.ignoreCase  , false);
    ecma.DefineFFF(this , constants.multiline   , false);
    ecma.DefineTFF(this , constants.lastIndex   , 0);

    ecma.DefineFFF(this , constants.length      , 0);
    ecma.DefineTFT(this , constants.constructor , constructor);

    ecma.DefineTFT(this , constants.exec        , new BiFO(exec     , 1 , RegExp.prototype.exec));
    ecma.DefineTFT(this , constants.test        , new BiFO(test     , 1 , RegExp.prototype.test));
    ecma.DefineTFT(this , constants.toString    , new BiFO(toString , 0 , RegExp.prototype.toString));
  }

  prelude.inherits(RegExpPrototype,ecma.Ecma);


  // ------------------------------------------------------------
  // exec, 15.10.6.2
  var exec = function(thisArg,args){
    var string = args[0] || new Value(undefined,bot);
    var S         = conversion.ToString(string);

    var lastIndex = conversion.ToInteger(thisArg.Get(constants.lastIndex));

    var pre = thisArg.value.PrimitiveValue;
    pre.lastIndex = lastIndex.value;

    var res = pre.exec(S.value);
  
    var l = lub(thisArg.label, S.label, lastIndex.label);

    if (res === null) {
      return new Value(null,l);
    }

    thisArg.Put(constants.lastIndex, new Value(pre.lastIndex,l));

    var array = monitor.modules.array.ArrayObject.fromArray(res,l,l);

    array.DefineOwnProperty(constants.index, 
      { value        : res.index,
        writable     : true,
        enumerable   : true,
        configurable : true,
        label        : l
      }
    );

    array.DefineOwnProperty(constants.input,
      { value        : res.input,
        writable     : true,
        enumerable   : true,
        configurable : true,
        label        : l
      }
    );

    return new Value(array,bot);
  };

  // ------------------------------------------------------------
  // test, 15.10.6.3
  var test = function(thisArg,args){
    var res = exec(thisArg,args);
    return new Value(res.value !== null, res.label);
  };

  // ------------------------------------------------------------
  // toString, 15.10.6.3
  var toString = function(thisArg,args){
        return new Value(thisArg.value.PrimitiveValue.toString(),thisArg.label); 
  };

  // ------------------------------------------------------------
  // RegExp Object, 15.10.4.1

  function RegExpObject(nativeRegExp, l) {
    ecma.Ecma.call(this);

    this.Class          = 'RegExp';
    this.PrimitiveValue = nativeRegExp;
    this.PrimitiveLabel = l;

    this.Extensible     = true;
    this.Prototype      = new Value(monitor.instances.RegExpPrototype,bot);

    this.DefineOwnProperty(constants.source,
      { value        : this.PrimitiveValue.source,
        writable     : false,
        enumerable   : false,
        configurable : false,
        label        : l
      }
    );

    this.DefineOwnProperty(constants.global,
      { value        : this.PrimitiveValue.global,
        writable     : false,
        enumerable   : false,
        configurable : false,
        label        : l
      }
    );

    this.DefineOwnProperty(constants.ignoreCase,
      { value        : this.PrimitiveValue.ignoreCase,
        writable     : false,
        enumerable   : false,
        configurable : false,
        label        : l
      }
    );

    this.DefineOwnProperty(constants.multiline,
      { value        : this.PrimitiveValue.multiline,
        writable     : false,
        enumerable   : false,
        configurable : false,
        label        : l
      }
    );

    this.DefineOwnProperty(constants.lastIndex,
      { value        : this.PrimitiveValue.lastIndex,
        writable     : true,
        enumerable   : false,
        configurable : false,
        label        : l
      }
    );


  }
  
  prelude.inherits(RegExpObject,ecma.Ecma);

  RegExpObject.prototype.toString = function() {
    var v = this.PrimitiveValue.toString();
    return v;
  };

  return module;
};

