/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var prelude         = monitor.require('prelude');
  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var _               = monitor.require('underscore');

  var Map             = monitor.require('map').Map;
  var Value           = monitor.require('values').Value;

  var Label           = label.Label;
  var lub             = label.lub;
  var glb             = label.glb;
  var le              = label.le;

  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  Object.defineProperty(module, 'PropertyDescriptor', {
    get : 
      function () {
        throw new Error('Access to ecma.PropertyDescriptor');
      }
    }
  );
  Object.defineProperty(module, 'DataProperty', {
    get : 
      function () {
        throw new Error('Access to ecma.DataProperty');
      }
    }
  );
  Object.defineProperty(module, 'AccessorProperty', {
    get : 
      function () {
        throw new Error('Access to ecma.AccessorProperty');
      }
    }
  );
  Object.defineProperty(module, 'APIEcma', {
    get : 
      function () {
        throw new Error('Access to ecma.APIEcma');
      }
    }
  );

  module.Ecma               = Ecma;
  module.Define             = Define;
  module.DefineFFF          = DefineFFF;
  module.DefineTFT          = DefineTFT;
  module.DefineTFF          = DefineTFF;
  module.IsAccessorDescriptor = IsAccessorDescriptor;
  module.IsDataDescriptor = IsDataDescriptor;
  
  // ------------------------------------------------------------
  // Property descriptors, 8.10

  function IsAccessorDescriptor(pd) {
    return ('get' in pd || 'put' in pd);
  }

  function IsDataDescriptor(pd) {
    return ('value' in pd || 'writable' in pd);
  }

  // ------------------------------------------------------------
  // Ecma Objects, 8.6.2

  function Ecma() {
    // return if already initialized
    if (this.ecma) {
      return;
    }
    this.Prototype  = new Value(null,bot);

    this.Class      = undefined;
    this.Extensible = true;

    this.properties = {};
    this.labels     = {};    

    this.struct = monitor.context.effectivePC;

    Object.defineProperty(this, 'map', {
      get : function() {
        throw new Error('Something touched Ecma.map');
      },
      configurable : true
    });
    // this.map    = new Map();

    this.ecma = true;
  }

  Ecma.prototype.raise = function(s,l) {
    throw new Error('Ecma.prototype.raise unimplemented');
  };

  Ecma.prototype.getOwnPropertyNames = function(label) {
    var names  = Object.getOwnPropertyNames(this.properties);
    var result = [];
    var properties = this.properties;

    for (var i = 0, len = names.length; i < len; i++) {
      var name = names[i];
      result[i] = new Value(name, lub(label, this.labels[name].existence));
    }

    return result;
  };


  Ecma.prototype.getOwnEnumerablePropertyNames = function(label) {
    var names = Object.getOwnPropertyNames(this.properties);
    var enumerable = [];
    var j = 0;
    var properties = this.properties;

    for (var i = 0, len = names.length; i < len; i++) {
      var name = names[i];
      var desc = Object.getOwnPropertyDescriptor(properties, name);
      if (desc.enumerable) {
        enumerable[j++] = new Value(name, lub(label, this.labels[name].existence));
      }
    }
    return enumerable;
  };


  Ecma.prototype.getEnumerablePropertyNames = function(initialLabel) {

    var defined = {};
    var result  = [];

    var j = 0; 

    var current = this;
    var lbl = initialLabel || bot;

    while (current) {
      var enumerable = current.getOwnEnumerablePropertyNames(lbl);

      for (var i = 0, len = enumerable.length; i < len; i++) {
        var name = enumerable[i];
        if (!defined.hasOwnProperty(name.value)) {
          defined[name.value] = true;
          result[j++] = name;
        }
      }

      var next = current.Prototype;
      current = next.value;
      lbl = lub(lbl, next.label);
    }

    return result;
  };

  // GetOwnProperty, 8.12.1 -----------------------------------------------------

  Ecma.prototype.GetOwnProperty = function(s) {
    var propName = s.value;
    var propNameLabel = s.label;

    var pd = Object.getOwnPropertyDescriptor(this.properties,propName);

    if (pd === undefined) {
      return new Value(undefined,lub(this.struct,propNameLabel));
    }
    var propLabels = this.labels[propName];
    pd.label       = propLabels.value;

    var result =  new Value(pd,lub(propNameLabel, propLabels.existence));
    return result;
  };  

  // GetProperty, 8.12.2 --------------------------------------------------------

  Ecma.prototype.GetProperty = function(s) {
    var prop = this.GetOwnProperty(s);
    if (prop.value !== undefined) {
      return prop;
    }

    var proto = this.Prototype;
    var lbl   = lub(prop.label,proto.label);

    if (proto.value === null) {
      return new Value(undefined, lbl);
    }
    
    // DEBUG: remove
    if (proto.value === undefined) {
      monitor.fatal('ECMA Object with undefined Prototype');
    }
    
    var res = proto.GetProperty(s);
    res.label = lbl.lub(res.label);
    return res;
  };

  // Get, 8.12.3 ----------------------------------------------------------------
  
  Ecma.prototype.Get = function(s) {


    var desc = this.GetProperty(s);

    if (desc.value === undefined) {
      return desc;
    }

    var v;
    var lbl = desc.label;
    desc = desc.value;


    monitor.context.pushPC(lbl);

    if ('value' in desc) {
      v = new Value(desc.value, desc.label);
    } else if (desc.get) {
      v = desc.get.call(this);
    } else { 
      v = new Value(undefined,lbl);
    }

    monitor.context.popPC();

    v.raise(lbl); 
    return v; 
  };

  // CanPut, 8.12.4 -------------------------------------------------------------

  Ecma.prototype.CanPut = function(p) { 
    var desc = this.GetOwnProperty(p);

    var label = desc.label;

    if (desc.value) {
      desc = desc.value;
      label = lub(label, desc.label);

      if (IsAccessorDescriptor(desc)) {
        return new Value(desc.set !== undefined, label);
      } else {
        return new Value(desc.writable, label);
      }
    }

    var proto = this.Prototype;
    if (proto.value === null) {
      return new Value(this.Extensible, label);
    }

    var inherited = proto.GetProperty(p);
    label = lub(label,inherited.label);

    if (inherited.value === undefined) {
      return new Value(this.Extensible, label);
    }

    inherited = inherited.value;
    label.lub(inherited.label);

    if (IsAccessorDescriptor(inherited)) {
      return new Value(inherited.set !== undefined, label);
    } else {
      if (!this.Extensible) {
        return new Value(false, label);
      } else {
        return new Value(inherited.writable, label);
      }
    }
  };

  // Put, 8.12.5 ----------------------------------------------------------------

  Ecma.prototype.Put = function(s,v,Throw) {
    var c = monitor.context;

    var propName = s.value;
    var propNameLabel = s.label;
    
    var canPut = this.CanPut(s);
    if (!canPut.value) {
      if (Throw) {
        c.pushPC(canPut.label);
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'illegal access',
          bot
        );
      }

      return;
    }

    c.pushPC(new Label());

    var ownDesc = this.GetOwnProperty(s);

    if (ownDesc.value && IsDataDescriptor(ownDesc.value)) {
      this.DefineOwnProperty(s, { value : v.value, label : v.label }, Throw);
      c.popPC();
      return;
    }

    var desc = this.GetProperty(s);
    if (desc.value && IsAccessorDescriptor(desc.value)) {

      this.struct.lub(s.label);
      var valueLabel = this.labels[propName].value;
      
      if (desc.value.set) {
        c.labels.pc.lub(desc.label);

        try {
          desc.value.set.call(this, v);
        } catch(e) {
          monitor.liftException(e,Throw);
        }
        
      }

      c.popPC();
      return;
    }

    c.labels.pc.lub(desc.label);
    this.DefineOwnProperty(s, 
      { value : v.value, 
        label : v.label,
        writable : true,
        enumerable : true,
        configurable : true
      }, Throw);
    c.popPC();
    return;
  };


  // HasProperty, 8.12.6 --------------------------------------------------------

  Ecma.prototype.HasProperty = function(s) {
    var desc = this.GetProperty(s);

    var val = new Value(desc.value !== undefined, desc.label);
    return val;
  };

  // Delete, 8.12.7 -------------------------------------------------------------

  Ecma.prototype.Delete = function(s,Throw) {
    var c = monitor.context;
    var propertyName = s.value;

    var desc = this.GetOwnProperty(s);

    if (desc.value === undefined) {
      return new Value(true, desc.label);
    }

    if (!le(c.effectivePC, this.struct)) {
      var msg = _.template('Ecma.prototype.Delete: security context <%=el%> not below structure <%=sl%>');
      monitor.securityError(msg({el : c.effectivePC, sl : this.struct}));
    }

    var lbl = lub(c.effectivePC, desc.label);
    var existence = this.labels[propertyName].existence;

    if (!le(lbl,existence)) {
      var msg = _.template('Ecma.prototype.Delete: security context <%=el%> not below exstence label <%=sl%>');
      monitor.securityError(msg({el : lbl, sl : existence}));
    }

    var res;
    try {
      res = delete this.properties[propertyName];
      if (res) { 
        delete this.labels[propertyName];
      }
    } catch(e) {
      monitor.liftException(e,Throw);
    }

    return new Value(res, lub(desc.label,existence));
  };

  // DefaultValue, 8.12.8 -------------------------------------------------------

  Ecma.prototype.DefaultValue = function(hint) {
    
    if (hint === undefined) {
      if (this.Class === 'Date')
        hint = 'string';
      else
        hint = 'number';
    }
    
    if (hint === 'string') {
      var toString = this.Get(constants.toString);

      if (conversion.IsCallable(toString).value) {
        var str = toString.Call(new Value(this,bot),[]);

        var type = typeof str.value;
        if (type === 'boolean' || type === 'string' || type === 'number')
          return str;
      }

      monitor.context.pushPC(toString.label);

      var valueOf = this.Get(constants.valueOf);
      if (conversion.IsCallable(valueOf).value) {
        var str = valueOf.Call(new Value(this,bot),[]);
        var type = typeof str.value;
        if (type === 'boolean' || type === 'string' || type === 'number')  {
          str.raise(toString.label);
          monitor.context.popPC();
          return str;
        }
      }

      // return new Value('DefaultValue: unable to convert', bot);
      
      monitor.Throw(
        monitor.modules.error.TypeErrorObject,
        'default value, unable to convert',
        lub(toString.label,valueOf.label)
      );
    }

    // hint must be 'number'

    
    var valueOf = this.Get(constants.valueOf);
    if (conversion.IsCallable(valueOf).value) {
      var str = valueOf.Call(new Value(this,bot),[]);

      var type = typeof str.value;
      if (type === 'boolean' || type === 'string' || type === 'number')  
        return str;
    }

    monitor.context.pushPC(valueOf.label);

    var toString = this.Get(constants.toString);

    if (conversion.IsCallable(toString).value) {
      var str = toString.Call(new Value(this,bot),[]);
      var type = typeof str.value;
      if (type === 'boolean' || type === 'string' || type === 'number') {
        str.raise(valueOf.label);
        monitor.context.popPC();
        return str;
      }
    }

    monitor.Throw(
      monitor.modules.error.TypeErrorObject,
      'default value, unable to convert',
      lub(toString.label,valueOf.label)
    );
  };

  // DefineOwnProperty, 8.12.9 --------------------------------------------------

  Ecma.prototype.DefineOwnProperty = function(s,desc,Throw) {
    var c = monitor.context;
    
    var propName      = s.value;
    var propNameLabel = s.label;
    
    this.struct      = lub(this.struct, propNameLabel);
    var contextLabel = lub(c.effectivePC, propNameLabel);

    try {
      if (Object.hasOwnProperty.call(this.properties,propName)) {
        var valueLabel = this.labels[propName].value;

        if (!le(contextLabel, valueLabel)) {
          var msg = _.template('Ecma.prototype.DefineOwnProperty: security context <%=el%> not below existing value label <%=vl%> for property <%=pn%>');
          monitor.securityError(msg({el : contextLabel, vl : valueLabel, pn : propName})); 
        }

      } else {
        if (!le(c.effectivePC, this.struct)) {
          var msg = _.template('Ecma.prototype.DefineOwnProperty: security context <%=el%> not below structure <%=sl%>');
          monitor.securityError(msg({el : c.effectivePC, sl : this.struct}));
        }
      }

      if (desc.get) {
        var get = desc.get;
        desc.get = function() { return get.Call(new Value(this, bot), []); }; 
        desc.get.actualFunction = get;
      }

      if (desc.set) { 
        var set = desc.set;
        desc.set = function(v) { return set.Call(new Value(this, bot), [v]); };
        desc.set.actualFunction = set;
      }

      Object.defineProperty(this.properties, propName, desc);
      this.labels[propName] = { value : lub(desc.label, contextLabel), existence : contextLabel };

    } catch(e) {
      monitor.liftException(e,Throw);
    }

    return new Value(true,bot);
  };

  // toNative, needed for Tortoise -------------------------------
  Ecma.prototype.toNative = function(deep) {
    var clone = {};
    var lbl = new Label;

    for (x in this.properties) {
      if (this.properties.hasOwnProperty(x)) {
        lbl.lub(this.labels[x].existence, this.labels[x].value);

        var v = this.properties[x];
        var t = typeof v;
        if (t !== 'object' || t !== 'function') {
          clone[x] = v;
        } else {
          // TODO: replace with getter
          clone[x] = null;
        }
      }
    }

    return new Value(clone, lbl);
  };
  
  // ------------------------------------------------------------

  function Define(_this, name, v, opts) {
    opts = opts || {};
    name = name.value || name; 
    
    var pd = { value : v };
    pd.writable = Boolean(opts.writable);
    pd.enumerable = Boolean(opts.enumerable);
    pd.configurable = Boolean(opts.configurable);

    Object.defineProperty(_this.properties, name, pd);
    _this.labels[name] = { value : opts.label || bot, existence : opts.existence || bot };
  }

  function DefineFFF(_this, name, v, opts) {
    opts = opts || {};
    name = name.value || name; 
    Object.defineProperty(_this.properties, name, { value : v });
    _this.labels[name] = { value : opts.label || bot, existence : opts.existence || bot };
  }

  function DefineTFF(_this, name, v, opts) {
    opts = opts || {};
    name = name.value || name; 
    Object.defineProperty(_this.properties, name, 
      { value : v,
        writable : true
      }
    );
    _this.labels[name] = { value : opts.label || bot, existence : opts.existence || bot };
  }

  function DefineTFT(_this, name, v, opts) {
    opts = opts || {};
    name = name.value || name; 
    Object.defineProperty(_this.properties, name, 
      { value : v,
        writable : true,
        configurable : true
      }
    );
    _this.labels[name] = { value : opts.label || bot, existence : opts.existence || bot };
  }

  // ------------------------------------------------------------
  
  return module;
};
