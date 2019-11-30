/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function(monitor) {

  var esprima    = monitor.require('esprima');

  var Set        = monitor.require('set').Set;

  var label      = monitor.require('label');
  var conversion = monitor.require('conversion');
  var constants  = monitor.require('constants');
  var prelude    = monitor.require('prelude');
  var ecma       = monitor.require('ecma');
  var _function  = monitor.require('function');
  var env        = monitor.require('env');
  var error      = monitor.require('error');
  var object     = monitor.require('object');
  var array      = monitor.require('array');
  var pp         = monitor.require('pp');
  var regexp     = monitor.require('regexp');

  var Value        = monitor.require('values').Value;
  var Reference    = monitor.require('values').Reference;
  var Result       = monitor.require('context').Result;
  var RegExpObject = regexp.RegExpObject;

  var Label      = label.Label;
  var lub        = label.lub;
  var le         = label.le;
  var bot        = Label.bot;

  // ------------------------------------------------------------

  var runfor_all            = { 'throw' : true, 'continue' : true, 'break' : true };
  var runfor_throw          = { 'throw' : true };
  var runfor_continue       = { 'continue' : true };
  var runfor_break          = { 'break' : true } ;
  var runfor_continue_break = { 'break' : true, 'continue' : true };

  // ------------------------------------------------------------
  
  var module = {};
  module.initialize        = initialize;
  module.execute           = execute;
  module.executeGlobalCode = executeGlobalCode;
  module.resume            = resume;
  module.running           = running;

  // ------------------------------------------------------------

  function initialize() {
    
    var global     = monitor.instances.globalObject;
    var globalEnv  = env.NewObjectEnvironment(new Value(global,bot), new Value(null,bot));
    
    monitor.instances.globalEnvironment = globalEnv;
    monitor.context.thisValue   = new Value(global,bot);
    monitor.context.variableEnv = new Value(globalEnv,bot);
    monitor.context.lexicalEnv  = new Value(globalEnv,bot);

  }

  // ------------------------------------------------------------

  function running() {
    return !monitor.context.workList.empty(); 
  }

  // ------------------------------------------------------------

  function execute(ast,debugEnabled) {

    monitor.context.workList.push(ast);
    monitor.context.result = new Result();

    if (debugEnabled === undefined) {
      debugEnabled = true;
    }

    var cont = true;
    do {
      if (debugEnabled && monitor.debug.active) {
        return monitor.context.result;
      }
      cont = step();
    } while(cont);

    return monitor.context.result;
  }

  // ------------------------------------------------------------

  function resume() {

    var cont = true;
    do {
      cont = step();
      if (monitor.debug.active) {
        return monitor.context.result;
      }
    } while(cont);

    return monitor.context.result;
  }

  // ------------------------------------------------------------

  function executeGlobalCode(code, filename, options) {
    try {
      monitor.code = code;
      monitor.ast = esprima.parse(code, { loc : true, range : true, tolerant : true,  source : filename });

    } catch (e) {
      var msg = e.description + ' in ' + filename + ':' + e.lineNumber + ':' + e.column;
      msg = new Value(msg, bot);

      var obj      = new error.SyntaxErrorObject(msg, bot);
      var result   = new Result();
      result.type  = 'throw';
      result.value = new Value(obj, bot);
      return result;
    }

    var debugEnabled = true;
    if (options && typeof options.debugEnabled !== 'undefined') {
      debugEnabled = options.debugEnabled;
    }
    
    enterGlobalCode(monitor.ast);
    return execute(monitor.ast,debugEnabled);
  }
  
  // ------------------------------------------------------------
  //   contains the declaration binding (10.5) of global code
 
  function enterGlobalCode(ast, filename) {

    var c = monitor.context;

    // 10.5 - hoisting
    _function.HoistFunctions(c.variableEnv, ast, false, bot);
    _function.HoistVariables(c.variableEnv, ast, false, bot);

  }

  // ------------------------------------------------------------
  // GetValue, 8.7.1

  function GetValue(v) {
    if (!v || ! (v instanceof Reference)) return v;

    if (v.base.label === undefined) 
      monitor.fatal('GetValue, base.label undefined');

    if (v.IsUnresolvableReference()) {
      monitor.Throw(error.ReferenceErrorObject,
        v.propertyName.value + ' not defined',
        v.base.label
      );
    }
    
    var p = v.base;
    var s = v.propertyName;

    if (v.IsPropertyReference()) {
      if (!v.HasPrimitiveBase()) {
        return p.Get(s);
      }
      else {
        var o = conversion.ToObject(p);
        var desc = o.GetProperty(s);

        if (desc.value === undefined) { 
          return desc;
        }
       
        var lbl = new Label();
        lbl.lub(desc.label, desc.value.label);
        desc = desc.value;
        
        if (ecma.IsDataDescriptor(desc)) {
          return new Value(desc.value,lbl);
        }

        var get = desc.get;
        if (get === undefined) { 
          new Value(undefined,lbl);
        }

        monitor.context.pushPC(lbl);
          var res = get.Call(get,v.base);
        monitor.context.popPC();

        res.raise(lbl);
        return res;
      }
    }

    return p.GetBindingValue(s);
  }
 
  // ------------------------------------------------------------
  // PutValue

  function PutValue(r,v) {
      var ctx = monitor.context;

      if (! (r instanceof Reference) ) {
        throw new Error();
        monitor.Throw(
          error.ReferenceErrorObject,
          'PutValue: target is not a reference',
          r.label
        );
      }
      
      var p = r.base;
      var s = r.propertyName;
     
      if (r.IsUnresolvableReference()) {
        p.value = monitor.instances.globalObject;
        p.Put(s,v);
      } else if (r.IsPropertyReference()) {
        if (r.HasPrimitiveBase()) {
          var o = conversion.ToObject(p);
          if (!o.CanPut(s).value) {
            return;
          }

          var ownDesc = o.GetOwnProperty(s);
          if (ownDesc.value && ecma.IsDataDescriptor(ownDesc.value)) {
            return;
          }

          var desc = o.GetProperty(s);
          if (desc.value && ecma.IsAccessorDescriptor(desc.value)) {
            monitor.context.pushPC(lub(ownDesc.label, desc.label)); // contains o.label
              desc.value.Set.Call(p, [v]);  
            monitor.context.popPC();
          }

        } else {
          p.Put(s,v);
        }
      } else {
          p.SetMutableBinding(s,v);
      }
  }
  
  // -------------------------------------------------------------
  // Unary operators


  // -------------------------------------------------------------
  // Unary -, 11.4.7

  function unaryMinus(wl,vs) {
    var ref = vs.pop();
    var n   = conversion.ToNumber(GetValue(ref));
    n.value = -n.value;
    vs.push(n);
  }

  // -------------------------------------------------------------
  // Unary +, 11.4.6

  function unaryPlus(wl,vs) {
    var ref = vs.pop();
    var n = conversion.ToNumber(GetValue(ref));
    vs.push(n);
  }

  // -------------------------------------------------------------
  // Logical NOT, 11.4.9

  function unaryLogicalNot(wl,vs) {
    var ref = vs.pop();
    var b = conversion.ToBoolean(GetValue(ref));
    b.value = !b.value;
    vs.push(b);
  }

  // -------------------------------------------------------------
  // Bitwise NOT, 11.4.8

  function unaryBitwiseNot(wl,vs) {
    var ref = vs.pop();
    var n = conversion.ToInt32(GetValue(ref));
    n.value = ~n.value;
    vs.push(n);
  }

  // -------------------------------------------------------------
  // The typeof Operator, 11.4.3

  function unaryTypeof(wl,vs) {
    var ref = vs.pop();
    var isRef = (ref instanceof Reference);

    if (isRef && ref.IsUnresolvableReference()) {
      vs.push(new Value('undefined', ref.base.label));
    } else {

      var val;        

      if (isRef) {
        val = GetValue(ref);
      } else {
        val = ref;
      }
      
      if (val.value === null) {
        vs.push(new Value('object',val.label));
        return;
      }

      if (typeof val.value === 'object') {

        if ('Call' in val.value) {
          vs.push(new Value('function', val.label));
        } else {
          vs.push(new Value('object', val.label));
        }

      } else {
        vs.push(new Value(typeof val.value, val.label));
      }
    }
  
  }

  // -------------------------------------------------------------
  // The void Operator, 11.4.2
  
  function unaryVoid(wl,vs) {
    var ref = vs.pop();
    var _ignore = GetValue(ref);
    vs.push(new Value(undefined, bot));
  }

  // -------------------------------------------------------------
  // The delete Operator, 11.4.1
  
  function unaryDelete(wl,vs) {
    var ref = vs.pop();

    if (ref instanceof Reference) {

      if (ref.IsUnresolvableReference()) {
        vs.push(new Value(true, ref.base.label));
      } else {

        if (ref.IsPropertyReference()) {
          var object = conversion.ToObject(ref.base);
          vs.push(object.Delete(ref.propertyName));
        } else {
          vs.push(ref.base.DeleteBinding(ref.propertyName));
        }
      }

    } else {
      vs.push(new Value(true, ref.label));
    }
  }

  // -------------------------------------------------------------

  var unarytbl = {
    '-'      : unaryMinus,
    '+'      : unaryPlus,
    '!'      : unaryLogicalNot,
    '~'      : unaryBitwiseNot,
    'typeof' : unaryTypeof,
    'void'   : unaryVoid,
    'delete' : unaryDelete
  };

  
  // -------------------------------------------------------------
  // Equality Operators, 11.9

  function binaryEqs(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var res;

    while (true) {
      var lt = typeof lval.value;
      var rt = typeof rval.value;

      lt = lval.value === undefined ? 'undefined' : lt;
      rt = rval.value === undefined ? 'undefined' : rt;

      lt = lval.value === null ? 'null' : lt;
      rt = rval.value === null ? 'null' : rt;

      // must use strict in order not to trigger conversion
      //   but then null and undefined must be handled separately
      if (lt === rt) {
        res = new Value(lval.value === rval.value,
                      lub(lval.label,rval.label));
        break;
      }
    
      if ((lval.value === null && rval.value === undefined) ||
          (lval.value === undefined && rval.value === null)) {
        res = new Value(true, lub(lval.label,rval.label));
        break;
      }

      if (lt === 'number' && rt === 'string') {
        rval = conversion.ToNumber(rval);
        continue;
      }

      if (lt === 'string' && rt === 'number') {
        lval = conversion.ToNumber(lval);
        continue;
      }

      if (lt === 'boolean') {
        lval = conversion.ToNumber(lval);
        continue;
      }

      if (rt === 'boolean') {
        rval = conversion.ToNumber(rval);
        continue;
      }

      if ((lt === 'string' || lt === 'number') &&
          rt === 'object') {
        rval = conversion.ToPrimitive(rval);
        continue;
      }

      if (lt === 'object' && 
          (rt === 'string' || rt === 'number')) {
        lval = conversion.ToPrimitive(lval);
        continue;
      }
      res = new Value(false, lub(lval.label,rval.label));
      break;
    }
  
    if (op === '!=') {
      res.value = !res.value;
    }

    vs.push(res);
  }

  // -------------------------------------------------------------
  // Strict Equality Operators, 11.9.4, 11.9.5
  
  function binaryStrictEqs(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();
    var res = new Value(lval.value === rval.value,
                        lub(lval.label,rval.label));

    if (op === '!==') {
      res.value = !res.value;
    }

    vs.push(res);
  }

  // -------------------------------------------------------------
  // Relational Operators, 11.8
  //  The evaluation order is important, 11.8.5

  function binaryOrds(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var lprim = conversion.ToPrimitive(lval);
    var rprim = conversion.ToPrimitive(rval);

    var res;

    if (typeof lprim.value !== 'string' &&
        typeof rprim.value !== 'string') {
      var lnum = conversion.ToNumber(lprim);
      var rnum = conversion.ToNumber(rprim);
      var val  = eval('lnum.value ' + op + ' rnum.value');
      res = new Value(val, lub(lnum.label,rnum.label));
    } else {
      var val = eval('lprim.value ' + op + ' rprim.value');
      res = new Value(val, lub(lprim.label,rprim.label));
    }

    vs.push(res);
  }

  // -------------------------------------------------------------
  // Bitwise Shift Operators, 11.7

  function binaryShifts(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var lnum = (op === '>>>') ? conversion.ToUInt32(lval) : conversion.ToInt32(lval);
    var rnum = conversion.ToUInt32(rval);
    var val  = eval('lnum.value ' + op + ' rnum.value');
    
    vs.push(new Value(val, lub(lnum.label,rnum.label)));
  }

  // -------------------------------------------------------------
  // Binary Bitwise Operators, 11.10

  function binaryBitwiseOps(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var lnum = conversion.ToInt32(lval);
    var rnum = conversion.ToInt32(rval);
    var val  = eval('lnum.value ' + op + ' rnum.value');

    vs.push(new Value(val, lub(lnum.label,rnum.label)));
  }

  // -------------------------------------------------------------
  // Plus, 11.6

  function binaryPlus(wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var lprim = conversion.ToPrimitive(lval);
    var rprim = conversion.ToPrimitive(rval);
    var res;

    if ((typeof lprim.value) === 'string' ||
        (typeof rprim.value) === 'string') {
      var lstr = conversion.ToString(lprim);
      var rstr = conversion.ToString(rprim);
      res = new Value(lstr.value + rstr.value, 
                    lub(lprim.label,rprim.label));
    } else {
      var lnum = conversion.ToNumber(lprim);
      var rnum = conversion.ToNumber(rprim);
      res = new Value(lnum.value + rnum.value,
                    lub(lnum.label,rnum.label));
    }

    vs.push(res);
  }

  // -------------------------------------------------------------
  // Multiplicative operators, 11.5, and minus, 11.6

  function binaryArithmeticOps(op,wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    var leftNum  = conversion.ToNumber(lval);
    var rightNum = conversion.ToNumber(rval);
    var val      = eval('leftNum.value ' + op + ' rightNum.value');

    vs.push(new Value(val, lub(leftNum.label,rightNum.label)));
  }

  // -------------------------------------------------------------
  // The in operator, 11.8.7

  function binaryIn(wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    if (typeof rval.value !== 'object') {
      if (false) { // SILENT ERROR
        vs.push(new Value(false, lub(lval.label,rval.label)));
        return;
      }

      monitor.Throw(
        error.TypeErrorObject,
        "invalid 'in' parameter",
        rval.label
      );
    }
    vs.push(rval.HasProperty(conversion.ToString(lval)));
  }

  // -------------------------------------------------------------
  // The instanceof operator, 11.8.6

  function binaryInstanceof(wl,vs) {
    var rval = vs.pop();
    var lval = vs.pop();

    if (typeof rval.value !== 'object') {
      if (false) { // SILENT ERROR
        vs.push(new Value(false, lub(lval.label,rval.label)));
      } 

      monitor.Throw(
        error.TypeErrorObject,
        "invalid 'instanceof' parameter",
        rval.label
      );
    }

    if (! ('HasInstance' in rval.value)) {
      if (false) { // SILENT ERROR
        vs.push(new Value(false, lub(lval.label,rval.label)));
      }

      monitor.Throw(
        error.TypeErrorObject,
        "invalid 'instanceof' parameter",
        rval.label
      );
    }

    vs.push(rval.HasInstance(lval));
  }

  // -------------------------------------------------------------

  var binarytbl = {
    '=='         : binaryEqs.bind(null,'=='),
    '!='         : binaryEqs.bind(null,'!='),
    '==='        : binaryStrictEqs.bind(null,'==='),
    '!=='        : binaryStrictEqs.bind(null,'!=='),
    '<'          : binaryOrds.bind(null,'<'),
    '<='         : binaryOrds.bind(null,'<='),
    '>'          : binaryOrds.bind(null,'>'),
    '>='         : binaryOrds.bind(null,'>='),
    '<<'         : binaryShifts.bind(null,'<<'),
    '>>'         : binaryShifts.bind(null,'>>'),
    '>>>'        : binaryShifts.bind(null,'>>>'),
    '+'          : binaryPlus,
    '-'          : binaryArithmeticOps.bind(null,'-'),
    '*'          : binaryArithmeticOps.bind(null,'*'),
    '/'          : binaryArithmeticOps.bind(null,'/'),
    '%'          : binaryArithmeticOps.bind(null,'%'),
    '|'          : binaryBitwiseOps.bind(null,'|'),
    '&'          : binaryBitwiseOps.bind(null,'&'),
    '^'          : binaryBitwiseOps.bind(null,'^'),
    'in'         : binaryIn,
    'instanceof' : binaryInstanceof
  };
  

  // ------------------------------------------------------------- 
  // Prefix, and Postfix Expressions, 11.3, 11.4.4, 11.4.5

  function prefixOps(op,wl,vs) {
    var ref      = vs.pop();
    var oldValue = conversion.ToNumber(GetValue(ref));
    var val      = op === '++' ? oldValue.value + 1 : oldValue.value - 1;
    var newValue = new Value(val, oldValue.label); 
    PutValue(ref, newValue);

    vs.push(newValue);
  }

  function postfixOps(op,wl,vs) {
    var ref      = vs.pop();
    var oldValue = conversion.ToNumber(GetValue(ref));
    var val      = op === '++' ? oldValue.value + 1 : oldValue.value - 1;
    var newValue = new Value(val, oldValue.label); 
    PutValue(ref, newValue);

    vs.push(oldValue);
  }

  // -------------------------------------------------------------

  var prefixtbl = {
    '++' : prefixOps.bind(null,'++'),
    '--' : prefixOps.bind(null,'--')
  };

  var postfixtbl = {
    '++' : postfixOps.bind(null,'++'),
    '--' : postfixOps.bind(null,'--')
  };

  // -------------------------------------------------------------
  // Binary Logical ||, 11.11

  function binaryLogicalOr(wl,vs) {

    var lval = GetValue(vs.pop());
    vs.push(lval);

    var lb   = conversion.ToBoolean(lval);
    var right = wl.pop();

    if (lb.value) {
      return;
    }

    monitor.context.pushPC(lb.label);

    var ip = wl.top();
    ip.then(right);
    ip.then(binaryLogicalOr_end);
  }    
    
  function binaryLogicalOr_end(wl,vs) {
    var rval = GetValue(vs.pop());
    var lval = vs.pop();

    monitor.context.popPC();
  
    vs.push(new Value(rval.value, lub(rval.label,lval.label)));
  }
     
  // -------------------------------------------------------------
  // Binary Logical &&, 11.11

  function binaryLogicalAnd(wl,vs) {
    var lval = GetValue(vs.pop());
    vs.push(lval);
    var lb   = conversion.ToBoolean(lval);
    var right = wl.pop();

    if (!lb.value) {
      return;
    }

    monitor.context.pushPC(lb.label);

    var ip = wl.top();
    ip.then(right);
    ip.then(binaryLogicalAnd_end);
  }

  function binaryLogicalAnd_end(wl,vs) {
    var rval = GetValue(vs.pop());
    var lval = vs.pop();
    
    monitor.context.popPC();

    vs.push(new Value(rval.value, lub(rval.label,lval.label)));
  }

  // -------------------------------------------------------------

  var logicaltbl = {
    '||' : binaryLogicalOr,
    '&&' : binaryLogicalAnd
  };

  // -------------------------------------------------------------
  
  function assignmentOps(op,wl,vs) {
    var rval = GetValue(vs.pop());
    var lref = vs.pop();

    if (op) {
      vs.push(lref);
      vs.push(GetValue(lref));
      vs.push(rval);
      binarytbl[op](wl,vs);
    } else {
      vs.push(lref);
      vs.push(rval);
    }
  }

  var assignmenttbl = {
    '='    : assignmentOps.bind(null,null),
    '+='   : assignmentOps.bind(null,'+'),
    '-='   : assignmentOps.bind(null,'-'),
    '*='   : assignmentOps.bind(null,'*'),
    '/='   : assignmentOps.bind(null,'/'),
    '%='   : assignmentOps.bind(null,'%'),
    '>>='  : assignmentOps.bind(null,'>>'),
    '<<='  : assignmentOps.bind(null,'<<'),
    '>>>=' : assignmentOps.bind(null,'>>>'),
    '|='   : assignmentOps.bind(null,'|'),
    '&='   : assignmentOps.bind(null,'&'),
    '^='   : assignmentOps.bind(null,'^')
  };

  // -------------------------------------------------------------

  function _GetValue() {
    var vs    = monitor.context.valueStack;
    vs.push(GetValue(vs.pop()));
  }

  function _popPC() {
    monitor.context.popPC();
  }
  
  _popPC.runfor = runfor_continue_break;

  // -------------------------------------------------------------
  // expression handler functions 
  
  var expressiontbl = {
    'ThisExpression'        : thisExpression,
    'ArrayExpression'       : arrayExpression,
    'ObjectExpression'      : objectExpression,
    'FunctionExpression'    : functionExpression,
    'SequenceExpression'    : sequenceExpression,
    'UnaryExpression'       : unaryExpression,
    'BinaryExpression'      : binaryExpression,
    'UpdateExpression'      : updateExpression,
    'LogicalExpression'     : logicalExpression,
    'AssignmentExpression'  : assignmentExpression,
    'ConditionalExpression' : conditionalExpression,
    'NewExpression'         : newExpression,
    'CallExpression'        : callExpression,
    'MemberExpression'      : memberExpression,
    'Identifier'            : identifierExpression,
    'Literal'               : literalExpression
  };

  // This, 11.1.1 -------------------------------------------- 
  
  function thisExpression(node,wl,vs) {
    var c = monitor.context;
    vs.push(c.thisValue.clone());
  }

  // Array Initializer, 11.1.4 -------------------------------
 
  function arrayExpression(node,wl,vs) {
    var ip = wl.top();

    var arr = new Value(new array.ArrayObject(),bot);
    var es  = node.elements;
    var len = es.length;

    arr.Put(constants.length, new Value(len,bot));
    vs.push(arr);
  
    for (var i = 0; i < len; i++) {
      if (es[i]) {
        ip.then(es[i]);
        ip.then(arrayExpressionUpdate, { array : arr, index : i });
      }
    }
  }

  // arrayExpressionUpdate

  function arrayExpressionUpdate(wl,vs) {
    var initValue = GetValue(vs.pop()); 
    this.array.Put(new Value(this.index,bot), initValue);
  }

  // Object Initializer, 11.1.5 ------------------------------

  function objectExpression(node,wl,vs) {
    var ip = wl.top();

    var obj = new Value(new object.ObjectObject(),bot);
    vs.push(obj);

    var ps  = node.properties;
    
    for (var i = 0, len = ps.length; i < len; i++) {
      ip.then(ps[i].value);
      ip.then(objectExpressionUpdate, { properties : ps, object : obj, index : i });
    }


  }

  // objectExpressionUpdate

  function objectExpressionUpdate(wl,vs) {

    var prop = this.properties[this.index];
    var propName = new Value(null, bot);

    switch (prop.key.type) {
      case 'Identifier' :
        propName.value = prop.key.name;
      break;

      case 'Literal'    :
        // can only be string or number; conversion will occur once assigned to the object
        propName.value = prop.key.value;
      break;
    }

    var propValue = GetValue(vs.pop());
    var propDesc = { enumerable : true, configurable : true };

    switch (prop.kind) {

      case 'init' : 
        propDesc.value    = propValue.value;
        propDesc.label    = propValue.label;
        propDesc.writable = true;
      break;

      case 'get' : 
        propDesc.get   = propValue.value;
        propDesc.label = propValue.label;
      break;

      case 'set' :
        propDesc.set   = propValue.value;
        propDesc.label = propValue.label;
      break;

    }

    var previous = this.object.GetOwnProperty(propName);
   
    monitor.context.pushPC(previous.label);
      if (previous.value !== undefined) {
        if ( (ecma.IsDataDescriptor(previous) && ecma.IsAccessorDescriptor(propDesc)) ||
             (ecma.IsAccessorDescriptor(previous) && ecma.IsDataDescriptor(propDesc)) ||
             (ecma.IsAccessorDescriptor(previous) && ecma.IsAccessorDescriptor(propDesc) &&
              ((previous.get && propDesc.get) || (previous.set && propDesc.set))
             )
           ) {
          monitor.Throw(
            error.SyntaxErrorObject,
            'Object initializer: illegal redefine of property',
            bot
          );
        }
      }
    monitor.context.popPC();
  
    this.object.DefineOwnProperty(propName,propDesc);
  }

  // Function Definition, 13 ----------------------------------------------

  function functionExpression(node,wl,vs) {
    var fun;

    if (node.id) {
      var funcEnv = env.NewDeclarativeEnvironment(monitor.context.lexicalEnv);
      var identifier = new Value(node.id.name,bot);
      funcEnv.CreateImmutableBinding(identifier);

      fun = new _function.FunctionObject(node.params, node.body, new Value(funcEnv, bot));
      fun.Name   = node.id.name;
      fun.Source = node;

      funcEnv.InitializeImmutableBinding(identifier, new Value(fun, bot));
    } else {
      fun = new _function.FunctionObject(node.params, node.body, monitor.context.lexicalEnv);
      fun.Source = node;
    }
    
    vs.push(new Value(fun, bot));
  }
  
  // Comma Operator, 11.14 ------------------------------------------------

  function sequenceExpression(node,wl,vs) {
    var ip  = wl.top();
    var es  = node.expressions;
    var len = es.length;

    for (var i = 0; i < len-1; i++) {
      ip.then(es[i]);
    }

    if (i < len) {
      ip.then(es[i]);
      ip.then(sequenceExpressionEnd, { length : len });
    }
  }

  function sequenceExpressionEnd(wl,vs) {

    var result = vs.pop();

    // Pop all but last and execute GetValue on result for eventual side effects.
    for (var i = 0; i < this.length-1; i++) {
      GetValue(vs.pop());
    }
    vs.push(result);
  }

  // Unary Operators, 11.4 ------------------------------------------------

  function unaryExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.argument);
    ip.then(unarytbl[node.operator]);
  }

  // Binary Operators, 11.5-11.9 -----------------------------------

  function binaryExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.left);
    ip.then(_GetValue);
    ip.then(node.right);
    ip.then(_GetValue);
    ip.then(binarytbl[node.operator]);
  }

  // Prefix, and Postfix Expressions, 11.3, 11.4.4, 11.4.5 -----------------

  function updateExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.argument);
    if (node.prefix) {
      ip.then(prefixtbl[node.operator]);
    } else {
      ip.then(postfixtbl[node.operator]);
    }
  }

  // Binary Operators, 11.5-11.9 -----------------------------------
  
  function logicalExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.left);
    ip.then(logicaltbl[node.operator]);
    ip.then(node.right);
  }

  // Assignment, 11.13 -----------------------------------------------------

  function assignmentExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.left);
    ip.then(node.right);
    ip.then(assignmenttbl[node.operator]);
    ip.then(assignmentExpressionEnd);
  }

  // assignmentExpressionEnd

  function assignmentExpressionEnd(wl,vs) {
    var rval = vs.pop();
    var lref = vs.pop();
    PutValue(lref,rval);
    vs.push(rval);
  }

  // Conditional Operator, 11.12 ------------------------------------------
  
  function conditionalExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.test);
    ip.then(conditionalExpressionChoose, { node : node });

  }

  // conditionalExpressionChoose

  function conditionalExpressionChoose(wl,vs) {
    var ip = wl.top();
    var lval = GetValue(vs.pop());
    var lb   = conversion.ToBoolean(lval);

    var val; 

    monitor.context.pushPC(lb.label);

    if (lb.value) {
      ip.then(this.node.consequent);
    }
    else {
      ip.then(this.node.alternate);
    }

    ip.then(conditionalExpressionEnd, { test : lval }); 
  }

  // conditionalExpressionEnd

  function conditionalExpressionEnd(wl,vs) {
    var val = GetValue(vs.pop());

    monitor.context.popPC();
    vs.push(new Value(val.value, lub(val.label, this.test.label)));
  }
  
  // The new Operator, 11.2.2 ---------------------------------------------
  
  function newExpression(node,wl,vs) {
    var ip = wl.top();
    ip.then(node.callee);
     
    var as  = node.arguments;
    var len = as.length;


    for (var i = 0; i < len; i++) {
      ip.then(as[i]);
    }


    ip.then(newExpressionExecute, { length : len }); 
  }

  // newExpression

  function newExpressionExecute(wl,vs) {
    var c = monitor.context;
    var ip = wl.top();
    
    var argList = [];
    for (var i = this.length-1; i >= 0; i--) {
      argList[i] = GetValue(vs.pop());
    }

    var constructor = GetValue(vs.pop());

    if (typeof constructor.value !== 'object') {
      if (false) { // SILENT ERROR
        v = new Value(undefined, constructor.label);
        return;
      } 
      monitor.Throw(
        error.TypeErrorObject,
        "invalid 'new' parameter",
        constructor.label
      );
    }

    if (! ('Construct' in constructor.value)) {
      if (false) { // SILENT ERROR
        v = new Value(undefined, constructor.label);
        return;
      } 
      monitor.Throw(
        error.TypeErrorObject,
        "invalid 'new' parameter",
        constructor.label
      );
    }

    if (constructor.value.AsyncConstruct) {
      c.pushPC(constructor.label);

      ip = constructor.value.AsyncConstruct(argList);
    
      ip.then(callExpressionEnd, { label : constructor.label });

    } else {
      try {
        var retval = constructor.Construct(argList);
        retval.raise(constructor.label);
        vs.push(retval);
      } catch (e) {

        if (!(e instanceof Value)) {
          throw e;
        }

        var result = c.result;

        // Verfiy that the exception is allowed 
        monitor.assert(le(c.effectivePC, c.labels.exc),
          "exception in " + c.effectivePC + " not allowed with exception label " + c.labels.exc);

        result.type  = 'throw';
        result.value = e; 
      }
    }
  }

  // Function Calls, 11.2.3 -----------------------------------------------
  
  function callExpression(node,wl,vs) {
    var ip = wl.top();

    var as  = node.arguments;
    var len = as.length; 

    ip.then(node.callee);

    for (var i = 0; i < len; i++) {
      ip.then(as[i]);
    }

    ip.then(callExpressionExecute, { length : len, node : node });
  }

  // callExpressionExecute

  function callExpressionExecute(wl,vs) {

    var c = monitor.context;
    var ip = wl.top();

    var argList = []; 
    for (var i = this.length-1; i >= 0; i--) {
      argList[i] = GetValue(vs.pop());
    }

    var ref     = vs.pop();
    var func    = GetValue(ref);

    // used to decide if eval is a direct call in function.enterEvalCode
    c.currentCall = { reference : ref, target : func.value, source : this.node };

    // for eval
    c.call      = {};
    c.call.ref  = ref;
    c.call.func = func;
  
    if (! conversion.IsCallable(func).value) {
      if (false) { // SILENT ERRORS
        v = new Value(undefined,func.label);
        return;
      }
      monitor.Throw(
        error.TypeErrorObject,
        'Invalid call target; ' + pp.pretty(this.node.callee) + ' evaluates to ' + func.value + ' in ' + pp.pretty(this.node),
        func.label
      );
    }

    var thisValue;
    if (ref instanceof Reference) {
      if (ref.IsPropertyReference()) {
        thisValue = ref.base;
      } else {
        thisValue = ref.base.ImplicitThisValue();
      }
    } else {
      thisValue = new Value(undefined, ref.label);
    }

    if (func.value.AsyncCall) {

      monitor.context.pushPC(func.label);

      func.value.AsyncCall(thisValue,argList);
      ip.then(callExpressionEnd, { label : func.label });

    } else {

      try {
        var retval = func.Call(thisValue,argList);
        retval.raise(func.label);
        vs.push(retval);

      } catch (e) {
      
        if (!(e instanceof Value)) {
          throw e;
        }

        var result = c.result;

        // Verfiy that the exception is allowed 
        monitor.assert(le(c.effectivePC, c.labels.exc),
          "exception in " + c.effectivePC + " not allowed with exception label " + c.labels.exc);

        result.type  = 'throw';
        result.value = e; 
      }
    }
  }

  // callExpressionEnd 
  
  function callExpressionEnd(wl,vs) {
    var callResult = vs.pop();
    var c = monitor.context;
    var result = c.result;

    callResult.value.raise(this.label);

    if (callResult.type === 'throw') {
      result.type   = 'throw';
      result.value  = callResult.value;
      return;
    }

    c.popPC();
    vs.push(callResult.value);
  }

  // Property Accessors, 11.2.1 -------------------------------------------

  function memberExpression(node,wl,vs) {
    var ip = wl.top();

    ip.then(node.object);
    ip.then(_GetValue);

    if (node.computed) {
      ip.then(node.property);
      ip.then(_GetValue);
    }

    ip.then(memberExpressionExecute, { node : node });
  }

  function memberExpressionExecute(wl,vs) {

    if (this.node.computed) {
      propertyNameValue = vs.pop();
    } else {
      propertyNameValue = new Value(this.node.property.name, bot);
    }

    var baseValue = vs.pop();

    if (baseValue.value === undefined || baseValue.value === null) {
      monitor.log(pp.pretty(this.node.object) + ' evaluates to ' + String(baseValue.value) + ' in ' + pp.pretty(this.node));
    }

    conversion.CheckObjectCoercible(baseValue);
    vs.push(new Reference(baseValue,conversion.ToString(propertyNameValue)));
  }

  // Identifier, 11.1.2 -> 10.3.1 -----------------------------------------

  function identifierExpression(node,wl,vs) {
    vs.push(env.GetIdentifierReference(monitor.context.lexicalEnv, node.name));
  }

  // Literals, 11.1.3 -> 7.8 ----------------------------------------------
  
  function literalExpression(node,wl,vs) {
    var res = new Value(node.value, bot);

    if (node.value instanceof RegExp) {
      res.value = new RegExpObject(node.value,bot);
    }

    vs.push(res);
  }

  // ------------------------------------------------------------
  // statement handler functions

  var statementtbl = {
    'Program'             : blockStatement,
    'BlockStatement'      : blockStatement,
    'EmptyStatement'      : emptyStatement,
    'ExpressionStatement' : expressionStatement,
    'IfStatement'         : ifStatement,
    'SwitchStatement'     : switchStatement,
    'LabeledStatement'    : labeledStatement,
    'BreakStatement'      : breakStatement,
    'ContinueStatement'   : continueStatement,
    'WithStatement'       : withStatement,
    'ReturnStatement'     : returnStatement,
    'ThrowStatement'      : throwStatement,
    'TryStatement'        : tryStatement,
    'WhileStatement'      : whileStatement,
    'DoWhileStatement'    : doWhileStatement,
    'ForStatement'        : forStatement,
    'ForInStatement'      : forInStatement,

    'VariableDeclaration' : variableDeclaration,
    'FunctionDeclaration' : emptyStatement,
    'DebuggerStatement'   : debuggerStatement
  };

  var emptyLabel = 'default'; // default is a reserved word so no actual label can be named default 

  // ------------------------------------------------------------

  function blockStatement(node,wl) {
    wl.prepend(node.body);
  }

  // ------------------------------------------------------------
  
  function emptyStatement() { 
  }

  // ------------------------------------------------------------
  
  function expressionStatement(node,wl) {
    var ip = wl.top();
    ip.then(node.expression);

    ip.then(expressionStatementEnd);
  }

  function expressionStatementEnd() {
    var c   = monitor.context;
    var vs  = c.valueStack;

    c.result.value = GetValue(vs.pop());
  }

  // ------------------------------------------------------------
  
  function ifStatement(node,wl) {
    var ip = wl.top();

    ip.then(node.test);
    ip.then(ifStatementChoose, { node : node });
  }

  // ifStatementChoose

  function ifStatementChoose(wl,vs) {
    var ip = wl.top();

    var cond = GetValue(vs.pop());
    cond = conversion.ToBoolean(cond);
    
    monitor.context.pushPC(cond.label);

    if (cond.label > monitor.context.pc && hybrid) {
      hybrid(this.node.consequent);
      hybrid(this.node.alternate);
    }

    if (cond.value) {
      ip.then(this.node.consequent);
    } else {
      this.node.alternate && ip.then(this.node.alternate);
    }

    ip.then(ifStatementEnd, { label : cond.label });
  }

  // ifStatementEnd

  function ifStatementEnd(wl,vs) {
    var c = monitor.context;
    c.popPC();
    if (c.result.value) { 
      c.result.value.raise(this.label);
    }
  } 

  ifStatementEnd.runfor =  runfor_continue_break;
  
  // 12.11 ---------------------------------------------------------------------
 
  function switchStatement(node,wl) {
    var c  = monitor.context;    
    var lmap = monitor.context.labels.labelmap;

    if (!node.labelset) {
      node.labelset = new Set([]);
    }
    node.labelset.add(emptyLabel);

    var outerEmptyLabelData = lmap[emptyLabel];
    lmap[emptyLabel] = { label    : c.effectivePC, 
                         pcmarker : c.pcStack.marker() };

    var contextLabel = lmap[emptyLabel].label;
    c.pushPC(contextLabel);

    var switchState = { 
      node                : node, 
      outerEmptyLabelData : label, 
      defaultCaseIndex    : null,
      nextCase            : 0
    };

    if (node.cases) {
      for (var i = 0; i < node.cases.length; i++) {
        if (node.cases[i].test === null) {
          switchState.defaultCaseIndex = i;
          break;
        }
      }
    }

    var ip = wl.top();

    // Store the discriminant value on the value stack.
    // It is later popped by switchStatementEnd.
    ip.then(node.discriminant);
    ip.then(_GetValue);

    // Set up statement labels
    ip.then(switchStatementUpgradeLabels, switchState);

    // Kick off the first case
    ip.then(switchStatementCase, switchState);

    // Clean up and handle breaks
    ip.then(switchStatementEnd, switchState); 
  }

  function switchStatementUpgradeLabels(wl, vs) {
    var c = monitor.context;
    var discriminantLabel = vs.peek().label;
    var lblmap = c.labels.labelmap;
   
    c.labels.pc = lub(c.labels.pc, discriminantLabel);
    
    this.node.labelset.iter(function (name) { 
      lblmap[name].label = lub(lblmap[name].label, discriminantLabel);
    });
  }

  function switchStatementCase(wl, vs) {
    var ip = wl.top();
    var idx = this.nextCase;

    if (this.node.cases === undefined || idx >= this.node.cases.length) {
      // No more cases to try, schedule the default 
      // case if there is one
      if (this.defaultCaseIndex !== null) {
        for (var i = this.defaultCaseIndex; i < this.node.cases.length; i++) {
          for (var j = 0; j < this.node.cases[i].consequent.length; j++) {
            ip.then(this.node.cases[i].consequent[j]);
          }
        }
      }
      return;
    }

    if (idx === this.defaultCaseIndex) {
      // Skip the default case during matching
      this.nextCase += 1;
      ip.then(switchStatementCase, this);
      return;
    }

    vs.dup(); // Duplicate the discriminant value

    // Push the test value
    ip.then(this.node.cases[idx].test);
    ip.then(_GetValue);

    // Test for equality and decide what to do next
    ip.then(switchStatementTest, this);
  }

  function switchStatementTest(wl, vs) {
    var ip = wl.top();

    binaryStrictEqs('===', wl, vs);
    var bresult = vs.pop();

    monitor.context.labels.pc = lub(monitor.context.labels.pc, bresult.label);

    if (bresult.value) {
      // Found a match, schedule all statements from here down
      for (var i = this.nextCase; i < this.node.cases.length; i++) {
        for (var j = 0; j < this.node.cases[i].consequent.length; j++) {
          ip.then(this.node.cases[i].consequent[j]);
        }
      }
    } else {
      this.nextCase += 1;
      ip.then(switchStatementCase, this);
    }
  }

  function switchStatementEnd(wl, vs) {
    var c = monitor.context;

    vs.pop(); // pop the discriminant value
    c.popPC(); // pop the labelContext

    if (c.result.type === 'break' && this.node.labelset.contains(c.result.target)) {
      c.result.type   = 'normal';
      c.result.target = null;
      c.labels.labelmap['empty'] = this.outerEmptyLabelData;
    }
  }
  switchStatementEnd.runfor = runfor_break;

  // 12.12 ---------------------------------------------------------------------

  function labeledStatement(node,wl) {
    var ip = wl.top();
    var c  = monitor.context;

    var pcmarker = c.pcStack.marker();
    var vsmarker = c.valueStack.marker();

    if (!node.body.labelset) { 
      node.body.labelset = new Set([node.label.name]);

      if (node.labelset) {
        node.body.labelset.union(node.labelset);
      }
    }

    var name = node.label.name;
    var outerlabel = setupStatementLabel(name);

    var labeldata = c.labels.labelmap[name];
    labeldata.pcmarker = c.pcStack.marker();
      
    c.pushPC(labeldata.label);

    ip.then(node.body);
    ip.then(labeledStatementEnd,
            { name       : name,
              outerlabel : labeldata.label,
              pcmarker   : pcmarker,
              vsmarker   : vsmarker });
  }

  // labeledStatementEnd
  
  function labeledStatementEnd(wl,vs) {
    var c = monitor.context;

    var result = c.result;

    // reset the outer label - no need to reset pcmarker since
    // statement labels with the same name cannot be nested
    c.labels.labelmap[this.name].label = this.outerlabel;

    c.pcStack.reset(this.pcmarker);
    c.valueStack.reset(this.vsmarker);

    if (result.type === 'break' && result.target === this.name) {
      result = c.result;
      result.type   = 'normal';
      result.target = null;
    }
  }
  
  labeledStatementEnd.runfor = runfor_continue_break; 

  // 12.8 ----------------------------------------------------------------------

  function breakStatement(node,wl) {
    var c = monitor.context;
    var result = monitor.context.result;

    var name       = node.label ? node.label.name : emptyLabel;
    var lblcontext = c.labels.labelmap[name].label;

    var displayName = node.label ? '(' + name + ')' : '';
    monitor.assert(le(c.effectivePC, lblcontext),
      'write context ' + c.effectivePC + ' not below ' +
      'label context ' + lblcontext + ' ' + displayName
    );

    result.type   = 'break';
    result.target = name;
  }

  // 12.7 ----------------------------------------------------------------------

  function continueStatement(node,wl) {
    var c = monitor.context;
    var result = monitor.context.result;

    var name       = node.label ? node.label.name : emptyLabel;
    var lblcontext = c.labels.labelmap[name].label;

    var displayName = node.label ? '(' + name + ')' : '';
    monitor.assert(le(c.effectivePC, lblcontext),
      'write context ' + c.effectivePC + ' not below ' +
      'label context ' + lblcontext + displayName
    );

    result.type   = 'continue';
    result.target = name;
  }

  // 12.10 ---------------------------------------------------------------------

  function withStatement(node,wl) {
    var ip = wl.top();

    ip.then(node.object);
    ip.then(withStatementBody, { node : node });
  }

  // withStatementBody

  function withStatementBody(wl,vs) {
    var ip = wl.top();
    var c = monitor.context;

    var val = GetValue(vs.pop());
    var obj = conversion.ToObject(val);

    var oldEnv = c.lexicalEnv;
    var newEnv = env.NewObjectEnvironment(obj, oldEnv);
    newEnv.provideThis();

    c.lexicalEnv = new Value(newEnv, obj.label);

    ip.then(this.node.body);
    ip.then(withStatementEnd, { lexicalEnv : oldEnv });
  }

  // withStatementEnd

  function withStatementEnd(wl,vs) {
    monitor.context.lexicalEnv = this.lexicalEnv;
  }

  withStatementEnd.runfor = runfor_continue_break;

  //---------------------------------------------------------------------------- 

  function returnStatement(node,wl) {
    var c = monitor.context;
    var ip = wl.top();

    monitor.assert(le(c.effectivePC, c.labels.ret),
      'write context ' + c.effectivePC + ' not below ' +
      'return context ' + c.labels.ret
    );

    if (node.argument) {
      ip.then(node.argument);
    } else {
      c.valueStack.push(new Value(undefined,bot));
    }
    ip.then(returnStatementEnd);
  }

  // returnStatementEnd

  function returnStatementEnd(wl,vs) {
    var result = monitor.context.result;

    result.type   = 'return';
    result.value  = GetValue(vs.pop());
    result.target = null;
  }

  //---------------------------------------------------------------------------- 

  function throwStatement(node,wl) {
    var ip = wl.top();

    ip.then(node.argument);
    ip.then(throwStatementEnd);
  }

  // throwStatementEnd
  function throwStatementEnd(wl,vs) {
    var c = monitor.context;
    var result = c.result;
    var exprRef = vs.pop();

    // Verfiy that the exception is allowed 
    monitor.assert(le(c.effectivePC, c.labels.exc),
      "exception in " + c.effectivePC + " not allowed with exception label " + c.labels.exc);

    result.type  = 'throw';
    result.value = GetValue(exprRef);
    monitor.offendingTrace = monitor.stackTrace();
  }

  //---------------------------------------------------------------------------- 

  function tryStatement(node,wl) {
    var ip = wl.top();
    var c = monitor.context;

    ip.then(node.block);
    // Expression evaluation might cause exceptions; if so the state of
    // the context might need some cleaning up.
    // The result stack and the worklist are not affected by expression so their
    // states are fine.
    // The ret label cannot be affected by exceptions.
    
    // The stacks needs to be reset. 
    var pcmarker = c.pcStack.marker();
    var vsmarker = c.valueStack.marker();
    
    var exc      = c.labels.exc;

    // esprima seems to generate a list of handlers --- standard only supports one
    ip.then(tryStatementCatch,
            { handler : node.handlers[0],
              pcmarker : pcmarker,
              vsmarker : vsmarker,
              exc      : exc });

    // The finalizer 

    var lexicalEnv = c.lexicalEnv;
    ip.then(tryStatementFinally, { body       : node.finalizer, 
                                   pcmarker   : pcmarker,
                                   vsmarker   : vsmarker,
                                   lexicalEnv : lexicalEnv });
        
  }

  // tryStatetementCatch

  function tryStatementCatch(wl,vs) {
    var c = monitor.context;
    var result = c.result;

    // We are in charge of resetting the exc label, the finally does the rest 
    // of the cleaning.

    // The pc of the catch block is pc + exc of body
    var handlerPC = lub(c.labels.pc, c.labels.exc);

    // The exc of the catch block is the exc of _catch, that resets the exc
    c.labels.exc = this.exc;

    // if there is no handler or no exception was thrown, there's nothing more to do
    if (!this.handler || result.type !== 'throw') {
      return;
    }

    c.pcStack.reset(this.pcmarker);
    c.valueStack.reset(this.vsmarker);

    c.pcStack.push(handlerPC);

    var catchEnv = env.NewDeclarativeEnvironment(c.lexicalEnv);
    
    // ECMA-262 allows only idenfifiers, but the parser allows patterns;
    if (this.handler.param.type !== 'Identifier') {
      monitor.fatal('Pattern in catch not supported');
    }

    var identifier = new Value(this.handler.param.name, bot);
    catchEnv.CreateMutableBinding(identifier);
    catchEnv.SetMutableBinding(identifier,result.value);

    c.lexicalEnv = new Value(catchEnv, c.effectivePC);

    result.type  = 'normal';
    result.value = null;

    wl.push(this.handler.body);
  }

  tryStatementCatch.runfor = runfor_throw;

  // tryStatementFinally

  function tryStatementFinally() {
    var c = monitor.context;

    // The pc of the finally is the pc of the try.
    // The exc of the finally is the exc of the _catch, which is either
    // the exc of theee try, unless it was raised by a handler, in which
    // case it escapes the try, and should affect the finally too.

    // We are in charge of resetting the pcStack, and the lexicalEnv 
    c.pcStack.reset(this.pcmarker);
    c.valueStack.reset(this.vsmarker);
    c.lexicalEnv = this.lexicalEnv;
    
    // if there is no finally block, we're done
    if (!this.body) {
      return;
    }

    // Allocate a new result --- _finally env choses between the result
    // of the body/handler, and the result of the finally
    var result = c.result;
    c.result = new Result();

    var ip = c.workList.top();

    ip.then(this.body);
    ip.then(tryStatementFinallyEnd, { result : result });
  }

  tryStatementFinally.runfor = runfor_all;

  // tryStatementFinallyEnd

  function tryStatementFinallyEnd(wl,vs) {
    var c = monitor.context;

    if (c.result.type === 'normal') {
      c.result = this.result;
    }
  }

  tryStatementFinallyEnd.runfor = runfor_all;

  // ------------------------------------------------------------

  function whileStatement(node,wl) {
    var c = monitor.context;
    var ip = wl.top();
    var lmap = c.labels.labelmap;

    if (!node.labelset) {
      node.labelset = new Set([]);
    }
    node.labelset.add(emptyLabel);
    
    var outerEmptyLabelData = lmap[emptyLabel];
    lmap[emptyLabel] = { label    : c.effectivePC, 
                         pcmarker : c.pcStack.marker() };

    var contextLabel = lmap[emptyLabel].label;
    c.pushPC(contextLabel);
    
    ip.then(whileStatementShared, { node : node, outerEmptyLabelData : outerEmptyLabelData });

  }

  // ------------------------------------------------------------

  function doWhileStatement(node,wl) {
    var c = monitor.context;
    var ip = wl.top();
    var lmap = c.labels.labelmap;

    if (!node.labelset) {
      node.labelset = new Set([]);
    }
    node.labelset.add(emptyLabel);

    var outerEmptyLabelData = lmap[emptyLabel];
    lmap[emptyLabel] = { label    : c.effectivePC, 
                         pcmarker : c.pcStack.marker() };

    // used for both statement label security labels and control security label
    var contextLabel = lmap[emptyLabel].label;
    c.pushPC(contextLabel);

    ip.then(node.body);
    ip.then(whileStatementShared, { node : node, outerEmptyLabelData : outerEmptyLabelData });
  }

  // ------------------------------------------------------------
  
  function whileStatementShared(wl,vs) {
    var ip = wl.top();

    var c  = monitor.context;
    var result = c.result;

    if (result.type === 'break' && this.node.labelset.contains(result.target)) {
      result.type   = 'normal';
      result.target = null;
      c.labels.labelmap[emptyLabel] = this.outerEmptyLabelData;
      c.popPC(); // contextLabel
      return;
    }

    if (result.type !== 'continue' || !this.node.labelset.contains(result.target)) {
      if (result.type !== 'normal') {
        return;
      }
    }
    
    // continue gets us here
    result.type   = 'normal';
    result.target = null;

    ip.then(this.node.test);
    ip.then(whileStatementSharedChoose, this);
  }

  whileStatementShared.runfor = runfor_continue_break;

  // whileStatementSharedChoose

  function whileStatementSharedChoose(wl,vs) {
    var c  = monitor.context;

    var cond  = GetValue(vs.pop());
    var condb = conversion.ToBoolean(cond);

    c.labels.pc = lub(c.labels.pc, condb.label);
    if (condb.value) {
      var ip = wl.top();

      ip.then(this.node.body);
      ip.then(whileStatementShared, this);

    } else {
      c.labels.labelmap[emptyLabel] = this.outerEmptyLabelData;
      c.popPC(); // contextLabel
    }
  }

  whileStatementSharedChoose.runfor = runfor_continue;


  // ------------------------------------------------------------

  function forStatement(node,wl) {
    var c = monitor.context;
    var ip = wl.top();
    var lmap = c.labels.labelmap;

    if (node.init) {
      ip.then(node.init);
    }

    if (!node.labelset) {
      node.labelset = new Set([]);
    }
    node.labelset.add(emptyLabel);

    var outerEmptyLabelData = lmap[emptyLabel];
    lmap[emptyLabel] = { label    : c.effectivePC, 
                         pcmarker : c.pcStack.marker() };
    
    var contextLabel = lmap[emptyLabel].label;
    c.pushPC(contextLabel);
        
    ip.then(forStatementMain, { node : node });
    ip.then(forStatementEnd, { outerEmptyLabelData : outerEmptyLabelData });
  }

  // forStatementMain
  function forStatementMain(wl,vs) {
    var c  = monitor.context;
    var ip = wl.top();

    var result = c.result;

    if (result.type === 'break' && this.node.labelset.contains(result.target)) {
      result.type   = 'normal';
      result.target = null;
      return;
    }

    if (result.type !== 'continue' || !this.node.labelset.contains(result.target)) {
      if (result.type !== 'normal') {
        return;
      }
    }

    result.type   = 'normal';
    result.target = null;

    if (this.node.test) {
      ip.then(this.node.test);
      ip.then(forStatementChoose, this);
    } else {
      ip.then(forStatementExecute, this); 
    }
  }
  forStatementMain.runfor = runfor_continue_break;

  // forStatementChoose
  function forStatementChoose(wl,vs) {
    var ip = wl.top();
    var c = monitor.context;
    var result = c.result;

    var cond  = GetValue(vs.pop());
    var condb = conversion.ToBoolean(cond);

    c.labels.pc = lub(c.labels.pc, condb.label);
    if (!condb.value) {
      result.type   = 'normal';
      result.target = null;
      return;
    }
   
    ip.then(forStatementExecute, this);
  }
  forStatementChoose.runfor = runfor_continue;

  function forStatementExecute(wl,vs) {
    var ip = wl.top();

    ip.then(this.node.body);
    ip.then(forStatementUpdate, this);
    ip.then(forStatementMain, this);
    
  }

  function forStatementUpdate(wl,vs) {
    var ip = wl.top();

    var c  = monitor.context;
    var result = c.result;
     
    if (result.type !== 'continue' || !this.node.labelset.contains(result.target)) {
      if (result.type !== 'normal') {
        return;
      }
    }

    result.type   = 'normal';
    result.target = null;

    if (this.node.update) {
      ip.then(this.node.update);
      ip.then(_GetValue);
    }
  }
  forStatementUpdate.runfor = runfor_continue;


  // forStatementeEnd
  function forStatementEnd(wl,vs) {
    var c = monitor.context;
    c.labels.labelmap[emptyLabel] = this.outerEmptyLabelData;
    c.popPC();
  }

  // ------------------------------------------------------------
 
  function forInStatement(node,wl) {
    var ip = wl.top();

    var left;
    if (node.left.type === 'VariableDeclaration') {
      ip.then(node.left);

      // the standard only allows for one declaration, get the name
      left = node.left.declarations[0].id;
    } else {
      left = node.left;
    }
  
    ip.then(node.right);
    ip.then(forInStatementSetup, { node : node, left : left } );
  }  

  function forInStatementSetup(wl,vs) {
    var c = monitor.context;
    var ip = wl.top();
    var lmap = c.labels.labelmap;

    var node = this.node;

    if (!node.labelset) {
      node.labelset = new Set([]);
    }
    node.labelset.add(emptyLabel);

    var outerEmptyLabelData = lmap[emptyLabel];
    lmap[emptyLabel] = { label    : c.effectivePC, 
                         pcmarker : c.pcStack.marker() };

    var contextLabel = lmap[emptyLabel].label;
    c.pushPC(contextLabel);
  
    var obj        = conversion.ToObject(GetValue(vs.pop()));
    var properties = obj.value.getEnumerablePropertyNames(obj.label).reverse();

   // monitor.context.pushPC(obj.label);

    ip.then(forInExecute, { node                : this.node, 
                            left                : this.left, 
                            properties          : properties, 
                            outerEmptyLabelData : outerEmptyLabelData });
  }

  function forInExecute(wl,vs) {
    var ip = wl.top();
    var c  = monitor.context;
    var result = c.result;

    if (result.type === 'break' && this.node.labelset.contains(result.target)) {
      result.type   = 'normal';
      result.target = null;
      c.labels.labelmap[emptyLabel] = this.outerEmptyLabelData;
      c.popPC(); // contextLabel
      return;
    }

    if (result.type !== 'continue' || !this.node.labelset.contains(result.target)) {
      if (result.type !== 'normal') {
        return;
      }
    }

    // continue gets us here
    result.type   = 'normal';
    result.target = null;

    var found = false;
    var propName;
    var P;

    if (this.properties.length === 0) {
      c.labels.labelmap[emptyLabel] = this.outerEmptyLabelMap;
      c.popPC(); // contextLabel
      return;
    }

    propName = this.properties.pop();

    vs.push(propName);
    ip.then(this.left);
    ip.then(forInUpdate, this);
  }
  
  forInExecute.runfor = runfor_continue_break;

  function forInUpdate(wl,vs) {
    var ip = wl.top();

    var lhs = vs.pop();
    var propName = vs.pop();

    PutValue(lhs, propName);

    monitor.context.pushPC(propName.label);

    ip.then(this.node.body);
    ip.then(forInSecurityContextEnd);
    ip.then(forInExecute,this);
  }

  function forInSecurityContextEnd(wl,vs) {
    monitor.context.popPC();
  } 
  
  // ------------------------------------------------------------

  function variableDeclaration(node,wl) {
    var ip = wl.top();

    for (var i = 0, len = node.declarations.length; i < len; i++) {
      var vd = node.declarations[i];
      if (vd.init) {
      
        if (vd.id.type !== 'Identifier') {
          monitor.fatal(vd.id.type + ' not supported in variable declarations');
        }
        
        var lhs = env.GetIdentifierReference(monitor.context.lexicalEnv, vd.id.name);
        ip.then(vd.init);
        ip.then(variableDeclarationUpdate, { lhs : lhs });

      } 
    }
  }

  // variableUpdate
  function variableDeclarationUpdate(wl,vs) {
    var rhs = GetValue(vs.pop());
    PutValue(this.lhs,rhs);
  }

  // ------------------------------------------------------------

  function debuggerStatement(node,wl) {
    monitor.debug.active = true;
  }


  // https://developer.mozilla.org/en-US/docs/SpiderMonkey/Parser_API
  // -------------------------------------------------------------


  function step() {

    var c  = monitor.context;
    var wl = c.workList;
    var vs = c.valueStack;
    
    var result = c.result;

    if (wl.empty()) {
      return false;
    }

    var task = wl.pop();

    try {

      // throw, continue, or break state

      if (result.type !== 'normal') {

        while(true) {

          if (task.runfor && result.type in task.runfor) {
            task(wl,vs);
            return true;
          } 

          if (task.func && task.func.runfor && result.type in task.func.runfor) {
            task.func.call(task.data,wl,vs);
            return true;
          }

          if (wl.empty()) {
            break;
          }
          task = wl.pop();
        }

        return false;
      }

      // function?

      if (typeof task === 'function') {
        task(wl,vs); 
        return true;
      }

      // closure?
      
      if ('func' in task && 'data' in task) {
        task.func.call(task.data,wl,vs);
        return true;
      }


      // otherwise, syntax
      var node = task;
      
      // for stackTrace
      c.currentStatement = node;

      // expressions
      if (node.type in expressiontbl) {
        expressiontbl[node.type](node,wl,vs);
        return true;
      }

      // statement 

      if (node.type in statementtbl) {
        statementtbl[node.type](node,wl);
        return true;
      }

      monitor.fatal(node.type + ' not implemented');

    } catch (e) {
  
      if (e instanceof Value) {

        // Verfiy that the exception is allowed 
        monitor.assert(le(c.effectivePC, c.labels.exc),
          "exception in " + c.effectivePC + " not allowed with exception label " + c.labels.exc);

        result.type  = 'throw';
        result.value = e; 
        return true;
      }

      throw e;
    }
    return true;
  }

  // ----------------------------------------------------------------------------- 
  // Initializes the statement label security label.

  function setupStatementLabel(name) {
    var c = monitor.context;
    var lmap = c.labels.labelmap;
    if (!lmap[name]) {
      lmap[name] = { label : bot, pcmarker : undefined };
    }

    var labeldata = lmap[name];
    var outerlabel = labeldata.label;

    // raise to effective pc
    labeldata.label = lub(labeldata.label, c.effectivePC);

    return outerlabel;
  }


  return module;
};

