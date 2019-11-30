/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor){

  var label = monitor.require('label');

  var Label = label.Label;
  var lub   = label.lub;
  var le    = label.le;
  var bot   = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.Value     = Value;
  module.Reference = Reference;

  // ------------------------------------------------------------
  // Value - labeled values

  function Value(v,l) {
      this.value = v;
      this.label = l || bot;
  }

  Value.prototype.equal = function(v) {
    if (! (v instanceof Value)) return false;
    if (this.value === undefined) return (v.value === undefined);
    if (this.value.equal)
      return (this.value.equal(v.value) && this.label.equal(v.label));
    else
      return (this.value == v.value && this.label.equal(v.label));
  };

  Value.prototype.raise = function(l) {
      this.label = lub(this.label,l);
  };

  Value.prototype.clone = function() {
    return new Value(this.value, this.label);
  };

  Value.prototype.toString = function() {
    if (typeof this.value === 'string') {
      return "'" + this.value + "'_" + this.label;
    } else {
      return this.value + "_" + this.label;
    }
  };

  // ------------------------------------------------------------

  function lift(name) {
    return function() {
      monitor.context.pushPC(this.label);
      var res = this.value[name].apply(this.value,arguments);
      monitor.context.popPC();
      if (res) {
        res.raise(this.label);
      }
      return res;
    };
  }

  // lift Ecma methods

  Value.prototype.Get                        = lift('Get');
  Value.prototype.GetProperty                = lift('GetProperty');
  Value.prototype.GetOwnProperty             = lift('GetOwnProperty');
  Value.prototype.DefineOwnProperty          = lift('DefineOwnProperty');
  Value.prototype.Put                        = lift('Put');
  Value.prototype.CanPut                     = lift('CanPut');
  Value.prototype.HasProperty                = lift('HasProperty');
  Value.prototype.Delete                     = lift('Delete');
  Value.prototype.DefaultValue               = lift('DefaultValue');

  Value.prototype.IsEnvironmentRecord        = lift('IsEnvironmentRecord');
  Value.prototype.HasBinding                 = lift('HasBinding');
  Value.prototype.GetBindingValue            = lift('GetBindingValue');
  Value.prototype.CreateMutableBinding       = lift('CreateMutableBinding');
  Value.prototype.SetMutableBinding          = lift('SetMutableBinding');
  Value.prototype.DeleteBinding              = lift('DeleteBinding');
  Value.prototype.ImplicitThisValue          = lift('ImplicitThisValue');
  Value.prototype.CreateImmutableBinding     = lift('CreateImmutableBinding');
  Value.prototype.InitializeImmutableBinding = lift('InitializeImmutableBinding');

  // lift Function methods

  Value.prototype.HasInstance = lift('HasInstance');
  Value.prototype.Call        = lift('Call');
  Value.prototype.Construct   = lift('Construct');

  // -------------------------------------------------------------

  function Reference(base,propertyName) {
      this.base = base;
      this.propertyName = propertyName;
  }

  Reference.prototype.GetBase = function() {
    return this.base;
  };

  Reference.prototype.GetReferencedName = function() {
    return this.propertyName;
  };

  Reference.prototype.HasPrimitiveBase = function() {
    var x = typeof this.base.value;

    return (x === 'boolean' || x === 'string' || x === 'number');
  };

  Reference.prototype.IsPropertyReference = function() {
    return (this.base.value.Class !== undefined || this.HasPrimitiveBase());
  };

  Reference.prototype.IsUnresolvableReference = function() {
    return (this.base.value === undefined);
  };

  Reference.prototype.toString = function() {
    return ('@(' + this.base + ',' + this.propertyName + ')'); 
  };

  return module;
};


