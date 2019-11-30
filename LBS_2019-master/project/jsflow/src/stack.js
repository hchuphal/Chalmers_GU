/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

(function() {

  exports.Stack = Stack;

  function Stack() {
    this.content = [];
  }

  Stack.prototype.push = function(v) {
    this.content.push(v);
  };

  Stack.prototype.pop = function() {
    return this.content.pop();
  };

  Stack.prototype.peek = function() {
    return this.content[this.content.length-1];
  };

  Stack.prototype.dup = function() {
    this.push(this.peek());
  };

  Stack.prototype.marker = function() {
    return { length : this.content.length };
  };

  Stack.prototype.reset = function(m) {
    this.content.length = m.length;
  };

  Stack.prototype.iter = function(f) {
    for (var i = 0, len = this.content.length; i < len; i++) {
      f(this.content[i]);
    }
  };

  Stack.prototype.map = function(f, m) {
    for (var i = m.length, len = this.content.length; i < len; i++) {
      this.content[i] = f(this.content[i]);
    }
  };

  Stack.prototype.size = function() {
    return this.content.length;
  };

  Stack.prototype.empty = function() {
    return this.content.length === 0;
  };

  Stack.prototype.toArray = function() {
    return this.content.slice(0);
  };

})();
