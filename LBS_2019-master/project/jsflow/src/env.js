/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

// 10.2
exports.functor = function(monitor) {
 
  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var _function       = monitor.require('function');
  var values          = monitor.require('values');

  var Value           = values.Value;
  var Reference       = values.Reference;

  var Ecma            = ecma.Ecma;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;


  // ------------------------------------------------------------  

  var module = {};
  module.ObjectEnvironmentRecord      = ObjectEnvironmentRecord;
  module.DeclarativeEnvironmentRecord = DeclarativeEnvironmentRecord;
  module.LexicalEnvironment           = LexicalEnvironment;
  module.NewDeclarativeEnvironment    = NewDeclarativeEnvironment;
  module.NewObjectEnvironment         = NewObjectEnvironment;
  module.IsEnvironmentRecord          = IsEnvironmentRecord;
  module.GetIdentifierReference       = GetIdentifierReference;

  // ------------------------------------------------------------
  // 10.2.2.2

  function NewDeclarativeEnvironment(e) {
    var envRec = new DeclarativeEnvironmentRecord();
    var env = new LexicalEnvironment(envRec,e);
    return env;
  } 

  // ------------------------------------------------------------
  // 10.2.2.3

  function NewObjectEnvironment(o,e) {
    var envRec = new ObjectEnvironmentRecord(o);
    var env = new LexicalEnvironment(envRec,e);
    return env;
  } 

  // ------------------------------------------------------------
  // Environment records, 10.2.1.2

  function ObjectEnvironmentRecord(p) {
      if (p.value === undefined)
        monitor.fatal('ObjectEnvironmentRecord, undefined binding object');

      Ecma.call(this);
      this.bindingObject = p; // Value
      this.provideThis   = false;
  }

  prelude.inherits(ObjectEnvironmentRecord,Ecma);
  
  ObjectEnvironmentRecord.prototype.raise = function(p,l) {
    this.bindingObject.raise(p,l);
  };

  // HasBinding, 10.2.1.2.1
  ObjectEnvironmentRecord.prototype.HasBinding = function(p) {
      return this.bindingObject.HasProperty(p);
  };

  // CreateMutableBinding, 10.2.1.2.2
  ObjectEnvironmentRecord.prototype.CreateMutableBinding = function(p, d) {
    var desc = { value        : undefined,
                 label        : monitor.context.effectivePC,
                 writable     : true,
                 enumerable   : true,
                 configurable : d
               };

    this.bindingObject.DefineOwnProperty(p, desc, true);
  };

  // GetBindingValue, 10.2.1.2.4
  ObjectEnvironmentRecord.prototype.GetBindingValue = function(p,s) {
    return this.bindingObject.Get(p);
  };

  // SetMutableBinding, 10.2.1.2.3
  ObjectEnvironmentRecord.prototype.SetMutableBinding = function(p,v,s) {
    this.bindingObject.Put(p,v,s);
  };

  // DeleteBinding, 10.2.1.2.5
  ObjectEnvironmentRecord.prototype.DeleteBinding = function(p) {
    return this.bindingObject.Delete(p);
  };

  // ImplicitThisValue, 10.2.1.2.6
  ObjectEnvironmentRecord.prototype.ImplicitThisValue = function() {
    if (this.provideThis) {
      return this.bindingObject.clone();
    } else { 
      return new Value(undefined, bot);
    }
  };

  // ------------------------------------------------------------
  // Declarative Environment Record, 10.2.1.1

  function DeclarativeEnvironmentRecord() {
      Ecma.call(this);
  }
  
  prelude.inherits(DeclarativeEnvironmentRecord,Ecma);

  // HasBinding, 10.2.1.1.1
  DeclarativeEnvironmentRecord.prototype.HasBinding = function(s) {
      return this.HasProperty(s);
  };

  // CreateMutableBinding, 10.2.1.1.2
  DeclarativeEnvironmentRecord.prototype.CreateMutableBinding = function(p,d) {

    var desc = { value        : undefined,
                 label        : monitor.context.effectivePC,
                 writable     : true,
                 enumerable   : true,
                 configurable : d
               };

    this.DefineOwnProperty(p, desc, true);
  };

  // GetBindingValue 10.2.1.1.4
  DeclarativeEnvironmentRecord.prototype.GetBindingValue = function(p,s) {
    return this.Get(p);
  };

  // SetMutableBinding, 10.2.1.1.3
  DeclarativeEnvironmentRecord.prototype.SetMutableBinding = function(p,v,s) {
    this.Put(p,v,s);
  };

  // DeleteBinding, 10.2.1.1.5
  DeclarativeEnvironmentRecord.prototype.DeleteBinding = function(p) {
    return this.Delete(p);
  };

  // ImplicitThisValie. 10.2.1.1.6
  DeclarativeEnvironmentRecord.prototype.ImplicitThisValue = function() {
    return new Value(undefined, bot);
  };

  // CreateImmutableBinding, 10.2.1.1.7
  DeclarativeEnvironmentRecord.prototype.CreateImmutableBinding = function(p) {

    var desc = { value        : undefined,
                 label        : bot,
                 writable     : false,
                 enumerable   : true,
                 configurable : true
               };

    this.DefineOwnProperty(p,desc,false);
  };

  // InitializeImmutableBinding, 10.2.1.1.8
  DeclarativeEnvironmentRecord.prototype.InitializeImmutableBinding = function(p,v) {
    var desc = this.GetOwnProperty(p).value;
    desc.value = v.value;
    desc.label = v.label;
    
    this.DefineOwnProperty(p,desc,false);
  };

  // ------------------------------------------------------------

  function IsEnvironmentRecord(p) {
    return ('HasBinding' in p.value);
  };

  // ------------------------------------------------------------

  function LexicalEnvironment(er,le) {
    this.EnvironmentRecord = er; // Not Value
    this.OuterLexicalEnvironment  = le; // Value
  };

  LexicalEnvironment.prototype.provideThis = function() {
    this.EnvironmentRecord.provideThis = true;
  };

  LexicalEnvironment.prototype.HasBinding = function(s) {
    return this.EnvironmentRecord.HasBinding(s);
  };

  LexicalEnvironment.prototype.CreateMutableBinding = function(s,d) {
    return this.EnvironmentRecord.CreateMutableBinding(s,d);
  };

  LexicalEnvironment.prototype.SetMutableBinding = function(s,v,d) {
    return this.EnvironmentRecord.SetMutableBinding(s,v,d);
  };

  LexicalEnvironment.prototype.GetBindingValue = function(s,d) {
    return this.EnvironmentRecord.GetBindingValue(s,d);
  };

  LexicalEnvironment.prototype.DeleteBinding = function(s) {
    return this.EnvironmentRecord.DeleteBinding(s);
  };

  LexicalEnvironment.prototype.ImplicitThisValue = function() {
    return this.EnvironmentRecord.ImplicitThisValue();
  };
  
  // Only meaningful if the underlying environment record is 
  //  a declarative environment record
  LexicalEnvironment.prototype.CreateImmutableBinding = function(s) {
    return this.EnvironmentRecord.CreateImmutableBinding(s);
  };

  LexicalEnvironment.prototype.InitializeImmutableBinding = function(s,v) {
    return this.EnvironmentRecord.InitializeImmutableBinding(s,v);
  };

  // ------------------------------------------------------------
  // GetIdentifierReference, 10.2.2.1

  function GetIdentifierReference(p,x) {

    if (!p) {
      monitor.fatal('GetIdentifierReference: p undefined or null for ' + x);
    }

    if (p.value == null) {
        return new Reference(new Value(undefined,p.label),
                             new Value(x,bot));
    }
    
    var erp = new Value(p.value.EnvironmentRecord, p.label);

    var b   = erp.HasBinding(new Value(x,bot));
    if (b.value) {
        erp.label = b.label;
        return new Reference(erp, new Value(x,bot));
    }
    else {
        var res = GetIdentifierReference(p.value.OuterLexicalEnvironment, x);
        res.base.raise(b.label);
        return res;
    }
  }

  return module;
};

