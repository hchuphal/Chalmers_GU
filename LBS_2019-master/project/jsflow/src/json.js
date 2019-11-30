/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var prelude    = monitor.require('prelude');
  var label      = monitor.require('label');
  var conversion = monitor.require('conversion');
  var constants  = monitor.require('constants');
  var ecma       = monitor.require('ecma');
  var _function  = monitor.require('function');

  var object     = monitor.require('object');
  var array      = monitor.require('array');
  var number     = monitor.require('number');
  var string     = monitor.require('string');
  
  var BiFO       = _function.BuiltinFunctionObject;
  var Value      = monitor.require('values').Value;

  var Label      = label.Label;
  var lub        = label.lub;
  var glb        = label.glb;
  var le         = label.le;

  var bot        = Label.bot;

  // ------------------------------------------------------------
  
  var module = {};
  module.allocate   = allocate;

  // ------------------------------------------------------------

  function allocate(host) {
    var jsonObject = new JSONObject(host.JSON);
    return { JSONObject : jsonObject };
  }

  // ------------------------------------------------------------
  // The JSON object, 15.12
  function JSONObject(host) {
    ecma.Ecma.call(this);
    
    this.Prototype  = new Value(monitor.instances.ObjectPrototype, bot);
    this.Class      = 'JSON';
    this.Extensible = true; 
    this.host       = host;

    ecma.DefineFFF(this, constants.prototype, monitor.instances.ObjectPrototype);
 
    ecma.DefineTFT(this , constants.parse     , new BiFO(parse     , 2 , this.host.parse));
    ecma.DefineTFT(this , constants.stringify , new BiFO(stringify , 3 , this.host.stringify));
  }

  prelude.inherits(JSONObject, ecma.Ecma);

  // By the standard, there should be no Call or Construct for JSON object,
  // so throw a TypeError (as SpiderMonkey seem to do)
  JSONObject.prototype.Call = function() {
    monitor.Throw(
      monitor.modules.error.TypeErrorObject,
      'JSON is not a function',
      bot
    );
  };

  JSONObject.prototype.Construct = function() {
    monitor.Throw(
      monitor.modules.error.TypeErrorObject,
      'JSON is not a constructor',
      bot
    );
  }

  // ------------------------------------------------------------
  // parse, 15.12.2
  var parse = function(thisArg, args) {
    if(args[0] === undefined) {
      monitor.Throw(
        monitor.modules.error.SyntaxErrorObject,
        'JSON.parse: No string to parse',
        bot
      );
    }

    var JText = conversion.ToString(args[0]) || new Value(undefined, bot);
    var reviver = args[1] || new Value(undefined, bot);

    var unfiltered = parseAndEvaluate(JText);

    // Do we have any junk characters left? If so, a bad string!
    if(unfiltered.finalIndex <= JText.value.length) {
      monitor.Throw(
        monitor.modules.error.SyntaxErrorObject,
        'JSON.parse: String contains bad symbols in the end',
        bot
      );
    }
    
    var isReviverCallable = conversion.IsCallable(reviver);

    monitor.context.pushPC(isReviverCallable.label);
    if(isReviverCallable.value) {
      var root = new object.ObjectObject();

      root.DefineOwnProperty(new Value("", bot), 
                             { value        : unfiltered,
                               writable     : true,
                               enumerable   : true,
                               configurable : true,
                               label        : unfiltered.label
                             },
                             false
                            );

      monitor.context.popPC();
      return Walk(root, new Value("", lub(unfiltered.label, lub(JText.label, reviver.label))), reviver);
    }
    else {
      monitor.context.popPC();
      return unfiltered;
    }
  };

  // Walk, part of 15.12.2
  var Walk = function(holder, name, reviver) {
    var val = holder.Get(name);

    monitor.context.pushPC(val.label);
    if(val.value && typeof val.value === 'object') {
      val = val.value;
      monitor.context.pushPC(val.label);
      if(val.value.Class === 'Array') {
        var I = new Value(0, bot);
        var len = val.value.Get(constants.length);

        while(I.value < len.value) {
          var newElement = Walk(val, conversion.ToString(I), reviver);
          if(newElement === undefined) {
            val.Delete(conversion.ToString(I), false);
          }
          else {
            val.DefineOwnProperty(conversion.ToString(I),
                                  { value : newElement.value,
                                    writable : true,
                                    enumerable : true,
                                    configurable : true,
                                    label : val.label
                                  },
                                  false
                                 );
          }

          I.value++;
        }
      }
      else {
        var keys = [];
        var allKeys = Object.keys(val.value.properties);

        for(var i = 0; i < allKeys.length; i++) {
          var keyVal = val.GetProperty(new Value(allKeys[i], bot));

          if(keyVal.value && keyVal.value.enumerable) {
            keys.push(new Value(allKeys[i], bot)); //keyVal.label?
          }
        }

        for(var i = 0; i < keys.length; i++) {
          var P = conversion.ToString(keys[i]);
          var newElement = Walk(val, P, reviver);
          
          if(newElement === undefined) {
            val.Delete(P, false);
          }
          else {
            val.DefineOwnProperty(P,
                                  { value : newElement.value,
                                    writable : true,
                                    enumerable : true,
                                    configurable : true,
                                    label : val.label
                                  },
                                  false
                                 );
          }
        }
      }
      monitor.context.popPC();
    }

    monitor.context.popPC();
    return reviver.Call(holder, [name, val]);
  };

  // Inspiration from Douglas Crockford, https://github.com/douglascrockford/JSON-js/blob/master/json_parse.js
  // This is used for the 2nd and 3rd step in parse, 15.12.2
  var parseAndEvaluate = function(text) {
    var currentChar = ' ';
    var currentIndex = 0;

    // From 15.12.1.1, JSONEscapeCharacter :: one of " / \ b f n r t
    var escapeCharacters = {
      '"': '"',
      '/': '/',
      '\\': '\\',
      b: '\b',
      f: '\f',
      n: '\n',
      r: '\r',
      t: '\t'
    };

    // These are not allowed to have in a string!
    var invalidStringCharacters = {};
    for(var i = 0x00; i <= 0x1F; i++) {
      var s = String.fromCharCode(i);
      invalidStringCharacters[s] = s;
    }

    var mkError = function(message) {
      monitor.Throw(
        monitor.modules.error.SyntaxErrorObject,
        'JSON.parse: ' + message,
        bot
      );
    };

    var nextChar = function(char) {
      if(char && char !== currentChar) {
        mkError('expected ' + char + ' to match ' + currentChar);
      }

      currentChar = text.charAt(currentIndex);
      currentIndex++;

      return currentChar;
    };

    //JSONWhiteSpace :: <TAB> <CR> <LF> <SP>
    var eatWhiteSpace = function() {
      while(currentChar && currentChar <= ' ') {
        nextChar();
      }
    };

    /* JSONValue :
         JSONNullLiteral
         JSONBooleanLiteral
         JSONObject
         JSONArray
         JSONString
         JSONNumber
    */
    var jsonValue = function() {
      eatWhiteSpace();
      switch(currentChar) {
      case '{':
        // It must be an object
        return jsonObject();

      case '[':
        // It must be an array
        return jsonArray();

      case '"':
        // It must be a string
        return jsonString();

      case '-':
        // It must be a number
        return jsonNumber();

      case 'n':
        // It must be a null literal
        return jsonNull();

      case 't':
      case 'f':
        // It must be a boolean literal
        return jsonBool();

      default:
        if(currentChar >= '0' && currentChar <= '9') {
          // It must be a number
          return jsonNumber();
        }

        // Otherwise, something has gone wrong!
        mkError('Cannot parse the structure!');
      }
    };

    var jsonObject = function() {
      var result = new object.ObjectObject();

      if(currentChar === '{') {
        nextChar('{');
        eatWhiteSpace();

        if(currentChar === '}') {
          // Enter here and we have an "empty" object
          nextChar('}');
          return result;
        }

        while(currentChar) {
          var key = jsonString();
          eatWhiteSpace();
          nextChar(':');

          if(result.hasOwnProperty(key)) {
            mkError('Bad object, duplicate key ' + key);
          }

          result.DefineOwnProperty(new Value(key, bot), 
                                   { value        : jsonValue(),
                                     writable     : true,
                                     enumerable   : true,
                                     configurable : true,
                                     label        : bot
                                   },
                                   false
                                  );

          eatWhiteSpace();
          if(currentChar === '}') {
            nextChar('}');
            return result;
          }

          nextChar(',');
          eatWhiteSpace();
        }
      }

      mkError('Malformed object');
    };

    var jsonArray = function() {
      var result = [];

      if(currentChar === '[') {
        nextChar('[');
        eatWhiteSpace();

        if(currentChar === ']') {
          // Enter here and we have an empty array..
          nextChar(']');
          return array.ArrayObject.fromValueArray(result);
        }

        while(currentChar) {
          result.push(jsonValue());
          eatWhiteSpace();

          if(currentChar === ']') {
            // Enter here and we are done..
            nextChar(']');
            for(var i = 0; i < result.length; i++) {
              result[i] = new Value(result[i], bot);
            }

            return array.ArrayObject.fromValueArray(result);
          }

          nextChar(','); // If we are not done, we expect a ','
          eatWhiteSpace();
        }
      }

      mkError('Could not parse the array');
    };

    /*
      JSONString :: " JSONStringCharacters_opt "
      JSONStringCharacters :: JSONStringCharacter JSONStringCharacters_opt
      JSONStringCharacter :: SourceCharacter but not one of " or \ or U+0000 through U+001F \ JSONEscapeSequence
      JSONEscapeSequence :: JSONEscapeCharacter UnicodeEscapeSequence
     */
    var jsonString = function() {
      var result = "";

      if(currentChar === '"') {
        while(nextChar()) {
          if(currentChar === '"') {
            nextChar();
            return result;
          }

          // Check if the current character is an invalid string
          if(invalidStringCharacters[currentChar]) {
            mkError("Invalid character in string");
          }

          if(currentChar === '\\') {
            nextChar();

            if(currentChar === 'u') {
              var hexValue = 0;
              for(var i = 0; i < 4; i++) {
                var hex = parseInt(nextChar(), 16);
                if(!isFinite(hex)) {
                  break;
                }

                hexValue = hexValue * 16 + hex;
              }

              result += String.fromCharCode(hexValue);
            }
            else if(typeof escapeCharacters[currentChar] === 'string') {
              result += escapeCharacters[currentChar];
            }
            else {
              break;
            }
          }
          else {
            result += currentChar;
          }
        }
      }

      mkError('Bad input string');
    };

    // JSONNumber :: -_opt DecimalIntegerLiteral JSONFraction_opt ExponentPart_opt
    var jsonNumber = function() {
      var result = "", checkOctal = false, checkFloat = false;

      if(currentChar === '-') {
        result += currentChar;
        nextChar('-');
      }

      if(currentChar === '0') {
        checkOctal = true;
      }

      // Get all the numbers
      while(currentChar >= '0' && currentChar <= '9') {
        result += currentChar;
        nextChar();
      }

      if(checkOctal && result.length > 1) {
        mkError("JSON.parse: Numbers cannot start with a 0");
      }

      // Check if it is a float
      if(currentChar === '.') {
        result += currentChar;
        checkFloat = true;

        // Get all the remaining numbers in the float
        while(nextChar() && currentChar >= '0' && currentChar <= '9') {
          result += currentChar;
          checkFloat = false;
        }
      }

      if(checkFloat) {
        mkError("JSON.parse: Number with nothing after the decimal");
      }
      
      if(currentChar === 'e' || currentChar === 'E') {
        result += currentChar;
        nextChar();
        if(currentChar === '-' || currentChar === '+') {
          result += currentChar;
          nextChar();
        }
        while(currentChar >= '0' && currentChar <= '9') {
          result += currentChar;
          nextChar();
        }
      }

      var num = +result; // Nasty conversion. :)
      if(!isFinite(num)) {
        mkError('Bad number, not finite');
      }

      return num;
    };

    // JSONNullLiteral :: NullLiteral
    var jsonNull = function() {
      nextChar('n');
      nextChar('u');
      nextChar('l');
      nextChar('l');
      return null;
    };

    // JSONBooleanLiteral :: BooleanLiteral
    var jsonBool = function() {
      switch(currentChar) {
        case 't':
        nextChar('t');
        nextChar('r');
        nextChar('u');
        nextChar('e');
        return true;

      case 'f':
        nextChar('f');
        nextChar('a');
        nextChar('l');
        nextChar('s');
        nextChar('e');
        return false;

      default:
        mkError('Could not deduce a boolean');
      }
    };

    if(text.value) {
      var textLabel = text.label;
      text = text.value;
      var res = new Value(jsonValue(), textLabel);
      eatWhiteSpace();  // Eat all trailing white spaces
      res.finalIndex = currentIndex;  // This is needed to know if we have some garbage at the end of the string
      return res;
    }
    else {
      mkError('Bad format on input');
    }
  };


  // ------------------------------------------------------------
  // stringify, 15.12.3
  var stringify = function(thisArg, args) {
    // These are used for cycle detection
    var JA_counter = 0;
    var JO_counter = 0;
    //-------------------------------------------

    var stack = [];
    var indent = "";
    var PropertyList, ReplacerFunction;
    var gap = "";

    var value = args[0] || new Value(undefined, bot);
    var replacer = args[1] || new Value(undefined, bot);
    var space = args[2] || new Value(undefined, bot);

    var retLabel = lub(value.label, lub(replacer.label, space.label));

    monitor.context.pushPC(replacer.label);
    if(typeof replacer.value === 'object' || typeof replacer.value === 'function') {
      if(conversion.IsCallable(replacer).value) {
        ReplacerFunction = replacer;
      }
      else if(replacer.value && replacer.value.Class === 'Array') {
        PropertyList = [];

        var initialReplacerLength = replacer.value.properties.length;
        for(var i = 0; i < initialReplacerLength; i++) {
          var item = undefined;
          var v = replacer.Get(new Value(i, bot));

          if(v.value !== undefined) {
            if(typeof v.value === 'string') {
              item = v;
            }
            else if(typeof v.value === 'number') {
              item = conversion.ToString(v);
            }
            else if(typeof v.value === 'object') {
              if(v.value && (v.value.Class === 'String' || v.value.Class === 'Number')) {
                item = conversion.ToString(v);
              }
            }

            
            if(item !== undefined) {
              var itemNotInArray = true;
              for(var j = 0; j < PropertyList.length; j++) {
                if(item.value === PropertyList[j].value) {
                  itemNotInArray = false;
                  break;
                }
              }

              if(itemNotInArray) {
                PropertyList.push(item);
              }
            }
          }
        }
      }
    }
    monitor.context.popPC();

    monitor.context.pushPC(space.label);
    if(typeof space.value === 'object') {
      if(space.value.Class === 'Number') {
        space = conversion.ToNumber(space);
      }
      else if(space.value.Class === 'String') {
        space = conversion.ToString(space);
      }
    }

    if(typeof space.value === 'number') {
      var intSpace = conversion.ToInteger(space);
      if(intSpace.value > 10) {
        space = new Value(10, space.label);
      }
      else {
        space = intSpace;
      }

      for(var i = 0; i < space.value; i++) {
        gap = gap + " ";
      }
    }
    else if(typeof space.value === 'string') {
      if(space.value.length <= 10) {
        gap = space.value;
      }
      else {
        gap = space.value.substring(0, 10);
      }
    }
    // Leave the last else, gap will be empty string if none of the above has been hit
    monitor.context.popPC();  // Pop space.label from the PC stack

    var wrapper = new object.ObjectObject();
    wrapper.DefineOwnProperty(new Value("", bot), 
                              { value        : value.value,
                                writable     : true,
                                enumerable   : true,
                                configurable : true,
                                label        : value.label
                              },
                              false
                             );

    var Str = function(key, holder) {
      var value = holder.Get(key);

      retLabel = lub(retLabel, value.label);

      monitor.context.pushPC(value.label);
      if(value.value && typeof value.value === 'object') {
        var toJSON = value.Get(new Value("toJSON", bot));

        if(conversion.IsCallable(toJSON).value) {
          value = toJSON.Call(value, [key]);
        }
      }
      monitor.context.popPC();  // As it is being pushed again later, is this needed?

      if(ReplacerFunction) {
        monitor.context.pushPC(ReplacerFunction.label);
        if(ReplacerFunction.value) {
          value = ReplacerFunction.Call(holder, [key, value]);
        }
        monitor.context.popPC();
      }

      monitor.context.pushPC(value.label);
      if(value.value && typeof value.value === 'object') {
        if(value.value.Class === 'Number') {
          value = conversion.ToNumber(value);
        }
        else if(value.value.Class === 'String') {
          value = conversion.ToString(value);
        }
        else if(value.value.Class === 'Boolean') {
          value = new Value(value.value.PrimitiveValue.valueOf(), retLabel);
        }
      }

      if(value.value === null) {
        monitor.context.popPC();
        return new Value("null", retLabel);
      }
      if(value.value === true) {
        monitor.context.popPC();
        return new Value("true", retLabel);
      }
      if(value.value === false) {
        monitor.context.popPC();
        return new Value("false", retLabel);
      }

      if(typeof value.value === 'string') {
        var res = Quote(value);
        monitor.context.popPC();
        return res;
      }

      if(typeof value.value === 'number') {
        if(isFinite(value.value)) {
          var res = conversion.ToString(value);
          monitor.context.popPC();
          return res;
        }

        monitor.context.popPC();
        return new Value("null", retLabel);
      }

      if(typeof value.value === 'object' && !conversion.IsCallable(value).value) {
        if(value.value.Class === 'Array') {
          var res = JA(value);
          monitor.context.popPC();
          return res;
        }

        var res = JO(value);
        monitor.context.popPC();
        return res;
      }

      monitor.context.popPC();
      return new Value(undefined, retLabel);
    };

    var Quote = function(value) {
      var product = "\"";
      for(var i = 0; i < value.value.length; i++) {
        var C = value.value[i];
        var cCodePointValue = C.codePointAt(0);
        var spaceCodePointValue = (" ").codePointAt(0);
        
        if(C === "\"" || C === "\\") {
          product += "\\";
          product += C;
        }
        else if(C === "\b" || C === "\f" || C === "\n" || C === "\r" || C === "\t") {
          product += "\\";
          var abbrev;
          if(C === "\b") abbrev = "b";
          else if(C === "\f") abbrev = "f";
          else if(C === "\n") abbrev = "n";
          else if(C === "\r") abbrev = "r";
          else abbrev = "t";

          product += abbrev;
        }
        else if(cCodePointValue < spaceCodePointValue) {
          product += "\\";
          product += "u";
          var hex = cCodePointValue.toString(16);
          for(var j = hex.length; j < 4; j++) {
            hex = "0" + hex;
          }

          product += hex;
        }
        else {
          product += C;
        }
      }

      product += "\"";
      return new Value(product, lub(monitor.context.effectivePC, value.label));
    };

    var JO = function(value) {
      var JO_key = new Value("JO_property", bot);
      if(!value.Get(JO_key).value) {
        JO_counter++;
        value.DefineOwnProperty(JO_key,
                                { value        : new Value(JO_counter, bot),
                                  writable     : false,
                                  enumerable   : false,
                                  configurable : false,
                                  label        : bot
                                },
                                false);
      }
      else {
        checkCycle(JO_key, value);
      }

      stack.push(value);
      var stepback = indent;
      indent = indent + gap;

      if(PropertyList !== undefined) {
        var K = PropertyList;
      }
      else {
        var K = [];
        var allKeys = Object.keys(value.value.properties);

        for(var i = 0; i < allKeys.length; i++) {
          var keyVal = value.GetProperty(new Value(allKeys[i], bot));

          if(keyVal.value && keyVal.value.enumerable) {
            K.push(new Value(allKeys[i], retLabel));
          }
        }
      }

      var partial = [];
      for(var i = 0; i < K.length; i++) {
        var P = K[i];
        var strP = Str(P, value);

        if(strP && strP.value !== undefined) {
          var member = Quote(P);
          member.value += ":";
          if(gap !== "") {
            member.value += ' ';
          }

          member.value += strP.value;
          partial.push(member);
        }
      }

      var final;
      if(partial.length === 0) {
        final = "{}";
      }
      else {
        var properties = "";
        if(gap === "") {
          for(var i = 0; i < partial.length - 1; i++) {
            properties += partial[i].value + ',';
            retLabel = lub(retLabel, partial[i].label);
          }

          properties += partial[partial.length - 1].value;
          retLabel = lub(retLabel, partial[partial.length - 1].label);

          final = '{' + properties + '}';
        }
        else {
          var separator = ",\n" + indent;

          for(var i = 0; i < partial.length - 1; i++) {
            properties += partial[i].value + separator;
            retLabel = lub(retLabel, partial[i].label);
          }

          properties += partial[partial.length - 1].value;
          retLabel = lub(retLabel, partial[partial.length - 1].label);

          final = '{\n' + indent + properties + '\n' + stepback + '}';
        }
      }

      // Pop and remove JO_property
      var v = stack.pop();
      v.Delete(JO_key);

      indent = stepback;
      return new Value(final, retLabel);
    };

    var JA = function(value) {
      var JA_key = new Value("JA_property", bot);
      if(!value.Get(JA_key).value) {
        JA_counter++;
        value.DefineOwnProperty(JA_key,
                                { value        : new Value(JA_counter, bot),
                                  writable     : false,
                                  enumerable   : false,
                                  configurable : false,
                                  label        : bot
                                },
                                false);
      }
      else {
        checkCycle(JA_key, value);
      }

      stack.push(value);
      var stepback = indent;
      indent = indent + gap;
      var partial = [];

      var len = value.Get(new Value('length', bot));
      var index = new Value(0, bot);

      while(index.value < len.value) {
        var strP = Str(conversion.ToString(index), value);
        if(!strP || strP.value === undefined) {
          partial.push(new Value("null", retLabel));
        }
        else {
          partial.push(strP);
          retLabel = lub(retLabel, strP.label);
        }
        index.value++;
      }

      var final;
      if(partial.length === 0) {
        final = "[]";
      }
      else {
        var properties = "";
        if(gap === "") {
          for(var i = 0; i < partial.length - 1; i++) {
            properties += partial[i].value + ',';
            retLabel = lub(retLabel, partial[i].label);
          }

          properties += partial[partial.length - 1].value;
          retLabel = lub(retLabel, partial[partial.length - 1].label);

          final = '[' + properties + ']';
        }
        else {
          var separator = ",\n" + indent;
          for(var i = 0; i < partial.length - 1; i++) {
            properties += partial[i].value + separator;
            retLabel = lub(retLabel, partial[i].label);
          }

          properties += partial[partial.length - 1].value;
          retLabel = lub(retLabel, partial[partial.length - 1].label);

          final = '[\n' + indent + properties + '\n' + stepback + ']';
        }
      }

      // Pop and remove property of JA_key
      var v = stack.pop();
      v.Delete(JA_key);

      indent = stepback;
      return new Value(final, retLabel);
    };

    var checkCycle = function(key, value) {
      for(var i = 0; i < stack.length; i++) {
        if(value.Get(key).value === stack[i].Get(key).value) {
          monitor.Throw(
            monitor.modules.error.TypeErrorObject,
            'JSON.stringify: Cyclic structure',
            bot
          );
        }
      }
    };

    return Str(new Value("", bot), wrapper);
  };

  return module;
};
