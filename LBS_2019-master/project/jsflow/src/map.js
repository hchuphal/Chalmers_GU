/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

(function() {

  exports.Map = Map;

  function Map(carrier) {
    this.carrier = carrier;

    if (this.carrier === undefined) {
      this.carrier = {};
    }
  }

  Map.fromObject = function(o) {
    var m = new Map();

    for (var x in o) {
      if (o.hasOwnProperty(x)) {
        m.set(x,o[x]);
      }
    }

    return m;
  };

  Map.prototype.has = function(s) {
    return Object.hasOwnProperty.call(this.carrier, s);
  };

  Map.prototype.get = function(s) {

    if (this.has(s)) {
      return this.carrier[s];
    }

    return undefined;
  };

  Map.prototype.set = function(s,v) { 
    this.carrier[s] = v;
  };

  Map.prototype.del = function(s) {
    delete this.carrier[s];
  };

  Map.prototype.keys = function() {
    return Object.getOwnPropertyNames(this.carrier);
  };

  Map.prototype.keysIterator = function() {
    return new MapIterator(this);
  };

  function MapIterator(map) {
    this.map   = map;
    this.index = 0;
    this.data  = [];

    for (var x in map.carrier) {
      if (map.has(x)) {
        this.data.push(x);
      }
    }
  }

  MapIterator.prototype.hasNext = function() {
    return this.index < this.data.length;
  };

  MapIterator.prototype.next = function() {
    return this.data[this.index++];
  };

})();
