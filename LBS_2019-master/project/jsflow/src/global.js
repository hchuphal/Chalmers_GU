/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {
  
  var esprima    = monitor.require('esprima');

  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var _function       = monitor.require('function');
  var env             = monitor.require('env');
  var error           = monitor.require('error');

  var Value           = monitor.require('values').Value;

  var BiFO            = _function.BuiltinFunctionObject;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.GlobalObject = GlobalObject;
  module.allocate     = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var go = new GlobalObject(host);
    return { globalObject : go };
  }

  // ------------------------------------------------------------

  function GlobalObject(host) {
    ecma.Ecma.call(this);

    this.Class     = 'global';
    this.JSFClass  = 'GlobalObject';
    if (this.Prototype === undefined || this.Prototype.value === null) {
      this.Prototype = new Value(monitor.instances.ObjectPrototype, bot);
    }

    this.host = host;

    // 15.1.1
    ecma.DefineFFF(this, constants.NaN               , NaN);
    ecma.DefineFFF(this, constants['Infinity']       , Infinity);
    ecma.DefineFFF(this, constants['undefined']      , undefined);

    // 15.1.2
    ecma.DefineTFT(this, constants['eval']           , new BiFO(__eval               , 1, host.eval));
    ecma.DefineTFT(this, constants.parseInt          , new BiFO(__parseInt           , 2, host.parseInt));
    ecma.DefineTFT(this, constants.parseFloat        , new BiFO(__parseFloat         , 1, host.parseFloat));
    ecma.DefineTFT(this, constants.isNaN             , new BiFO(__isNaN              , 1, host.isNaN));
    ecma.DefineTFT(this, constants.isFinite          , new BiFO(__isFinite           , 1, host.isFinite));

    // 15.1.3
    ecma.DefineTFT(this, constants.decodeURI         , new BiFO(__decodeURI          , 1, host.decodeURI));
    ecma.DefineTFT(this, constants.decodeURIComponent, new BiFO(__decodeURIComponent , 1, host.decodeURIComponent));
    ecma.DefineTFT(this, constants.encodeURI         , new BiFO(__encodeURI          , 1, host.encodeURI));
    ecma.DefineTFT(this, constants.encodeURIComponent, new BiFO(__encodeURIComponent , 1, host.encodeURIComponent));

    // 15.1.4
    ecma.DefineTFT(this, constants.Object            , monitor.instances.ObjectConstructor);
    ecma.DefineTFT(this, constants.Function          , monitor.instances.FunctionConstructor);
    ecma.DefineTFT(this, constants.Array             , monitor.instances.ArrayConstructor);
    ecma.DefineTFT(this, constants.String            , monitor.instances.StringConstructor);
    ecma.DefineTFT(this, constants.Boolean           , monitor.instances.BooleanConstructor);
    ecma.DefineTFT(this, constants.Number            , monitor.instances.NumberConstructor);
    ecma.DefineTFT(this, constants.Date              , monitor.instances.DateConstructor);
    ecma.DefineTFT(this, constants.RegExp            , monitor.instances.RegExpConstructor);
    ecma.DefineTFT(this, constants.Error             , monitor.instances.ErrorConstructor);
    ecma.DefineTFT(this, constants.EvalError         , monitor.instances.EvalErrorConstructor);
    ecma.DefineTFT(this, constants.RangeError        , monitor.instances.RangeErrorConstructor);
    ecma.DefineTFT(this, constants.ReferenceError    , monitor.instances.ReferenceErrorConstructor);
    ecma.DefineTFT(this, constants.SyntaxError       , monitor.instances.SyntaxErrorConstructor);
    ecma.DefineTFT(this, constants.TypeError         , monitor.instances.TypeErrorConstructor);
    ecma.DefineTFT(this, constants.URIError          , monitor.instances.URIErrorConstructor);
    ecma.DefineTFT(this, constants.Math              , monitor.instances.MathObject);
    ecma.DefineTFT(this, constants.JSON              , monitor.instances.JSONObject);


    ecma.DefineTFT(this, new Value('tt', bot), true, Label.top);
    ecma.DefineTFT(this, new Value('ff', bot), false, Label.top);

    ecma.DefineTFT(this, constants.print , new BiFO(__print , 0, undefined));
    ecma.DefineTFT(this, new Value('lprint',bot) , new BiFO(__lprint , 0, 'lprint'));
    
    if (monitor.instances.LabelConstructor) {
      ecma.DefineTFT(this, new Value('Label',bot), monitor.instances.LabelConstructor);
    }

    if (monitor.instances.ValueConstructor) {
      ecma.DefineTFT(this, new Value('Value',bot), monitor.instances.ValueConstructor);
    }


    ecma.DefineFFF(this , new Value('upg'  , bot), new BiFO(__dupg    , 1, undefined));
    ecma.DefineFFF(this , new Value('upgs' , bot), new BiFO(__dupgs   , 1, undefined));
    ecma.DefineFFF(this , new Value('upge' , bot), new BiFO(__dupge   , 1, undefined));

    ecma.DefineFFF(this , new Value('lbl' , bot), new BiFO(__upg   , 1, undefined));
    ecma.DefineFFF(this , new Value('lbls', bot), new BiFO(__upgs  , 1, undefined));
    ecma.DefineFFF(this , new Value('lble', bot), new BiFO(__upge  , 1, undefined));

    ecma.DefineFFF(this , new Value('upgl' , bot), new BiFO(__upgl   , 1, undefined));

    /*
    ecma.DefineTFT(this, new Value('Label',bot) ,__Label);

    ecma.DefineFFF(this , new Value('declassify'    , bot) , new BiFO(__declassify    , 1, undefined));

    ecma.DefineFFF(this , new Value('upgs'   , bot) , new BiFO(__upgs   , 1, undefined));
    ecma.DefineFFF(this , new Value('dupgs'  , bot) , new BiFO(__dupgs  , 1, undefined));
    ecma.DefineFFF(this , new Value('getPC'  , bot) , new BiFO(__getPC  , 0, undefined));
    ecma.DefineFFF(this , new Value('setPC'  , bot) , new BiFO(__setPC  , 1, undefined));
    ecma.DefineFFF(this , new Value('getEXC' , bot) , new BiFO(__getEXC , 0, undefined));
    ecma.DefineFFF(this , new Value('setEXC' , bot) , new BiFO(__setEXC , 1, undefined));
    ecma.DefineFFF(this , new Value('getRET' , bot) , new BiFO(__getRET , 0, undefined));
    ecma.DefineFFF(this , new Value('setRET' , bot) , new BiFO(__setRET , 1, undefined));
    */
    
    ecma.DefineTFT(this , new Value('unescape' , bot) , new BiFO(__unescape , 1, host.unescape));
}

  prelude.inherits(GlobalObject,ecma.Ecma);

  /*
  GlobalObject.extensions = [];
  GlobalObject.addExtension = function(ext) {
    GlobalObject.extensions.push(ext);
  };
  */

  GlobalObject.prototype.toString = function() { return '[global object]'; };

  // ------------------------------------------------------------
  // unescape, B2.2
  var __unescape = function(thisArg, args) {
    var str = args[0] ? args[0] : new Value(undefined,bot);
    str = conversion.ToString(str);

    return new Value(unescape(str.value), str.label);
  };
  // ------------------------------------------------------------
  // 15.1.2.1
  var __eval = function(thisArg, args) {
    var arg0 = args[0];
    if (arg0 === undefined) return new Value(undefined,bot);
    if (typeof arg0.value !== 'string') return arg0;

    var prog;

    // raise the pc w.r.t. the program string; parsing may result in an exception
    monitor.context.pushPC(arg0.label);

      try {
        prog = esprima.parse(arg0.value, { loc : true, source : 'eval' });
      } catch(e) {
        var msg = e.description + ' in eval:' + e.lineNumber + ':' + e.column;
        monitor.Throw(
          error.SyntaxErrorObject,
          msg,
          arg0.label
        );
      }

      var evalCtx = _function.enterEvalCode(prog, __eval);
      monitor.contextStack.push(evalCtx);

        // this is not a value, it is a result!!
        var result = monitor.modules.exec.execute(prog,false);


        // if value is 'empty' (represented by null)
        if (!result.value) {
          result.value = new Value(undefined,bot);
        }

        result.value.raise(arg0.label);

        // NOTE: parser should guarantee the result type is never return

        if (result.type === 'throw') {
          throw result.value;
        }

      // pop after throw, otherwise internal context thrown away before handler (catch)
      monitor.contextStack.pop();

    monitor.context.popPC();

    return result.value;
  };

  // ------------------------------------------------------------
  // 15.1.2.2
  var __parseInt = function(thisArg, args) {
    var string = args[0] || new Value(undefined,bot);
    var radix  = args[1] || new Value(undefined,bot);

    string = conversion.ToString(string);
    var value = parseInt(string.value, radix.value);
    return new Value(value, lub(string.label, radix.label));
  };

  // ------------------------------------------------------------
  // 15.1.2.3
  var __parseFloat = function(thisArg, args) {
    var string = args[0] || new Value(undefined, bot);
    string = conversion.ToString(string);
    var value = parseFloat(string.value);
    return new Value(value, string.label);
  };

  // ------------------------------------------------------------
  // 15.1.2.4
  var __isNaN = function(thisArg,args) {
    var number = args[0] || new Value(undefined,bot);
    number = conversion.ToNumber(number);
    var value = isNaN(number.value);
    return new Value(value, number.label);
  };

  // ------------------------------------------------------------
  // 15.1.2.5
  var __isFinite = function(thisArg,args) {
    var number = args[0] || new Value(undefined,bot);
    number = conversion.ToNumber(number);
    var value = isFinite(number.value);
    return new Value(value, number.label);
  };

  // ------------------------------------------------------------
  // 15.1.3.1
  var __decodeURI = function (thisArg, args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);
    var enc  = conversion.ToString(arg0);
    var res  = new Value(decodeURI(enc.value), enc.label);
    return res;
  };

  // ------------------------------------------------------------
  // 15.1.3.2
  var __decodeURIComponent = function(thisArg,args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);
    var enc  = conversion.ToString(arg0);
    var res  = new Value(decodeURIComponent(enc.value), enc.label);
    return res;
  };
  
  // ------------------------------------------------------------
  // 15.1.2.3
  var __encodeURI = function (thisArg, args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);
    var enc  = conversion.ToString(arg0);
    var res  = new Value(encodeURI(enc.value), enc.label);
    return res;
  };

  // ------------------------------------------------------------
  // 15.1.3.4
  var __encodeURIComponent = function(thisArg, args) {
    var arg0 = args[0] !== undefined? args[0] : new Value(undefined,bot);
    var componentString = conversion.ToString(arg0);
    return new Value(encodeURIComponent(componentString.value), componentString.label);
  };

  // ------------------------------------------------------------

  var __print = function(thisArg,args) {
    var str = '';
    for (var i = 0; i < args.length; i++)
      str += args[i].value;
    monitor.print(str);

    return new Value(undefined,bot);
  };

  var __lprint = function(thisArg,args) {
    var str = '';
    for (var i = 0; i < args.length; i++)
      str += args[i];
    monitor.print('(' + monitor.context.effectivePC + '):' + str);

    return new Value(undefined,bot);
  };

  // ------------------------------------------------------------

  var __alert = function(thisArg,args) {
    var str = 'alert: ';
    for (var i = 0; i < args.length; i++)
      str += args[i].value;
    monitor.print(str);

    return new Value(undefined,bot);
  };

  // ------------------------------------------------------------

  var __upgl = function(thisArg,args) {
    var labelName     = args[0] ? args[0] : new Value('default', bot);
    
    monitor.assert(le(labelName.label, bot));

    var lbl = bot;
    for (var i = 1; i < args.length; i++) {
      monitor.assert(le(args[i].label, bot));
      lbl = lub(lbl, Label.fromString(args[i].value));
    }

    lbl = lbl.equals(bot) ? Label.top : lbl;
    
    var lblmap = monitor.context.labels.labelmap;
    var name = labelName.value;
    if (!lblmap[name]) {
      lblmap[name] = {
        label    : lbl,
        pcmarker : undefined
      };
    }

    lblmap[name].label = lub(lblmap[name].label, lbl);
    if (lblmap[name].pcmarker) {
      monitor.context.pcStack.map(
        function(l) {
          return lub(l,lbl);
        },
        lblmap[name].pcmarker
      );
    }

    return new Value(undefined,bot);
  };

  // ------------------------------------------------------------

  var __upg = function(thisArg,args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);

    var lbl = bot;
    for (var i = 1; i < args.length; i++) {
      monitor.assert(le(args[i].label, bot));
      lbl = lub(lbl, Label.fromString(args[i].value));
    }

    lbl = lbl.equals(bot) ? Label.top : lbl;
    
    return new Value(arg0.value, lub(arg0.label, lbl));
  };

  // ------------------------------------------------------------

  var __dupg = function(thisArg,args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);

    var lbl = bot;
    for (var i = 1; i < args.length; i++) {
      lbl = lub(lbl, args[i].label);
    }
    
    return new Value(arg0.value, lub(arg0.label, lbl));
  };

  // ------------------------------------------------------------

  var __upgs = function(thisArg,args) {
    var obj = args[0] ? args[0] : new Value(undefined, bot);

    var lbl = bot;
    for (var i = 1; i < args.length; i++) {
      monitor.assert(le(args[i].label, bot));
      lbl = lub(lbl, Label.fromString(args[i].value));
    }


    lbl = lbl.equals(bot) ? Label.top : lbl;

    if (obj.value != undefined && obj.value.struct !== undefined) {
      obj.value.struct = lub(obj.value.struct, lbl);
    }

    return obj;
  };

  // ------------------------------------------------------------

  var __dupgs = function(thisArg,args) {
    var arg0 = args[0] ? args[0] : new Value(undefined, bot);

    var lbl = bot;
    for (var i = 1; i < args.length; i++)  {
      lbl = lub(lbl, args[i].label);
    }
    
    if (arg0.value != undefined && arg0.value.struct !== undefined) {
      arg0.value.struct = lub(arg0.value.struct, lbl);
    }
      
    return arg0;
  };

  // ------------------------------------------------------------

  var __upge = function(thisArg,args) {
    var obj = args[0] ? args[0] : new Value(undefined, bot);
    var ix  = args[1] ? args[1] : new Value(undefined, bot);

    if (obj.value === undefined || obj.value === null) {
      return new Value(undefined, bot);
    }

    ix = conversion.ToString(ix);
      
    var lbl = bot;
    for (var i = 2; i < args.length; i++) {
      monitor.assert(le(args[i].label, bot));
      lbl = lub(lbl, Label.fromString(args[i].value));
    }

    lbl = lbl.equals(bot) ? Label.top : lbl;
    

    var prop = obj.value.map.get(ix.value);
    if (prop) {
      prop.existence = lub(prop.existence, lbl);
    }

    return new Value(undefined,bot);
  };

  // ------------------------------------------------------------

  var __dupge = function(thisArg,args) {
    var obj = args[0] ? args[0] : new Value(undefined, bot);
    var ix  = args[1] ? args[1] : new Value(undefined, bot);

    if (obj.value === undefined || obj.value === null) {
      return new Value(undefined, bot);
    }

    ix = conversion.ToString(ix);

    var lbl = bot;
    for (var i = 1; i < args.length; i++)  {
      lbl = lub(lbl, args[i].label);
    }

    
    var prop = obj.value.map.get(ix.value);
    if (prop) {
      prop.existence = lub(prop.existence, lbl);
    }

    return new Value(undefined,bot);
  };

  
  // ------------------------------------------------------------

  var __declassify = function(thisArg,args) {

    var val = new Value( args[0] ? args[0].value : undefined, bot);
    return val;

  };

  // ------------------------------------------------------------

  return module;
};
