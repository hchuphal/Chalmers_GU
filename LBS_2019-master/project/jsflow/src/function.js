/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

exports.functor = function (monitor) {

  var modules = monitor.modules;

  var esprima         = monitor.require('esprima');
  var estraverse      = monitor.require('estraverse');

  var label           = monitor.require('label');
  var conversion      = monitor.require('conversion');
  var prelude         = monitor.require('prelude');
  var ecma            = monitor.require('ecma');
  var constants       = monitor.require('constants');
  var pp              = monitor.require('pp');


  var Value           = monitor.require('values').Value;

  var Ecma            = ecma.Ecma;

  var Label           = label.Label;
  var lub             = label.lub;
  var le              = label.le;
  var bot             = Label.bot;

  // ------------------------------------------------------------
 
  var module = {};
  module.BuiltinFunctionObject           = BuiltinFunctionObject;
  module.Unimplemented                   = Unimplemented;
  module.FunctionObject                  = FunctionObject;
  module.HasInstance                     = HasInstance;
  module.allocate                        = allocate;
  module.setup                           = setup;
  module.HoistVariables                  = HoistVariables;
  module.HoistFunctions                  = HoistFunctions;
  module.DeclarationBindingInstantiation = DeclarationBindingInstantiation;
  module.enterEvalCode                   = enterEvalCode;

  // ------------------------------------------------------------

  
  function allocate(host) {
    var functionConstructor = new FunctionConstructor(host);
    var functionPrototype   = functionConstructor._proto; 

    return { FunctionConstructor : functionConstructor,
             FunctionPrototype   : functionPrototype
           };
  }

  function setup() {
    monitor.instances.FunctionPrototype.setup();
  }

  // ------------------------------------------------------------

  function BuiltinFunctionObject(f,n,host) {

    Ecma.call(this);
    this.host           = host;
    this.actualFunction = f;

    this.Class          = 'Function';
    // functionPrototype is set before this is run
    this.Prototype      = new Value(monitor.instances.FunctionPrototype,bot);
    this.Extensible     = true;

    var _this           = this;
      
    this.Call           = 
      function(thisArg, args) {
        try {
          return f.call(_this,thisArg, args);
        } catch (e) {

          if (e instanceof Value) {
            throw e;
          }

          monitor.liftException(e,true); 
        }
      };

    this.nativeFunction = f;

    ecma.DefineFFF(this, constants.length, n);
  }

  prelude.inherits(BuiltinFunctionObject,Ecma);

  BuiltinFunctionObject.prototype.Construct = function() {
    monitor.Throw(
      modules.error.TypeErrorObject,
      'cannot be used as a constructor', 
      bot
    );
  };

  BuiltinFunctionObject.prototype.toString = function() {
    if (this.host) {
      return this.host.toString();
    } else {
      return 'NO HOST GIVEN! : ' + this.nativeFunction;
    }
  };

  // ------------------------------------------------------------

  function Unimplemented(name) {

    var f = function() {
      monitor.fatal(name + ' unimplemented in ');
    };

    return f;
  }

  // ------------------------------------------------------------

  function HasInstance(V) {
    var F = this;

    if (typeof V.value !== 'object')
      return new Value(false, V.label);

    var l = V.label;

    var O = F.Get(constants.prototype);
    if (typeof O.value !== 'object') {
      monitor.Throw(
        modules.error.TypeErrorObject,
        'HasInstance',
        bot
      );
    }

    while (V.value !== null) {
      V = V.value.Prototype;
      l = lub(l, V.label);
      if (O.value === V.value) return new Value(true,l);
    }

    return new Value(false,l);
  }

  // ------------------------------------------------------------
  // Function Constructor, 15.3.2 (15.3.1, 15.3.1.1)

  function FunctionConstructor(host) {
    Ecma.call(this);

    // Properties, 15.3.3.
    this.Class      = 'Function';
    this.host       = host;
    this.Extensible = true;

    this._proto     = new FunctionPrototype(this);
    this.Prototype  = new Value(this._proto, bot); 

    // 15.3.3.1 
    ecma.DefineFFF(this,constants.prototype,this._proto);
    // 15.3.3.2 
    ecma.DefineFFF(this, constants.length, 1);
  }

  prelude.inherits(FunctionConstructor, Ecma);

  FunctionConstructor.prototype.HasInstance = HasInstance;

  // 15.3.1
  FunctionConstructor.prototype.Call = function(thisArg, args) {
    return this.Construct(args);
  };

  // 15.3.2
  FunctionConstructor.prototype.Construct = function(args) {
    var argCount = args.length;
    var P = ''; 
    var body;
    var label = bot;

    if (argCount === 0) {
      body = new Value('',bot);
    } else if (argCount === 1) {
      body = args[0];
    } else {
      var firstArg = conversion.ToString(args[0]);
      label = lub(label,firstArg.label);
      P = firstArg.value;

      for (var i = 1; i < argCount - 1; i++) {
        var nextArg = conversion.ToString(args[i]);
        label = lub(label,firstArg.label);
        P += ', ' + nextArg.value;
      }

      body = args[argCount-1];
    }

    body  = conversion.ToString(body);
    label = lub(label,body.label);
    
    P = '(function (' + P + ') { ' + body.value + '});';
    var prog;
    try {
      prog = esprima.parse(P, { loc : true, source : 'Function' } );
    } catch (e) {
      monitor.Throw(
        modules.error.SyntaxErrorObject,
        e.message,
        label
      );
    }
   
    // parsing returns a program --- we are interested in function declaration
    var func = prog.body[0].expression;

    var F = new FunctionObject(
      func.params,
      func.body,
      new Value(monitor.instances.globalEnvironment,bot)
    );

    // For pretty printing
    F.Source = func;

    return new Value(F,label);
  };

  // ------------------------------------------------------------
  // Function Prototype, 15.3.4

  function FunctionPrototype(functionConstructor) {
    Ecma.call(this);
    
    // 15.3.4
    this.Class     = 'Function';
    this.Extensible = true;

    this.host = functionConstructor.host.prototype;

    ecma.DefineFFF(this,constants.length, 0);

    // 15.3.4.1
    ecma.DefineTFT(this,constants.constructor, functionConstructor);

    ecma.DefineTFT(this, constants.toString, new BuiltinFunctionObject(toString, 0, Function.prototype.toString));
    ecma.DefineTFT(this, constants.apply   , new BuiltinFunctionObject(apply   , 2, Function.prototype.apply));
    ecma.DefineTFT(this, constants.call    , new BuiltinFunctionObject(call    , 1, Function.prototype.call));
    ecma.DefineTFT(this, constants.bind    , new BuiltinFunctionObject(bind    , 1, Function.prototype.bind));
  }

  prelude.inherits(FunctionPrototype,Ecma);
  
  FunctionPrototype.prototype.setup = function() {
    this.Prototype  = new Value(monitor.instances.ObjectPrototype, bot); 
  };

  // 15.3.4
  FunctionPrototype.prototype.Call      = function() { return new Value(undefined,bot); };
  FunctionPrototype.prototype.Construct = function() { return new Value(undefined,bot); };

  // ------------------------------------------------------------
  // 15.3.4.2 - Implementation Dependent
  var toString = function(thisArg,args) {
    if (thisArg.value.Source) {
      var str = pp.pretty(thisArg.value.Source);
      return new Value(str,thisArg.label);
    }

    if (thisArg.value.host) {
      var str = thisArg.value.host.toString();
      return new Value(str, thisArg.label);
    }

    return new Value('function', thisArg.label);
  };

  // ------------------------------------------------------------
  // 15.3.4.3
  var apply = function(thisArg,args) {
    var _this    = args[0] ? args[0] : new Value(undefined,bot);
    var argArray = args[1] ? args[1] : new Value(undefined,bot);

    monitor.context.pushPC(thisArg.label);

    if (!conversion.IsCallable(thisArg).value) {
      monitor.Throw(
        modules.error.TypeErrorObject,
        'apply, not a function',
        bot
      );
    }

    monitor.context.raisePC(argArray.label);

    if (argArray.value === null || argArray.value === undefined) {
      var res = thisArg.Call(_this,[]);
      monitor.context.popPC();
      return res;
    }
    
    if (typeof argArray.value !== 'object' || argArray.value.Class === undefined) {
      monitor.Throw(
        modules.error.TypeErrorObject,
        'apply, argument array not an object',
        bot
      );
    }

    var len = argArray.Get(constants.length);
    var n   = conversion.ToUInt32(len);

    var argList = [];
    for (var index = 0; index < n.value; index++) {
      var nextArg = argArray.Get(new Value(index, n.label));
      argList.push(nextArg);
    }

    // Since we cannot transfer the structural or existence info to
    //  the array used by Call, we raise the context accordingly.
    //  This is sound, but potentially an over approximation.

    monitor.context.raisePC(n.label);

    var res = thisArg.Call(_this, argList);

    monitor.context.popPC();
    return res;
  };

  // ------------------------------------------------------------
  // 15.3.4.4
  var call = function(thisArg, args) {

    var _this    = args[0] ? args[0] : new Value(undefined,bot);
    var argList = { };
    
    for (var i = 1; i < args.length; i++) {
      argList[i-1] = args[i];
    }

    argList.length = args.length-1;

    monitor.context.pushPC(thisArg.label);

    if (!conversion.IsCallable(thisArg).value) {
      monitor.Throw(
        modules.error.TypeErrorObject,
        'call, not a function',
        bot
      );
    }

    var res = thisArg.Call(_this, argList);
    monitor.context.popPC();
    return res;
  };

  // ------------------------------------------------------------
  // 15.3.4.5
  var bind = new Unimplemented('bind');

  // ------------------------------------------------------------
  // Function objects, 13.2
    
  function FunctionObject(parms,code,scope) {
    Ecma.call(this);

    this.Class     = 'Function';
    this.Prototype = new Value(monitor.instances.FunctionPrototype,bot);

    this.Scope     = scope;
    this.FormalParameters = parms ? parms : { length : 0 };
    this.Code      = code;

    this.Extensible = true;

    ecma.DefineFFF(this, constants.length, this.FormalParameters.length);
    ecma.DefineTFT(this, constants.arguments, null);

    var proto = new modules.object.ObjectObject();
    ecma.DefineTFT(proto, constants.constructor, this);
    
    ecma.DefineTFT(this, constants.prototype, proto);
  }

  prelude.inherits(FunctionObject, Ecma);

  // ---

  FunctionObject.prototype.AsyncCall = function(thisArg,args) {
    // step 1, as in 10.4.3 embodied in enterFunctionCode
    var funcCtx = enterFunctionCode(this,thisArg,args);
  
    // for stack trace
    funcCtx.owner = this.Name;

    monitor.contextStack.push(funcCtx);
    var ip = funcCtx.workList.top();

      var res;
      if (this.Code) {
        ip.then(this.Code);
        ip.then(AsyncCallEnd);
      } else {
        ip.then(AsyncCallEnd);
      }

  };

  // ---

  function AsyncCallEnd() {
    var callContext = monitor.context;
    monitor.contextStack.pop();
    var callerContext = monitor.context;

    var result = callContext.result;
    var retlabel = callContext.labels.ret;

    if (result.type !== 'normal' && result.value) {
      result.value.raise(retlabel);
    } else {
      result.value = new Value(undefined,retlabel);
    }

    // copy out the inner exception level
    callerContext.labels.exc = lub(callerContext.labels.exc,callContext.labels.exc);
    callerContext.valueStack.push(result);
  }
  AsyncCallEnd.runfor = { 'return' : true, 'throw' : true};

  // ---

  // 13.2.1 
  FunctionObject.prototype.Call = function(thisArg,args){
  
    // step 1, as in 10.4.3 embodied in enterFunctionCode
    var funcCtx = enterFunctionCode(this,thisArg,args);
  
    // for stack trace
    funcCtx.owner = this.Name;

    var res;
    monitor.contextStack.push(funcCtx);

      if (this.Code) {
        res = modules.exec.execute(this.Code, false);
      } 

      if (funcCtx.result.value) {
        funcCtx.result.value.raise(funcCtx.labels.ret);
      }

    monitor.contextStack.pop();

    // copy out the inner exception level
    monitor.context.labels.exc = lub(monitor.context.labels.exc,funcCtx.labels.exc);

    switch (res.type) {
      case 'throw' : 
        throw res.value;
  
      case 'return' : 
        return res.value;
    }

    return new Value(undefined, funcCtx.labels.ret);
  };

  // ---

  FunctionObject.prototype.AsyncConstruct = function(args) {
    var obj = new Ecma();
    obj.Class      = 'Object';
    obj.Extensible = true;

    var proto = this.Get(constants.prototype);
    if (typeof proto.value !== 'object') {
      proto.value = new Value(monitor.instances.ObjectPrototype,bot);
    }

    obj.Prototype = proto;

    var ip = monitor.context.workList.top();

    this.AsyncCall(new Value(obj,bot), args);
    ip.then(AsyncConstructEnd, { object : obj });

    return ip;
  };

  // ---

  function AsyncConstructEnd() {
    var retval = monitor.context.valueStack.peek();
      
    if (typeof retval.value.value !== 'object') {
      retval.value = new Value(this.object, bot); 
    }

  }
  AsyncConstructEnd.runfor = { 'return' : true, 'throw' : true };

  // ---
  // 13.2.2
  FunctionObject.prototype.Construct = function(args) {
    var obj = new Ecma();
    obj.Class      = 'Object';
    obj.Extensible = true;

    var proto = this.Get(constants.prototype);
    if (typeof proto.value !== 'object') {
      proto.value = new Value(monitor.instances.ObjectPrototype,bot);
    }

    obj.Prototype = proto;

    var result = this.Call(new Value(obj,bot), args);

    if (result.value.value !== 'object') {
      result.value = new Value(obj,bot);
    }
    return result;
  };

  // ---

  FunctionObject.prototype.HasInstance = HasInstance;

  // ---

  FunctionObject.prototype.toString = function() {
    if (this.Source) {
        return pp.pretty(this.Source);
    } else if (this.host) {
        return this.host.toString();
    } else {
        return 'host undefined for ' + this.Class;
    }
  };

  // ---

  // TODO: maybe replace with 'waring' getter
  FunctionObject.prototype.toNative = function(deep) {
    monitor.fatal('function/FunctionObject: toNative called on FunctionObject');
  };

  // ------------------------------------------------------------
  // 10.4.3
  function enterFunctionCode(F,thisArg,args) {
    var c = monitor.context;

    if (thisArg.value == null) {
      thisArg = new Value(monitor.instances.globalObject,thisArg.label);
    } else if (typeof thisArg.value !== 'object') {
      thisArg = conversion.ToObject(thisArg);
    }

    var localEnv = new Value(modules.env.NewDeclarativeEnvironment(F.Scope),
                             c.effectivePC);

    var newContext = c.clone(thisArg, localEnv, localEnv);
    newContext.labels.ret = lub(newContext.labels.ret, newContext.labels.pc);
    
    DeclarationBindingInstantiation(newContext,F,args);

    return newContext;
  }

  function enterEvalCode(code, _eval) {
    var c = monitor.context;

    // 15.1.2.1.1, is direct call
    var isDirect;

    isDirect = c.currentCall.reference.base.value instanceof modules.env.ObjectEnvironmentRecord ||
               c.currentCall.reference.base.value instanceof modules.env.DeclarativeEnvironmentRecord;

    isDirect = isDirect && c.currentCall.reference.propertyName.value === 'eval';
    isDirect = isDirect && c.currentCall.target.actualFunction === _eval;
 
    var context = c.clone();

    // 10.4.2 - no calling context or not direct call
    if (!isDirect) {
      var global    = monitor.instances.globalObject;
      var globalEnv = monitor.instances.globalEnvironment;

      context.thisValue   = new Value(global,bot);
      context.lexicalEnv  = new Value(globalEnv,bot);
      context.variableEnv = new Value(globalEnv,bot);
    }

    DeclarationBindingInstantiation(context,code);

    // for stack trace 
    context.owner = 'eval';

    return context;
  }

  // ------------------------------------------------------------
  // 10.5 - strict ignored

  function DeclarationBindingInstantiation(context,F,args) {
    
    var isFunctionCode, isEvalCode, code;
    if (F instanceof FunctionObject) {
      isFunctionCode = true;
      isEvalCode     = false;
      code           = F.Code;
    } else {
      isFunctionCode = false;
      isEvalCode     = true;
      code           = F;
    }

    var env = context.variableEnv;
    var configurableBindings = isEvalCode;
    
    if (isFunctionCode)  {
      BindArguments(env, F.FormalParameters, args);
    }

    var pc = context.effectivePC;

    HoistFunctions(env, code, configurableBindings, pc);

    var argumentsAlreadyDeclared = env.HasBinding(constants['arguments']);

    if (isFunctionCode && !argumentsAlreadyDeclared.value) {
      // make sure it returns a Value
      var argsObj = CreateArgumentsObject(env, F, args);

      F.DefineOwnProperty(constants['arguments'], argsObj,false);

      env.CreateMutableBinding(constants['arguments']);
      env.SetMutableBinding(constants['arguments'], argsObj,false);
    }

    HoistVariables(env, code, configurableBindings, pc);
  }

  // ------------------------------------------------------------
  // Function hoisting, part of 10.5

  function HoistFunctions(env, script, configurableBinding, pc) {

    if (!script.functionDeclarations) {
// 
      script.functionDeclarations = [];

      var visitor = {};
      visitor.leave = function() {};
      visitor.enter = function(node) {
  
        if (node.type === 'FunctionDeclaration') {
          script.functionDeclarations.push(node);
        }

        // Do not hoist inside functions
        if (node.type === 'FunctionDeclaration' ||
            node.type === 'FunctionExpression') {
          this.skip();
        }
      };

      estraverse.traverse(script, visitor);
    }

    var ds = script.functionDeclarations;
    var i;

    var len = ds.length;
    for (i = 0; i < len; i++) {

      var fn = new Value(ds[i].id.name,bot);
      var fo = new FunctionObject(ds[i].params, ds[i].body, env);

      fo.Name   = ds[i].id.name;
      fo.Source = ds[i];

      var funcAlreadyDeclared = env.HasBinding(fn);
      if (!funcAlreadyDeclared.value) {
        env.CreateMutableBinding(fn,configurableBinding);
      }
      
      env.SetMutableBinding(fn, new Value(fo,pc));
    }
  }

  // ------------------------------------------------------------
  // Variable hoisting, part of 10.5

  function HoistVariables(env, script, configurableBindings, pc) {

    if (!script.variableDeclarations) {

      script.variableDeclarations = [];

      var visitor = {};
      visitor.leave = function() {};
      visitor.enter = function(node) {
  
        // Do not hoist inside functions
        if (node.type === 'FunctionDeclaration' ||
            node.type === 'FunctionExpression') {
          this.skip();
        }
  
        if (node.type === 'VariableDeclaration') {
          for (var i = 0, len = node.declarations.length; i < len; i++) {
            var declarator = node.declarations[i];
            var pattern    = declarator.id;
            script.variableDeclarations.push(pattern);
          }
        }
      };

      estraverse.traverse(script, visitor);
    }

    var ds = script.variableDeclarations;
    var i;

    var len = ds.length;
    for (i = 0; i < len; i++) {

      if (ds[i].type !== 'Identifier') {
              monitor.fatal('Patters is variable declarations not supported');
      }
      // declarations are indentifiers, not general patterns
      var dn = new Value(ds[i].name,bot);
    
      var varAlreadyDeclared = env.HasBinding(dn);
      if (!varAlreadyDeclared.value) {
        env.CreateMutableBinding(dn,configurableBindings);
        env.SetMutableBinding(dn,new Value(undefined,pc));
      }
    }
  }

  // ------------------------------------------------------------
  // Create Arguments Object, 10.6

  function CreateArgumentsObject(env, F, args) {
    return new Value(
      new ArgumentsObject(F, args),
      bot
    );
    
    /*
    var obj = new Ecma();
    obj.Class = 'Arguments';

    obj.Prototype = new Value(monitor.instances.ObjectPrototype,bot);

    args = args || []; 

    for (var i = 0, len = args.length; i < len; i++) {
      obj.Put(new Value(i, bot), args[i]);
    }


    var argNames = F.FormalParameters;

    for (var i = 0, len = argNames.length; i < len; i++) {
      var id = argNames[i];

      if (id.type !== 'Identifier') {
        monitor.fatal(id.type + ' is not supported in CreateArgumentsObject');
      } 

      if (args[i]) {
        obj.Put(new Value(id.name, bot), args[i]);
      }
    }

    obj.Put(new Value('length', bot), new Value(args.length, bot));
    obj.Put(new Value('callee', bot), new Value(F, bot));

    return new Value(obj, bot);
    */
  }

  // ------------------------------------------------------------
  // Bind Arguments, 
  function BindArguments(env,names,args) {
    if (args == undefined) return;

    var argCount  = args.length;
    var nameCount = names.length;

    monitor.context.pushPC(bot);
    for (var n = 0; n < nameCount; n++) {
      var v;
      if (n >= argCount)
        v = new Value(undefined,bot);
      else 
        v = args[n];

      var id = names[n];
      if (id.type !== 'Identifier') {
        monitor.fatal(id.type + ' is not supported in BindArguments');
      }

      var argName = new Value(id.name,bot);
      var argAlreadyDeclared = env.HasBinding(argName);

      monitor.context.raisePC(argAlreadyDeclared.label);
      if (!argAlreadyDeclared.value) {
        env.CreateMutableBinding(argName);
      }

      env.SetMutableBinding(argName,v);
    }
    monitor.context.popPC();
  }

  // ------------------------------------------------------------
  function ArgumentsObject(F, args) {
    Ecma.call(this); 
  
    this.Prototype = new Value(monitor.instances.ObjectPrototype, bot);
    this.Class = 'Arguments';
    this.Extensible = true;

    var formalParams = F.FormalParameters;
    var args = args || [];

    for(i = 0; i < args.length; i++) {
      this.Put(new Value(i, bot), args[i]);
    }

    for(i = 0; i < formalParams.length; i++) {
      var id = formalParams[i];

      if(id.type !== 'Identifier') {
        monitor.fatal(id.type + ' is not supported in ArgumentsObject');
      }

      if(args[i]) {
        this.Put(new Value(id.name, bot), args[i]);
      }
    }

    this.Put(new Value('length', bot), new Value(args.length, bot));
    this.Put(new Value('callee', bot), new Value(F, bot));
  }

  prelude.inherits(ArgumentsObject, Ecma);

  ArgumentsObject.prototype.toNative = function() {
    var clone = {},
        lbl = bot;

    for (x in this.properties) {
      if (this.properties.hasOwnProperty(x)) {
        lbl.lub(this.labels[x].existence, this.labels[x].value);

        var v = this.properties[x];
        var t = typeof v;
        if (t !== 'object' || t !== 'function') {
          clone[x] = v;
        } else {
          // TODO: replace with getter
          clone[x] = null;
        }
      }
    }
    
    return new Value(clone, lbl);
  };

  ArgumentsObject.prototype.fromNative = function() {
    // TODO
  };

  return module;
};
