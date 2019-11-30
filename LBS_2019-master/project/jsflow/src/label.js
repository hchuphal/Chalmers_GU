/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

(function() {

  var Set = require('./set').Set;

  exports.Label = Label;
  exports.le    = le;
  exports.lub   = lub;
  exports.glb   = glb;

  // -------------------------------------------------------------------------- 

  function Label() {

    var principals = Array.prototype.slice.call(arguments);

    if (arguments.length === 1) {
      var arg = arguments[0];
      
      if (arg instanceof Array) {
        principals = arg;
      }

      if (arg instanceof Label) {
        principals = arg.principals;
      }
    }

    this.principals = new Set(principals);
  }

  // -------------------------------------------------------------------------- 

  Label.fromString = function(l) {
    return new Label(l.split(','));
  };

  // -------------------------------------------------------------------------- 

  Label.fromURL = function(l) {
    if (l === undefined) {
      monitor.fatal('fromURL: undefined parameter');
    }
    
    var re  = new RegExp('http://[^/]*/');
    var res = re.exec(l);
    if (res === null) {
      return new Label(l.split(','));
    } else {
      return new Label([res[0]]);
    }
  };

  // -------------------------------------------------------------------------- 

  Label.prototype.lub = function() {
    if (this.principals === true) {
      return this;
    }

    for (var i = 0, len = arguments.length; i < len; i++) {
      var l = arguments[i];
      if (l.principals === true) {
        this.principals = true;
        return this;
      }

      this.principals.union(l.principals);
    }
    return this;
  };

  // -------------------------------------------------------------------------- 

  Label.prototype.glb = function() {
    for (var i = 0, len = arguments.length; i < len; i++) {
      var l = arguments[i];
      if (l.principals === true) {
        continue;
      }

      if (this.principals === true) {
        this.principals = l;
        continue;
      }

      this.principals.intersect(l.principals);
    }
    return this;
  };

  // -------------------------------------------------------------------------- 

  Label.prototype.equals = function(x) {

    if (this.principals === true || x.principals === true) {
      return this.principals === x.principals;
    }

    return this.principals.equals(x.principals);
  };

  // -------------------------------------------------------------------------- 

  Label.prototype.le = function (x) {

    if (x.principals === true) {
      return true;
    }

    if (this.principals === true) { 
      return false;
    }

    return x.principals.isSubset(this.principals);
  };

  // -------------------------------------------------------------------------- 

  Label.prototype.toString = function () {
    var str = (this.principals === true) ? 'T' : this.principals.toString();
    return "<" + str + ">";
  };
  
  // -------------------------------------------------------------------------- 

  Label.bot = new Label([]);
  Label.top = (function() { var x = new Label(); x.principals = true; return x; })();
  //Label.top = new Label([]);

  // -------------------------------------------------------------------------- 

  function le(l1,l2) {
      return (l1.le(l2));
  };

  function lub() {
    var l = new Label();
    l.lub.apply(l,arguments);
    return l;
  }

  function glb() {
    var l = new Label(Label.top);
    l.glb.apply(l,arguments);
    return l;
  }

})();
