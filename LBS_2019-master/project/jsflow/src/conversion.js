/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var Value   = monitor.require('values').Value;
  var Label   = monitor.require('label').Label;
  var bot     = Label.bot;

  var modules = monitor.modules;

  // -------------------------------------------------------------
  
  var module = {};
  module.ToPrimitive          = ToPrimitive;
  module.ToBoolean            = ToBoolean;
  module.ToNumber             = ToNumber;
  module.ToInteger            = ToInteger;
  module.ToInt32              = ToInt32;
  module.ToUInt32             = ToUInt32;
  module.ToUInt16             = ToUInt16;
  module.ToString             = ToString;
  module.ToObject             = ToObject;
  module.CheckObjectCoercible = CheckObjectCoercible;
  module.IsCallable           = IsCallable;
  module.SameValue            = SameValue;
  
  // -------------------------------------------------------------
  // ToPrimitive, 9.1  

  function ToPrimitive(x,PreferredType) {
    if (x.value === null || typeof x.value !== 'object') {
      return x;
    }
    
    // will run int the context of x due to value lifting
    var res = x.DefaultValue(PreferredType);
    return res;
  }

  // -------------------------------------------------------------
  // ToBoolean, 9.2

  function ToBoolean(x) {
    return new Value(Boolean(x.value),x.label); 
  }

  // -------------------------------------------------------------
  // ToNumber, 9.3

  function ToNumber(x) {
    if (typeof x.value !== 'object') {
      return new Value(Number(x.value),x.label);
    }

    monitor.context.pushPC(x.label);
    var primValue = ToPrimitive(x, 'number');
    monitor.context.popPC();

    return new Value(Number(primValue.value), primValue.label);
  }

  // -------------------------------------------------------------
  // ToInteger, 9.4
  //        Using ToNumber to capture the ToPrimitive
  //        and rely on the internal conversion at the point of use
  //        should suffice.

  function ToInteger(x) {
    var number = ToNumber(x);

    var sign = function(n) {
      if(n > 0) {
        return 1;
      }
      else if(n < 0) {
        return -1;
      }

      return 0;
    };

    if(isNaN(number.value)) {
      return new Value(0, number.label);
    }
    else if(number.value === 0 ||
            number.value === Number.POSITIVE_INFINITY ||
            number.value === Number.NEGATIVE_INFINITY) {
      return number;
    }
    else {
      return new Value(
        sign(number.value) * Math.floor(Math.abs(number.value)),
        number.label
      );
    }
  }

  // -------------------------------------------------------------
  // ToInt32, 9.5

  function ToInt32(x) {
    return ToNumber(x);
  }

  // -------------------------------------------------------------
  // ToUInt32, 9.6

  function ToUInt32(x) {
    return ToNumber(x);
  }

  // -------------------------------------------------------------
  // ToUInt16, 9.7

  function ToUInt16(x) {
    var sign = function(n) {
      if(n > 0) {
        return 1;
      }
      else if(n < 0) {
        return -1;
      }

      return 0;
    };

    var number = ToNumber(x);
    if(isNaN(number.value) ||
         number.value === 0 ||
         number.value === Number.POSITIVE_INFINITY ||
         number.value === Number.NEGATIVE_INFINITY) {
      return new Value(0, number.label);
    }

    var posInt = sign(number.value) * Math.floor(Math.abs(number.value));
    var int16bit = posInt % Math.pow(2, 16);
    return new Value(int16bit, number.label);
  }

  // -------------------------------------------------------------
  // ToString, 9.8

  function ToString(x) {
    if (typeof x.value !== 'object') return new Value(String(x.value),x.label);
    
    monitor.context.pushPC(x.label);
    var primValue = ToPrimitive(x, 'string');
    monitor.context.popPC();
    return new Value(String(primValue.value), primValue.label);
  }

  // -------------------------------------------------------------
  // ToObject, 9.9

  function ToObject(x) {
    // null or undefined, hence ==
    if (x.value === null || x.value === undefined) {
      monitor.context.pushPC(x.label);

      monitor.Throw(
        monitor.modules.error.TypeErrorObject,
        'cannot convert ' + String(x.value) + ' to object',
        bot
      );
    }


    var res = new Value(x.value, x.label);
    monitor.context.pushPC(x.label);

      switch (typeof x.value) {
        case 'boolean' :
          res.value = new modules.bool.BooleanObject(x.value,x.label);
        break;
        case 'number' : 
          res.value = new modules.number.NumberObject(x.value,x.label);
        break;
        case 'string' : 
          res.value = new modules.string.StringObject(x.value,x.label);
        break;
      }

    monitor.context.popPC();
    return res;
  }

  // -------------------------------------------------------------
  // CheckObjectCoercible, 9.10

  function CheckObjectCoercible(x) {
    if (x.value === null || x.value === undefined) {
      
      monitor.context.raisePC(x.label);

      monitor.Throw(
        modules.error.TypeErrorObject,
        String(x.value) + ' is not coercible',
        x.label
      );
    }
  }

  // -------------------------------------------------------------
  // IsCallable, 9.11

  function IsCallable(x) {
    var b = false;
    if (x.value !== null && typeof x.value === 'object') {
      b = x.value.Call !== undefined;
    }

    return new Value(b,x.label);
  }

  // -------------------------------------------------------------
  // SameValue, 9.12

  function SameValue(x,y) {
    return (x === y);
  } 


  return module;
};
