/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var constants       = monitor.require('constants');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var _function       = monitor.require('function');
  var error           = monitor.require('error');
  var _               = monitor.require('underscore');

  var Value           = monitor.require('values').Value;

  var Ecma            = ecma.Ecma;
  var BiFO            = _function.BuiltinFunctionObject;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------

  var module = {};
  module.ArrayObject = ArrayObject;
  module.allocate    = allocate;

  // ------------------------------------------------------------

  function allocate(global) {
    var arrayConstructor = new ArrayConstructor(global.Array);
    var arrayPrototype   = arrayConstructor._proto; 

    return { ArrayConstructor : arrayConstructor,
             ArrayPrototype   : arrayPrototype
           };
  }

  // ------------------------------------------------------------
  // 15.4.3
  
  function ArrayConstructor(host) {
    Ecma.call(this);

    this.host = host;

    this.Prototype  = new Value(monitor.instances.FunctionPrototype,bot);
    this.Class      = 'Function';
    this.Extensible = true;
    this._proto     = new ArrayPrototype(this, host.prototype);

    ecma.DefineFFF(this,constants.length,1);
    ecma.DefineFFF(this,constants.prototype, this._proto);

    ecma.DefineTFT(this , constants.isArray , new BiFO(isArray , 1,Array.prototype.isArray ));
  }

  prelude.inherits(ArrayConstructor,Ecma);
  ArrayConstructor.prototype.HasInstance = _function.HasInstance;

  // ------------------------------------------------------------

  ArrayConstructor.prototype.Call = function(thisArg,args) {
    return this.Construct(args);
  };

  // ------------------------------------------------------------

  ArrayConstructor.prototype.Construct = function(args) {

    var array;
    var len = args.length;

    if (len === 0 || len >= 2) {
      array = ArrayObject.fromValueArray(args,bot);
    } else {

      var arg = args[0];
      if (typeof arg.value === 'number') {
        array = new ArrayObject();
        array.properties.length = arg.value;
        array.labels.length = {
          value     : arg.label,
          existence : bot
        };
      } else {
        array = ArrayObject.fromValueArray(args,bot);
      }
    }

    return new Value(array,bot);
  };

  // ------------------------------------------------------------
  // isArray, 15.4.3.1

  var isArray = function(thisArg, args) {
    var arg = args[0] || new Value(undefined,bot);

    if (arg === null || typeof arg.value !== 'object') {
      return new Value(false,arg.label);
    }

    return new Value(arg.value.Class === 'Array',arg.label);
  };

  // ------------------------------------------------------------
  // 15.4.4
  function ArrayPrototype(constructor, host) {
    Ecma.call(this);

    this.Prototype = new Value(monitor.instances.ObjectPrototype,bot);
    this.Class     = 'Array';

    this.host = host;
    
    ecma.Define(this, constants.length,0, { writable : true });
    ecma.DefineTFT(this, constants.constructor, constructor);

    ecma.DefineTFT(this, constants.toString      , new BiFO(toString      , 0, Array.prototype.toString));
    ecma.DefineTFT(this, constants.toLocaleString, new BiFO(toLocaleString, 0, Array.prototype.toLocaleString));
    ecma.DefineTFT(this, constants.concat        , new BiFO(concat        , 1, Array.prototype.concat));
    ecma.DefineTFT(this, constants.join          , new BiFO(join          , 1, Array.prototype.join));
    ecma.DefineTFT(this, constants.pop           , new BiFO(pop           , 0, Array.prototype.pop));
    ecma.DefineTFT(this, constants.push          , new BiFO(push          , 1, Array.prototype.push));
    ecma.DefineTFT(this, constants.reverse       , new BiFO(reverse       , 0, Array.prototype.reverse));
    ecma.DefineTFT(this, constants.shift         , new BiFO(shift         , 0, Array.prototype.shift));
    ecma.DefineTFT(this, constants.slice         , new BiFO(slice         , 2, Array.prototype.slice));
    ecma.DefineTFT(this, constants.sort          , new BiFO(sort          , 1, Array.prototype.sort));
    ecma.DefineTFT(this, constants.splice        , new BiFO(splice        , 2, Array.prototype.splice));
    ecma.DefineTFT(this, constants.unshift       , new BiFO(unshift       , 1, Array.prototype.unshift));
    ecma.DefineTFT(this, constants.indexOf       , new BiFO(indexOf       , 1, Array.prototype.indexOf));
    ecma.DefineTFT(this, constants.lastIndexOf   , new BiFO(lastIndexOf   , 1, Array.prototype.lastIndexOf));
    ecma.DefineTFT(this, constants.every         , new BiFO(every         , 1, Array.prototype.every));
    ecma.DefineTFT(this, constants.some          , new BiFO(some          , 1, Array.prototype.some));
    ecma.DefineTFT(this, constants.forEach       , new BiFO(forEach       , 1, Array.prototype.forEach));
    ecma.DefineTFT(this, constants.map           , new BiFO(map           , 1, Array.prototype.map));
    ecma.DefineTFT(this, constants.filter        , new BiFO(filter        , 1, Array.prototype.filter));
    ecma.DefineTFT(this, constants.reduce        , new BiFO(reduce        , 1, Array.prototype.reduce));
    ecma.DefineTFT(this, constants.reduceRight   , new BiFO(reduceRight   , 1, Array.prototype.reduceRight));

  }

  prelude.inherits(ArrayPrototype,Ecma);

  // ------------------------------------------------------------
  // toString, 15.4.4.2

  var toString = function(thisArg,args) {
    var array = conversion.ToObject(thisArg);
    var func  = array.Get(constants.join);

    if (!conversion.IsCallable(func).value) {
      func = monitor.instances.ObjectPrototype.Get(constants.toString);
    } 

    return func.value.Call(array,[]);
  };
  
  // ------------------------------------------------------------
  // toLocaleString, 15.4.4.3
  var toLocaleString = function(thisArg) {
    var array, arrayLen, len, separator, firstElement, R, elementObj,
        func, k, S, nextElement;
    
    array = conversion.ToObject(thisArg);
    arrayLen = array.Get(new Value("length", bot));
    len = conversion.ToUInt32(arrayLen);
    separator = ',';

    var label = lub(monitor.context.effectivePC, array.label);
    
    if(len.value === 0) {
      return new Value("", label);
    }

    firstElement = array.Get(new Value("0", bot));
    
    if(firstElement.value === undefined || firstElement.value === null) {
      R = new Value("", label);
    }
    else {
      elementObj = conversion.ToObject(firstElement);
      func = elementObj.Get(new Value("toLocaleString", bot));
      
      if(conversion.IsCallable(func).value === false) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.toLocaleString: not a function',
          bot
        );
      }

      R = func.value.Call(elementObj, []);
    }
    
    k = 1;
    while(k < len.value) {
      S = R.value.concat(separator);
      
      nextElement = array.Get(new Value('' + k, bot));

      if(nextElement.value === undefined || firstElement.value === null) {
        R = new Value("", label);
      }
      else {
        elementObj = conversion.ToObject(nextElement);
        func = elementObj.Get(new Value("toLocaleString", bot));

        if(conversion.IsCallable(func).value === false) {
          monitor.Throw(
            monitor.modules.error.TypeErrorObject,
            'Array.prototype.toLocaleString: not a function',
            bot
          );
        }

        R = func.value.Call(elementObj, []);
      }
      R = new Value(S.concat(R.value), R.label);
      k++;
    }

    R.raise(label);
    return R;
  }

  
  // ------------------------------------------------------------
  // concat, 15.4.4.4
  var concat = function(thisArg,args) {
    var O = conversion.ToObject(thisArg);
    var A = new ArrayObject();

    var n = 0;
    var c = monitor.context;
    var label = new Label();

    function aux(E) {
      c.pushPC(E.label); 

        label.lub(E.label);

        if (E.value && E.value.Class === 'Array') {
          var k   = 0;
          var len = E.Get(constants.length);
        
          label.lub(len.label);

          monitor.context.pushPC(len.label);

            while (k < len.value) {
              var _k = new Value(k,bot);
              var exists = E.HasProperty(_k);

              if (exists.value) {
                monitor.context.pushPC(exists.label);

                  var subElement = E.Get(_k);

                  A.DefineOwnProperty(new Value(n,label), {
                    value : subElement.value,
                    label : subElement.label, 
                    writable     : true,
                    enumerable   : true, 
                    configurable : true
                  }, false);

                monitor.context.popPC();
              }

              n++;
              k++;
            }

          monitor.context.popPC();

        } else {
          A.DefineOwnProperty(new Value(n,label), {
            value : E.value,
            label : E.label, 
            writable     : true,
            enumerable   : true, 
            configurable : true
          }, false);
          n++;
        }

      c.popPC();
    }

    aux(O);
    for (var i = 0, len = args.length; i < len; i++) {
      aux(args[i]);
    }

    // This is a fix they added in ECMA-262 v6 standard, but browsers used it
    // in ECMA-262 v5 as well.
    A.Put(new Value("length", bot), new Value(n, bot));
    
    return new Value(A,bot);
  };

  // ------------------------------------------------------------
  // join, 15.4.4.5
  
  function join(thisArg,args){
    var O   = conversion.ToObject(thisArg);
    var len = conversion.ToUInt32(O.Get(constants.length));


    var separator = args[0];
    
    if (separator) { 

      if (separator.value === undefined) {
        separator.value = ',';
      }
    
      separator = conversion.ToString(separator);
    } else {
      separator = new Value(undefined, bot);
    }

    var label = lub(len.label, separator.label); 
    var arr   = [];
    for (var i = 0; i < len.value; i++) {
     
      var v = O.Get(new Value(i,bot));
      var y;
      if (v.value === undefined || v.value === null) {
        y = new Value('', v.label); 
      } else {
        y = conversion.ToString(v);
      }

      arr[i] = y.value;

      label  = lub(label, y.label);
    }

    var res = arr.join(separator.value);
    return new Value(res,label);
  };

  // ------------------------------------------------------------
  // pop, 15.4.4.6

  function pop(thisArg,args){
    var O   = conversion.ToObject(thisArg);
    var len = conversion.ToUInt32(O.Get(constants.length));

    if (len.value === 0) {
      O.Put(constant.length, len, true);
      return new Value(undefined,len.label);
    }

    var indx = new Value(len.value-1,len.label);
    var element = O.Get(indx);

    O.Delete(indx, true);

    O.Put(constants.length,indx,true);
    return element;
  };

  // ------------------------------------------------------------
  // push, 15.4.4.7

  function push(thisArg,args){
    var O = conversion.ToObject(thisArg);
    var n = conversion.ToUInt32(O.Get(constants.length));

    for (var i = 0, len = args.length; i < len; i++) {
      var E = args[i];
      O.Put(n,E);
      n.value++;
    }

    O.Put(constants.length,n,true);

    return n;
  }

  // ------------------------------------------------------------
  // reverse, 15.4.4.8

  function reverse(thisArg,args) {
    var O = conversion.ToObject(thisArg);
    var len = conversion.ToUInt32(O.Get(constants.length));

    var P = len;
    len = len.value;

    var middle = Math.floor(len/2);
    var lower  = 0;

    var c = monitor.context;

    while (lower !== middle && lower > -2) {
      var upper = len - lower - 1;

      P.value = lower;
      var lowerValue = O.Get(P);
      P.value = upper;
      var upperValue = O.Get(P);
      P.value = lower;
      var lowerExists = O.HasProperty(P);
      P.value = upper;
      var upperExists = O.HasProperty(P);

      c.pushPC(lub(lowerExists.label,upperExists.label));

        if (lowerExists.value && upperExists.value) {
          P.value = lower;
          O.Put(P,upperValue,true);
          P.value = upper;
          O.Put(P,lowerValue,true);
        } else if (!lowerExists.value && upperExists.value) {
          P.value = lower;
          O.Put(P,upperValue,true);
          P.value = upper;
          O.Delete(P,true);
        } else if (lowerExists.value && !upperExists.value) {
          P.value = lower;
          O.Delete(P,true);
          P.value = upper;
          O.Put(P,lowerValue,true);
        }
      c.popPC();
      lower++;
    }
    
    return O;
  }

  // ------------------------------------------------------------
  // shift, 15.4.4.9

  function shift(thisArg, args) {
    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len    = conversion.ToUInt32(lenVal);

    if (len.value === 0) {
      monitor.context.pushPC(len.label);
        O.Put(constants.length, len, true);
      monitor.context.popPC();

      return new Value(undefined, len.label);
    }

    var first = O.Get(new Value(0,bot));
    var k = 1;

    monitor.context.pushPC(len.label);

      while (k < len.value) {
      
        var from  = k;
        var _from = new Value(from, len.label); 
        var to    = k - 1;
        var _to   = new Value(to, len.label);

        var fromPresent = O.HasProperty(_from);

        if (fromPresent.value) {
          monitor.context.pushPC(fromPresent.label);

            var fromVal = O.Get(_from);
            O.Put(_to, fromVal,true);

          monitor.context.popPC();
        } else {
          O.Delete(_to, true);
        }
        k++;
      }
    monitor.context.popPC();

    len.value--;
    O.Delete(len, true);
    O.Put(constants.length, len, true);

    return first;
  };
  

  // ------------------------------------------------------------
  // slice, 15.4.4.10

  function slice(thisArg,args) {
    var O = conversion.ToObject(thisArg);
    var A = new ArrayObject();

    var lenVal = O.Get(constants.length);
    var len    = conversion.ToUInt32(lenVal);

    var start  = args[0] ? args[0] : new Value(undefined,bot);
    var end    = args[1] ? args[1] : new Value(undefined,bot);

    var relativeStart = conversion.ToInteger(start);

    var k = new Value(0,lub(len.label, relativeStart.label));

    if (relativeStart.value < 0) {
      k.value = Math.max(len.value + relativeStart.value, 0);
    } else {
      k.value = Math.min(relativeStart.value, len.value);
    }

    var relativeEnd;
    if (end.value === undefined) {
      relativeEnd = len;
    } else {
      relativeEnd = conversion.ToInteger(end);
    }
    

    var _final = new Value(0,lub(len.label, relativeStart.label));

    if (relativeEnd.value < 0) {
      _final.value = Math.max(len.value + relativeEnd.value, 0);
    } else {
      _final.value = Math.min(relativeEnd.value, len.value);
    }

    var n = 0;

    monitor.context.pushPC(lub(k.label,_final.label));

      while (k.value < _final.value) {
        var Pk = conversion.ToString(k);
        var kPresent = O.HasProperty(Pk);
        if (kPresent.value) {
          var kValue = O.Get(Pk);
          A.DefineOwnProperty(new Value(n,bot), {
            value        : kValue.value, 
            label        : kValue.label,
            writable     : true,
            enumerable   : true,
            configurable : true
          }, false);
        }
        k.value++;
        n++;
      }
    
    monitor.context.popPC();
    return new Value(A,bot);
  };
    
  // ------------------------------------------------------------
  // sort, 15.4.4.11

  var sort = function(thisArg, args) {
    var comparefun = args[0] || new Value(undefined,bot);
    
    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);
    
    var label = new Label();
    label.lub(O.label, len.label);

    var c = monitor.context;
    c.pushPC(len.label);

      var array = [];
      var k = new Value(0,len.label);
      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        
        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
            var kValue = O.Get(k);
            kValue.raise(label);

            array[k.value] = kValue; 
        }
        k.value++;
      }
  
      var isCallable = conversion.IsCallable(comparefun);
      c.labels.pc.lub(isCallable.label);

      if (comparefun.value !== undefined && !isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.sort: not a function',
          bot
        );
      }
      
      var comparefunWrapper;
      if (comparefun.value) {
      
        comparefunWrapper = function(x,y) {
          if (x.value === undefined) {
            label.lub(x.label);
            return 1;
          }
          if (y.value === undefined) {
            label.lub(y.label);
            return -1;
          }
          var result = comparefun.Call(new Value(undefined,bot), [x,y]);
          c.labels.pc.lub(result.label,x.label,y.label);
          label.lub(result.label,x.label,y.label);
          return result.value;
        };

      } else {
        
        comparefunWrapper = function(x,y) {

          if (x.value === undefined) {
            label.lub(x.label);
            return 1;
          }
          if (y.value === undefined) {
            label.lub(y.label);
            return -1;
          }

          var xString = conversion.ToString(x);
          var yString = conversion.ToString(y);

          c.labels.pc.lub(xString.label,yString.label);
          label.lub(xString.label,yString.label);

          if (xString.value < yString.value) {
            return -1;
          }

          if (xString.value > yString.value) {
            return 1;
          }

          return 0;
        };

      }
      array = array.sort(comparefunWrapper);

      for (var i = 0, len = array.length; i < len; i++) {
        var v = array[i];
        
        if (v) {
          O.Put(new Value(i,label), v, true);
        } else {
          O.Delete(new Value(i,label), true);
        }
      }

    c.popPC();
    return O;
  };

  // ------------------------------------------------------------
  // splice, 15.4.4.12
  function splice(thisArg, args) {

    var start       = args[0] || new Value(undefined,bot);
    var deleteCount = args[1] || new Value(undefined,bot);
    
    var O = conversion.ToObject(thisArg);
    var A = new ArrayObject();

    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var relativeStart = conversion.ToInteger(start);
    var actualStart = new Value(null, lub(len.label, relativeStart.label));

    if (relativeStart.value < 0) {
      actualStart.value = Math.max((len.value + relativeStart.value), 0);
    } else {
      actualStart.value = Math.min(relativeStart.value,len.value);
    }

    deleteCount = conversion.ToInteger(deleteCount);
    var actualDeleteCount = new Value(null, lub(deleteCount.label,actualStart.label));
    actualDeleteCount.value = Math.min(Math.max(deleteCount.value, 0), len.value - actualStart.value);

    var k = 0;
    monitor.context.pushPC(actualDeleteCount.label);
      while (k < actualDeleteCount.value) {
        var from = new Value(actualStart.value + k, actualStart.label);
        var fromPresent = O.HasProperty(from);

        monitor.context.pushPC(fromPresent.label);
          if (fromPresent.value) {
            var fromValue = O.Get(from);
            A.DefineOwnProperty(new Value(k,actualDeleteCount.label), {
                value : fromValue.value,
                label : fromValue.label,
                writable : true,
                enumberable : true,
                configurable : true
              }
            );
          }
        monitor.context.popPC();

        k++;
      }
    monitor.context.popPC();

    var items = [];
    for (var i = 0; i < args.length - 2; i++) {
      items[i] = args[i+2];
    }

    var itemCount = items.length;
    if (itemCount < actualDeleteCount.value) {
      var k = actualStart.value;

      monitor.context.pushPC(actualStart.label);
      
        while (k < len.value - actualDeleteCount.value) {
          var from = new Value(k + actualDeleteCount.value, lub(actualStart.label, actualDeleteCount.label));
          var to   = new Value(k + itemCount, actualStart.label);
          var fromPresent = O.HasProperty(from);

          monitor.context.pushPC(fromPresent.label);

          if (fromPresent.value) {
            var fromValue = O.Get(from);
            O.Put(to,fromValue,true);
          } else {
            O.Delete(to, true);
          }

          k++;

          monitor.context.popPC();
        }
      
      monitor.context.popPC();

      k = len.value;

      monitor.context.pushPC(lub(len.label, actualDeleteCount.label));
      
        while (k > (len.value - actualDeleteCount.value + itemCount)) {
          O.Delete(new Value(k, len.label));
          k--;
        }

      monitor.context.popPC();

    } else if (itemCount > actualDeleteCount.value) {

      var k = len.value - actualDeleteCount.value;
    
      monitor.context.pushPC(lub(len.label, actualDeleteCount.label));
      
        while (k > actualStart.value) {
          var from = new Value(k + actualDeleteCount.value - 1, actualDeleteCount.label);
          var to = new Value(k + itemCount - 1, bot);
          var fromPresent = O.HasProperty(from);
      
            
          if (fromPresent.value) {
            var fromValue = O.Get(from);
            O.Put(to,fromValue,true);
          } else {
            O.Delete(to,true);
          }
          k--;
        }
      
      monitor.context.popPC();

    }

    k = actualStart.value;
    for (var i = 0; i < items.length; i++) {
      O.Put(new Value(k+i, actualStart.label), items[i], true);
    }

    O.Put(constants.length, new Value(len.value - actualDeleteCount.value + itemCount, lub(len.label, actualDeleteCount.label)), true);
    return new Value(A, bot);
  };

  // ------------------------------------------------------------
  // unshift, 15.4.4.13

  function unshift(thisArg, args) {
    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);
    var argCount = args.length;
    var k = len.value;

    monitor.context.pushPC(len.label);
      while (k > 0) {
        var from = new Value(k-1, len.label);
        var to = new Value(k+argCount-1, len.label);
        var fromPresent = O.HasProperty(from);

        monitor.context.pushPC(fromPresent.label);
          if (fromPresent.value) {
            var fromValue = O.Get(from);
            O.Put(to,fromValue,true);
          } else {
            O.Delete(to,true);
          }
        monitor.context.popPC();

        k--;
      }
    monitor.context.popPC();

    var j = 0;
    var items = args;
    for (; j < argCount; j++) {
      var E = items[j];
      O.Put(new Value(j,bot), E, true);
    }

    O.Put(constants.length, new Value(len.value + argCount, len.label));
    return new Value(len.value + argCount, len.label);
  };

  // ------------------------------------------------------------
  // indexOf, 15.4.4.14
  
  function indexOf(thisArg, args) {
    var searchElement = args[0] || new Value(undefined,bot);
    var fromIndex     = args[1]; 

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;

    if (len.value === 0) {
      return new Value(-1,len.label);
    }

    var label = new Label();
    c.pushPC(len.label);
    label.lub(len.label);

      var n = fromIndex ? conversion.ToInteger(fromIndex) : new Value(0,bot);

      c.labels.pc.lub(n.label);
      label.lub(n.label);

      if (n.value >= len.value) {
        c.popPC();
        return new Value(-1,label);
      }

      var k;
      if (n.value >= 0) {
        k = n;
      } else {
        k = new Value(len.value - Math.abs(n.value), lub(len.label,n.label));
        if (k.value < 0) {
          k.value = 0;
        }
      }

      while (k.value < len.value) {
        var kString = conversion.ToString(k);
        var kPresent = O.HasProperty(kString);

        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var elementK = O.Get(kString);
          
          c.labels.pc.lub(elementK.label);
          label.lub(elementK.label);

          var same = searchElement.value === elementK.value;

          if (same) {
            k.label = label;
            c.popPC();
            return k;
          }
        }

        k.value++;
      }

    c.popPC();
    k.value = -1;
    k.label = label;
    return k;
  }

  // ------------------------------------------------------------
  // lastIndexOf, 15.4.4.15

  function lastIndexOf(thisArg,args) {
    var searchElement = args[0] || new Value(undefined,bot);
    var fromIndex     = args[1]; 

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;

    if (len.value === 0) {
      return new Value(-1,len.label);
    }

    var label = new Label();

    c.pushPC(len.label);
    label.lub(len.label);

      var n = fromIndex ? conversion.ToInteger(fromIndex) : new Value(len.value - 1, len.label);
  
      var k;
      if (n.value >= 0) {
        k = new Value(Math.min(n.value, len.value - 1), lub(n.label,len.label));
      } else {
        k = new Value(len.value - Math.abs(n.value), lub(n.label,len.label));
      }

      c.labels.pc.lub(k.label);
      label.lub(k.label);

      while (k.value >= 0) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var elementK = O.Get(k);

          c.labels.pc.lub(elementK.label);
          label.lub(elementK.label);

          var same = searchElement.value === elementK.value;

          if (same) {
            k.label = label;
            c.popPC();
            return k;
          }
        }
        k.value--;
      }

    c.popPC();
    
    k.value = -1;
    k.label = label;
    return k;
  }

  // ------------------------------------------------------------
  // every, 15.4.4.16

  function every(thisArg,args) {
    var callbackfn      = args[0] || new Value(undefined,bot);
    var callbackthisArg = args[1] || new Value(undefined,bot);

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    var label = new Label();
    label.lub(isCallable.label);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var k = new Value(0,len.label);
      c.labels.pc.lub(len.label);
      label.lub(len.label);
      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var kValue     = O.Get(k);
          var testResult = callbackfn.Call(callbackthisArg, [kValue, k, O]);
          var b = conversion.ToBoolean(testResult);
          c.labels.pc.lub(b.label);
          label.lub(b.label);

          if (!b.value) {
            c.popPC();
            return new Value(false,label);
          }
        }
        k.value++;
      }

    c.popPC();
    return new Value(true,label);
  }

  // ------------------------------------------------------------
  // some, 15.4.4.17

  function some(thisArg,args) {
    var callbackfn      = args[0] || new Value(undefined,bot);
    var callbackthisArg = args[1] || new Value(undefined,bot);

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    var label = new Label();
    label.lub(isCallable.label);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var k = new Value(0,len.label);
      c.labels.pc.lub(len.label);
      label.lub(len.label);
      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var kValue     = O.Get(k);
          var testResult = callbackfn.Call(callbackthisArg, [kValue, k, O]);
          var b = conversion.ToBoolean(testResult);
          c.labels.pc.lub(b.label);
          label.lub(b.label);

          if (b.value) {
            c.popPC();
            return new Value(true,label);
          }
        }
        k.value++;
      }

    c.popPC();
    return new Value(false,label);
  }

  // ------------------------------------------------------------
  // forEach, 15.4.4.18

  function forEach(thisArg,args) {
    var callbackfn      = args[0] || new Value(undefined,bot);
    var callbackthisArg = args[1] || new Value(undefined,bot);

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var k = new Value(0,len.label);
      c.labels.pc.lub(len.label);

      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);

        if (kPresent.value) {
          var kValue = O.Get(k);
          callbackfn.Call(callbackthisArg, [kValue, k, O]);
        }
        k.value++;
      }

    c.popPC();
    return new Value(undefined,bot);
  }

  // ------------------------------------------------------------
  // map, 15.4.4.19

  function map(thisArg,args) {
    var callbackfn      = args[0] || new Value(undefined,bot);
    var callbackthisArg = args[1] || new Value(undefined,bot);

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var A = new monitor.modules.array.ArrayObject();
      A.properties.length = len.value;
      A.labels.length = {
        value     : len.label,
        existence : bot
      };

      var k = new Value(0,len.label);
      c.labels.pc.lub(len.label);

      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);

        if (kPresent.value) {
          var kValue = O.Get(k);
          var mappedValue = callbackfn.Call(callbackthisArg, [kValue, k, O]);

          A.DefineOwnProperty(k, {
            value        : mappedValue.value, 
            label        : mappedValue.label,
            writable     : true,
            enumerable   : true,
            configurable : true
          }, false);

        }
        k.value++;
      }

    c.popPC();
    return new Value(A,bot);
  }

  // ------------------------------------------------------------
  // filter, 15.4.4.20

  function filter(thisArg,args) {
    var callbackfn      = args[0] || new Value(undefined,bot);
    var callbackthisArg = args[1] || new Value(undefined,bot);

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var A = new monitor.modules.array.ArrayObject();

      var k  = new Value(0,len.label);
      var to = new Value(0,len.label);

      c.labels.pc.lub(len.label);

      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);
        c.labels.pc.lub(kPresent.label);

        if (kPresent.value) {
          var kValue = O.Get(k);
          var selected = callbackfn.Call(callbackthisArg, [kValue, k, O]);
          selected = conversion.ToBoolean(selected);

          c.labels.pc.lub(selected.label);

          if (selected.value) {
            A.DefineOwnProperty(to, {
              value        : kValue.value,
              label        : kValue.label,
              writable     : true,
              enumerable   : true,
              configurable : true
            }, false);

            to.value++;
          }
        }
        k.value++;
      }

    c.popPC();
    return new Value(A,bot);
  }

  // ------------------------------------------------------------
  // reduce, 15.4.4.21

  function reduce(thisArg,args) {
    var callbackfn   = args[0] || new Value(undefined,bot);
    var initialValue = args[1];

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    var label = new Label();
    label.lub(isCallable.label);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var k  = new Value(0,len.label);
      var accumulator;

      if (initialValue) {
        accumulator = initialValue;
      } else {
        var kPresent = new Value(false,bot);

        c.labels.pc.lub(len.label);
        label.lub(len.label);

        while (!kPresent.value && k.value < len.value) {
          kPresent = O.HasProperty(k);

          c.labels.pc.lub(kPresent.label);
          label.lub(kPresent.label);

          if (kPresent.value) {
            accumulator = O.Get(k);
          }
          k.value++;
        }

        if (!kPresent.value) {
          monitor.Throw(
            monitor.modules.error.TypeErrorObject,
            'Array.prototype.reduce: empty array with no initial value',
            bot
          );
        }
      }

      while (k.value < len.value) {
        var kPresent = O.HasProperty(k);

        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var kValue = O.Get(k);
          accumulator = callbackfn.Call(new Value(undefined,bot), [accumulator, kValue, k, O]);
        }
        k.value++;
      }

    c.popPC();
    accumulator.raise(label);
    return accumulator;
  }

  // ------------------------------------------------------------
  // reduceRight, 15.4.4.22

  function reduceRight(thisArg,args) {
    var callbackfn   = args[0] || new Value(undefined,bot);
    var initialValue = args[1];

    var O = conversion.ToObject(thisArg);
    var lenVal = O.Get(constants.length);
    var len = conversion.ToUInt32(lenVal);

    var c = monitor.context;
    var isCallable = conversion.IsCallable(callbackfn);

    var label = new Label();
    label.lub(isCallable.label);

    c.pushPC(isCallable.label);

      if (!isCallable.value) {
        monitor.Throw(
          monitor.modules.error.TypeErrorObject,
          'Array.prototype.every: not a function',
          bot
        );
      }

      var k  = new Value(len.value - 1,len.label);
      var accumulator;

      if (initialValue) {
        accumulator = initialValue;
      } else {
        var kPresent = new Value(false,bot);

        c.labels.pc.lub(len.label);
        label.lub(len.label);

        while (!kPresent.value && k.value >= 0) {
          kPresent = O.HasProperty(k);

          c.labels.pc.lub(kPresent.label);
          label.lub(kPresent.label);

          if (kPresent.value) {
            accumulator = O.Get(k);
          }
          k.value--;
        }

        if (!kPresent.value) {
          monitor.Throw(
            monitor.modules.error.TypeErrorObject,
            'Array.prototype.reduce: empty array with no initial value',
            bot
          );
        }
      }

      while (k.value >= 0) {
        var kPresent = O.HasProperty(k);

        c.labels.pc.lub(kPresent.label);
        label.lub(kPresent.label);

        if (kPresent.value) {
          var kValue = O.Get(k);
          accumulator = callbackfn.Call(new Value(undefined,bot), [accumulator, kValue, k, O]);
        }
        k.value--;
      }

    c.popPC();
    accumulator.raise(label);
    return accumulator;
  }

  // ------------------------------------------------------------
  // 15.4.2.1, and 15.4.2.2

  function ArrayObject(struct) {
    Ecma.call(this);

    this.Class      = 'Array';
    
    this.Prototype  = new Value(monitor.instances.ArrayPrototype,bot);
    this.Extensible = true;

    this.properties = [];
    this.labels     = {};
    
    struct = struct || bot;
    this.labels.length = {
      value     : struct,
      existence : bot
    };

    this.struct = struct;
  }

  prelude.inherits(ArrayObject,Ecma);

  // ---

  ArrayObject.fromValueArray = function(values, struct) {
    var array = new ArrayObject(struct);

    for (var i = 0, len = values.length; i < len; i++) {
      var value = values[i];
      array.properties[i] = value.value;
      array.labels[i] = {
        value     : value.label,
        existence : bot
      };
    }
   
    return array;
  };

  // ---

  ArrayObject.fromPropertyArray = function(values, struct) {
    var array = new ArrayObject(struct);

    for (var i = 0, len = values.length; i < len; i++) {
      var value = values[i];
      array.properties[i] = value.value;
      array.labels[i] = {
        value     : value.label,
        existence : value.label
      };
    }
   
    return array;
  };

  // ---

  ArrayObject.fromArray = function(values, label, existence) {
    var array = new ArrayObject(existence);

    for (var i = 0, len = values.length; i < len; i++) {
      array.properties[i] = values[i];
      array.labels[i] = {
        value     : label,
        existence : existence
      };
    }
    return array;
  };

  // ---

  ArrayObject.prototype.toString = function() {
    return this.properties.toString();
  };

  // ---

  ArrayObject.prototype.DefineOwnProperty = function(s,desc,Throw) {
    var c = monitor.context;
    
    var lengthContext = lub(c.effectivePC, s.label);
    if (!le(lengthContext, this.labels.length.value)) {
      var msgt = _.template('Array.prototype.DefineOwnProperty: write context {{wc}} not below length label {{ll}}');
      monitor.securityError(msgt({wc : lengthContext, ll : this.labels.length.value }));
    }
     
    return Ecma.prototype.DefineOwnProperty.call(this,s,desc,Throw);
  };

  // ---

  ArrayObject.prototype.toNative = function(deep) {
    var clone = [];
    var lbl = new Label();

    for (var i = 0, len = this.properties.length; i < len; i++) {
      var v = this.properties[i];
      var t = typeof v;

      lbl.lub(this.labels[i].existence, this.labels[i].value);

      if (t !== 'object' && t !== 'function') {
        clone[i] = v;
      } else {
        clone[i] = null;
      }
    }

    return new Value(clone,lbl);

  };

  // ---
 
  return module;
};
