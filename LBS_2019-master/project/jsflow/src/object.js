/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// 15.2
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
  module.ObjectObject = ObjectObject;
  module.allocate     = allocate;

  // ------------------------------------------------------------
  
  function allocate(host) {
    var objectConstructor = new ObjectConstructor(host);
    var objectPrototype   = objectConstructor._proto;
    return { ObjectConstructor : objectConstructor,
             ObjectPrototype   : objectPrototype
           };
  }


  // ------------------------------------------------------------
  // Object Constructor, 15.2.3

  function ObjectConstructor(host) {
    Ecma.call(this);

    this.Class  = 'Function';
    this.host   = host;
    this._proto = new ObjectPrototype(this);

    // 15.2.3
    this.Prototype = new Value(monitor.instances.FunctionPrototype,bot);

    ecma.DefineFFF(this, constants.length,1);
    // 15.2.3.1
    ecma.DefineFFF(this, constants.prototype, this._proto);

    ecma.DefineTFT(this, constants.getPrototypeOf          , new BiFO(getPrototypeOf          , 1, Object.getPrototypeOf));
    ecma.DefineTFT(this, constants.getOwnPropertyDescriptor, new BiFO(getOwnPropertyDescriptor, 2, Object.getOwnPropertyDescriptor));
    ecma.DefineTFT(this, constants.getOwnPropertyNames     , new BiFO(getOwnPropertyNames     , 1, Object.getOwnPropertyNames));
    ecma.DefineTFT(this, constants.create                  , new BiFO(create                  , 2, Object.create));
    ecma.DefineTFT(this, constants.defineProperty          , new BiFO(defineProperty          , 3, Object.defineProperty));
    ecma.DefineTFT(this, constants.defineProperties        , new BiFO(defineProperties        , 2, Object.defineProperties));
    ecma.DefineTFT(this, constants.seal                    , new BiFO(seal                    , 1, Object.seal));
    ecma.DefineTFT(this, constants.freeze                  , new BiFO(freeze                  , 1, Object.freeze));
    ecma.DefineTFT(this, constants.preventExtensions       , new BiFO(preventExtensions       , 1, Object.preventExtensions));
    ecma.DefineTFT(this, constants.isSealed                , new BiFO(isSealed                , 1, Object.isSealed));
    ecma.DefineTFT(this, constants.isFrozen                , new BiFO(isFrozen                , 1, Object.isFrozen));
    ecma.DefineTFT(this, constants.isExtensible            , new BiFO(isExtensible            , 1, Object.isExtensible));
    ecma.DefineTFT(this, constants.keys                    , new BiFO(keys                    , 1, Object.keys));

  }

  prelude.inherits(ObjectConstructor, Ecma);

  ObjectConstructor.prototype.HasInstance = _function.HasInstance;

  // ------------------------------------------------------------
  // 15.2.1.1
  ObjectConstructor.prototype.Call = function(thisArg,args) {
    var arg0 = args[0] || new Value(undefined,bot);

    var res;
    monitor.context.pushPC(arg0.label);
    if (arg0.value === undefined || arg0.value === null) {
      res = this.Construct(args);
      res.raise(arg0.label);
      monitor.context.popPC();
      return res;
    }

    res = conversion.ToObject(arg0);
    monitor.context.popPC();
    return res;
  };

  // ------------------------------------------------------------
  // 15.2.2.1
  ObjectConstructor.prototype.Construct = function(args) {

    var arg0 = args[0] || new Value(undefined,bot);
    
    monitor.context.pushPC(arg0.label);

    var res;
    if (arg0.value === undefined || arg0.value === null) {
      var o = new ObjectObject();

      res = new Value(o,arg0.label);
      monitor.context.popPC();
      return res;
    }

    if (typeof arg0.value === 'object') {
      res = new Value(arg0.value,arg0.label);
      monitor.context.popPC();
      return res;
    }

    res = conversion.ToObject(arg0);
    monitor.context.popPC();
    return res;
  };

  // ------------------------------------------------------------
  
  function assertObject(arg, callee){

    if (typeof arg.value !== 'object') {
      monitor.context.pushPC(arg.label);

      monitor.Throw(
        monitor.modules.error.TypeErrorObject,
        callee + ' called on non-object',
        arg.label
      );
    }

  }

  // ------------------------------------------------------------
  // 15.2.3.2
  function getPrototypeOf(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.getPrototypeOf');

    var proto = O.value.Prototype;
    return new Value(proto.value, lub(proto.label, O.label));
  }

  // ------------------------------------------------------------
  // 15.2.3.3

  var getOwnPropertyDescriptor =  function(thisArg, args) {
    var O = args[0] || new Value(undefined,bot);
    var P = args[1] || new Value(undefined,bot);
    assertObject(O, 'Object.getOwnPropertyDescriptor');
    
    var name = conversion.ToString(P);
    var desc = O.GetOwnProperty(name);

    if (desc.value === undefined) {
      return desc;
    }

    var obj = new ObjectObject();
    if (ecma.IsDataDescriptor(desc.value)) {
      obj.DefineOwnProperty(
        constants.value,
        { value : desc.value.value,
          writable : true, enumerable : true, configurable : true,
          label : desc.value.label
        },
        false
      );

      obj.DefineOwnProperty(
        constants.writable,
        { value : desc.value.writable,
          writable : true, enumerable : true, configurable : true,
          label : desc.value.label
        },
        false
      );
    } else {
      var get = desc.value.get ? desc.value.get.actualFunction : desc.value.get;
      obj.DefineOwnProperty(
        constants.get,
        { value : get,
          writable : true, enumerable : true, configurable : true,
          label : desc.value.label
        },
        false
      );

      var set = desc.value.set ? desc.value.set.actualFunction : desc.value.set;
      obj.DefineOwnProperty(
        constants.set,
        { value : set,
          writable : true, enumerable : true, configurable : true,
          label : desc.value.label
        },
        false
      );
    }

    obj.DefineOwnProperty(
      constants.enumerable,
      { value : desc.value.enumerable,
        writable : true, enumerable : true, configurable : true, 
        label : desc.value.label
      },
      false
    );

    obj.DefineOwnProperty(
      constants.configurable,
      { value : desc.value.configurable,
        writable : true, enumerable : true, configurable : true,
        label : desc.value.label
      },
      false
    );
    
    return new Value(obj,desc.label);
  };
    

  // ------------------------------------------------------------
  // 15.2.3.4

  function getOwnPropertyNames(thisArg, args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.getOwnPropertyNames');
    
    var propertyNames = O.value.getOwnPropertyNames(O.label);
    var array = monitor.modules.array.ArrayObject.fromPropertyArray(propertyNames,O.value.struct);
    return new Value(array,bot);
  }

  // ------------------------------------------------------------
  // 15.2.3.5

  function create(thisArg, args) {
    var O          = args[0] || new Value(undefined,bot);
    var Properties = args[1] || new Value(undefined,bot);

    if (O.value !== null) {
      assertObject(O, 'Object.create');
    }

    var obj = new monitor.modules.object.ObjectObject();
    obj.Prototype = O;
    obj = new Value(obj,bot);
    
    if (Properties.value !== undefined) {
      defineProperties(thisArg, [ obj, Properties ]);
    }
    return obj;
  }

  // ------------------------------------------------------------

  function ToPropertyDescriptor(Obj) {
    assertObject(Obj, 'Object.ToPropertyDescriptor');

    var c = monitor.context;

    var lbl  = new Label();
    var desc = {};

    var b;
    var x;
    var propertyName;
    
    // enumerable
    propertyName = constants.enumerable;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = conversion.ToBoolean(Obj.Get(propertyName));
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    // configurable
    propertyName = constants.configurable;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = conversion.ToBoolean(Obj.Get(propertyName));
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    // value
    propertyName = constants.value;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = Obj.Get(propertyName);
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    // writable
    propertyName = constants.writable;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = conversion.ToBoolean(Obj.Get(propertyName));
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    // get
    propertyName = constants.get;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = Obj.Get(propertyName);
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    // set
    propertyName = constants.set;
    b = Obj.HasProperty(propertyName);

    lbl.lub(b.label);
    if (b.value) {
      c.pushPC(b.label);
        x = Obj.Get(propertyName);
      c.popPC();
      lbl.lub(x.label);
      desc[propertyName.value] = x.value;
    }

    desc.label = lbl;
    return desc;
  }


  // ------------------------------------------------------------
  // 15.2.3.6

  function defineProperty(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    var P = args[1] || new Value(undefined,bot);
    var Attributes = args[2] || new Value(undefined,bot);
    assertObject(O, 'Object.defineProperty');
   
    var name = conversion.ToString(P);
    var desc = ToPropertyDescriptor(Attributes);
    O.DefineOwnProperty(name,desc,true);
    return O;
  }

  // ------------------------------------------------------------
  // 15.2.3.7

  function defineProperties(thisArg,args) {
    var O          = args[0] || new Value(undefined,bot);
    var Properties = args[1] || new Value(undefined,bot);

    assertObject(O, 'Object.defineProperties');
    var props = conversion.ToObject(Properties);
    var names = props.value.getOwnEnumerablePropertyNames(props.label);

    var descriptors = [];

    for (var i = 0, len = names.length; i < len; i++) {
      var P = names[i];
      var descObject = props.Get(P);
      var desc       = ToPropertyDescriptor(descObject);
  
      descriptors.push(P);
      descriptors.push(desc);
    }

    for (var i = 0, len = descriptors.length; i < len; i = i + 2) {
      var P    = descriptors[i];
      var desc = descriptors[i+1];
      O.DefineOwnProperty(P,desc,true);
    }
    
    return O;
  }
 
  // ------------------------------------------------------------
  // 15.2.3.8

  function seal(thisArg, args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.defineProperties');

    var context = lub(monitor.context.effectivePC, O.label);

    monitor.assert(
      le(context, O.value.struct),
      'Object.seal: context label ' + context + ' not below structural label ' + O.value.struct + ' of object'
    );

    var labels = O.value.labels;
    for (var x in labels) {
      if (Object.hasOwnProperty.call(labels, x)) {
        monitor.assert(
          le(context, labels[x].value),
          'Object.seal: context label ' + context + ' not below label ' + labels[x].value + ' of ' + x
        );
      }
    }

    Object.seal(O.value.properties);
    O.value.Extensible = false;
    return O;
  }

  // ------------------------------------------------------------
  // 15.2.3.9

  function freeze(thisArg, args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.freeze');

    var context = lub(monitor.context.effectivePC, O.label);

    monitor.assert(
      le(context, O.value.struct),
      'Object.freeze: context label ' + context + ' not below structural label ' + O.value.struct + ' of object'
    );

    var labels = O.value.labels;
    var properties = O.value.properties;

    for (var x in properties) {
      if (Object.hasOwnProperty.call(properties, x)) {
        var desc = Object.getOwnPropertyDescriptor(properties, x);
        if (desc.enumerable) {
          monitor.assert(
            le(context, labels[x].value),
            'Object.freeze: context label ' + context + ' not below label ' + labels[x].value + ' of ' + x
          );
        }
      }
    }

    Object.freeze(O.value.properties);
    O.value.Extensible = false;
    return O;

  }

  // ------------------------------------------------------------
  // 15.2.3.10

  function preventExtensions(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.preventExtensions');

    var context = lub(monitor.context.effectivePC, O.label);

    monitor.assert(
      le(context, O.value.struct),
      'Object.preventExtensions: context label ' + context + ' not below structural label ' + O.value.struct + ' of object'
    );

    Object.preventExtensions(O.value.properties);
    O.value.Extensible = false;
    return O;
  }

  // ------------------------------------------------------------
  // 15.2.3.11

  function isSealed(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.isSealed');

    var result = Object.isSealed(O.value.properties);
    return new Value(result,lub(O.label, O.value.struct));
  }
    

  // ------------------------------------------------------------
  // 15.2.3.12

  function isFrozen(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.isFrozen');

    var result = Object.isFrozen(O.value.properties);
    return new Value(result,lub(O.label, O.value.struct));
  }

  // ------------------------------------------------------------
  // 15.2.3.13

  function isExtensible(thisAr,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.isExtensible');

    var result = Object.isExtensible(O.value.properties);
    return new Value(result,lub(O.label, O.value.struct));

  }

  // ------------------------------------------------------------
  // 15.2.3.14
  function keys(thisArg,args) {
    var O = args[0] || new Value(undefined,bot);
    assertObject(O, 'Object.keys');

    var enumerable = O.value.getOwnEnumerablePropertyNames(O.label);
    var array = monitor.modules.array.ArrayObject.fromPropertyArray(enumerable,O.value.struct);

    return new Value(array,bot);
  }
  
  // ------------------------------------------------------------
  // The object prototype, 15.2.4

  function ObjectPrototype(constructor) {
    Ecma.call(this);
    this.Prototype  = new Value(null,bot);
    this.Class      = 'Object';
    this.Extensible = true;
  
    this.host = constructor.host.prototype;

    // 15.2.4.1
    ecma.DefineTFT(this, constants.constructor, constructor);

    ecma.DefineTFT(this, constants.toString            , new BiFO(toString            , 0, Object.prototype.toString));
    ecma.DefineTFT(this, constants.toLocaleString      , new BiFO(toLocaleString      , 0, Object.prototype.toLocaleString));
    ecma.DefineTFT(this, constants.valueOf             , new BiFO(valueOf             , 0, Object.prototype.valueOf));
    ecma.DefineTFT(this, constants.hasOwnProperty      , new BiFO(hasOwnProperty      , 1, Object.prototype.hasOwnProperty));
    ecma.DefineTFT(this, constants.isPrototypeOf       , new BiFO(isPrototypeOf       , 1, Object.prototype.isPrototypeOf));
    ecma.DefineTFT(this, constants.propertyIsEnumerable, new BiFO(propertyIsEnumerable, 1, Object.prototype.propertyIsEnumerable));
  }

  prelude.inherits(ObjectPrototype, Ecma); 
  
  // ------------------------------------------------------------
  // Object.prototype.toString(), 15.2.4.2
  function toString(thisArg,args) {
    
    if (thisArg.value === undefined) 
      return new Value('[object Undefined]', thisArg.label);
    
    if (thisArg.value === null)
      return new Value('[object Null]', thisArg.label);
  
    var O = conversion.ToObject(thisArg);
    return new Value('[object ' + O.value.Class + ']', thisArg.label);
  }
  
  // ------------------------------------------------------------
  // 15.2.4.3

  function toLocaleString(thisArg,args) {
    var O = conversion.ToObject(thisArg);
    var toString = O.Get(constants.toString);
    var b = conversion.IsCallable(toString);

    var result; 

    monitor.context.pushPC(b.label);
    if (b.value) {
      result = toString.Call(O);
      result.raise(b.label);
    } else {
      monitor.Throw(
        monitor.modules.error.TypeError,
        "property 'toString' of object " + O + " is not a function ",
        bot
      );
    }
    monitor.context.popPC();

    return result;
  }

  // ------------------------------------------------------------
  // 15.2.4.4

  function valueOf(thisArg) {
    var o = conversion.ToObject(thisArg);
    return o;
  }

  // ------------------------------------------------------------
  // 15.2.4.5

  function hasOwnProperty(thisArg, args) {
    var V = args[0] || new Value(undefined,bot);
    var P = conversion.ToString(V);
    var O = conversion.ToObject(thisArg);
  
    var desc = O.GetOwnProperty(P);
    var result = desc.value !== undefined;

    return new Value(result, desc.label);
  }

  // ------------------------------------------------------------
  // 15.2.4.6

  function isPrototypeOf(thisArg,args) {
    var c = monitor.context;

    var V = args[0] || new Value(undefined,bot);

    if (V.value === null || typeof V.value !== 'object') {
      return new Value(false, V.label);
    }

    c.pushPC(V.label);
    var O = conversion.ToObject(thisArg);
    c.popPC();

    var lbl = new Label();
    lbl.lub(V.label);

    while(true) {
      V = V.value.Prototype;
      lbl.lub(V.label);
      if (V.value === null) {
        return new Value(false, lbl);
      }

      if (O.value === V.value) {
        return new Value(true, lbl);
      }

      if (V === undefined) {
        throw new Error('Object.prototype.isPrototypeOf: object with undefined prototype');
      }
    }
  }

  // ------------------------------------------------------------
  // 15.2.4.7

  function propertyIsEnumerable(thisArg,args) {
    var V = args[0] || new Value(undefined,bot);
    var P = conversion.ToString(V);
    var O = conversion.ToObject(thisArg);

    var desc = O.GetOwnProperty(P);
    if (desc.value === undefined) {
      return new Value(false, desc.label);
    }

    return new Value(desc.value.vale, lub(desc.label, desc.value.label));
  }

  // ------------------------------------------------------------
  // Object objects, 15.2.2.1

  function ObjectObject() {
    Ecma.call(this); 
  
    this.Prototype = new Value(monitor.instances.ObjectPrototype,bot);
    this.Class     = 'Object';
    this.Extensible = true;

    this.host      = {};
  }
    
  prelude.inherits(ObjectObject, Ecma);

  // ---

  ObjectObject.prototype.toString = function() {
    var properties = [];
    for (x in this.properties) {
      if (this.properties.hasOwnProperty(x)) {
        properties.push(x + ': ' + this.properties[x]);
      }
    }
    return '{' + properties.join(', ') + '}';
  };

  return module; 
};

