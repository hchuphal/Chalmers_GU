/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

(function() {

  function Option(type, val, desc) {

    this.type = type;
    this.set(val);
    this.def = this.value;

    this.description = desc;
  }

  Option.prototype.set = function(val) {

    var v = String(val);

    if (this.type === 'string') {

      this.value = v;

    } else if (this.type === 'boolean') {

      this.value = v === 'true' || v === '1';

    } else if (this.type === 'number') {

      this.value = Number(v);

    }
  };

  Option.prototype.getDefault = function() {
    return this.def;
  };

  Option.prototype.valueOf = function() {
    return this.value;
  };

  Option.prototype.toString = function() {
    return String(this.value);
  };

  // -------------------------------------------------------------
  // Options

  function Options() {
    this.options = [];
  }

  Options.prototype.declare = function(name, type, def, desc) { 
    var description = desc ? desc : name;
    this.options[name] = new Option(type, def, description);
  };

  Options.prototype.has = function(name) {
    return this.options[name] !== undefined;
  };

  Options.prototype.get = function(name) {
    return this.options[name].valueOf();
  };

  Options.prototype.getOption = function(name) {
    return this.options[name];
  };

  Options.prototype.set = function(name, value) {
    this.options[name].set(value);
  };

  Options.prototype.keys = function() {
    var res = [];
    for (var x in this.options) {
      if (this.options.hasOwnProperty(x)) {
        res.push(x);
      }
    }
    return res;
  };

  exports.Options = Options;

})();
