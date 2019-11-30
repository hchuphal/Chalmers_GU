/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

var fs   = require('fs');
var vm   = require('vm');
var tty  = require('tty');
var http = require('http');
var readline = require('readline');

var Monitor = require('./monitor').Monitor;

var interactive = false;
var test        = false;
var tasks = [];

// ------------------------------------------------------------ 
// 1. process command line arguments

processArguments();

// ------------------------------------------------------------ 
// 2. initialize monitor

var global = (function() { return this;})();
var monitor = new Monitor(global);

if (test) {
  // setup monitor test mode
}

// ------------------------------------------------------------ 
// 3. evaluate all files and given code

function handle(result) {
  if (result.type === 'throw') {
    if (monitor.offendingTrace) {
      console.log(String(monitor.offendingTrace));
    }

    console.log(String(result.value));
  }
}

try {
  for (var i = 0; i < tasks.length; i++) {
    if ('file' in tasks[i]) {
      var script = fs.readFileSync(tasks[i].file);
      var result = monitor.execute(script,tasks[i].file);
      handle(result);
    }

    if ('exec' in tasks[i]) {
      var result = monitor.execute(tasks[i].exec,'execute');
      handle(result);
    }
  }
} catch (e) {
  console.log(e.message);
  //console.log(e.stack);
  console.log('\n\nmonitor stack trace:');
  console.log(monitor.stackTrace().toString());
}

// ------------------------------------------------------------ 
// 4. if interactive, initialize an interactive session

function report(result) {
  var value = result.value === null ? undefined : result.value;
  console.log(String(value));
}

function dreport(result) {
  var resstr = JSON.stringify(result);
  resstr.replace('\n',' ');
  console.log('completion record: ' + resstr);
  monitor.printWorkList();
}

if (interactive) {
  console.log('jsflow 1.1.0, :? for help');
  var rl = readline.createInterface({
    input  : process.stdin,
    output : process.stdout
  });
  rl.setPrompt('jsflow>',7);
  rl.prompt();
  rl.on('line', function(_line) {
    var line = _line.trim();
    var result; 

    if (line === '') {
      if (monitor.debug.active && monitor.running()) {
        dreport(monitor.step());
      }
      rl.prompt();
      return;
    }

    if (line[0] === ':') {

      switch (line) {

      case ':debug':
        monitor.debug.active = true;
        console.log('stepping active');
      break;
      
      case ':step': 
        if (monitor.running()) {
          dreport(monitor.step());
        }
      break;

      case ':continue': 
        if (monitor.running()) {
          report(monitor.resume());
        }
      break;

      case ':wl': 
        monitor.printWorkList();
      break;
      
      }

    } else {
      report(monitor.execute(line,'console'));
    }

    rl.prompt();
  });
  rl.on('close', function() {
    process.exit(0);
  });
}

// ------------------------------------------------------------ 

function usage() {
  console.log('jsflow [-h] [-i] [<filenames>] [-e] <code>');
  console.log(' -i enter interactive mode');
  console.log(' -h show help');
  console.log(' -e execute script');

  process.exit(1);
}

// ------------------------------------------------------------ 
// process command line arguments
// redo using optimist

function processArguments() {

  var argv = process.argv;

  for (var i = 2; i < argv.length; i++) {
    
    switch (argv[i]) {

      case '-i' :
      case '--interactive' :
        interactive = true;
      break;

      case '-e' :
        if (argv[i+1] !== undefined &&
            argv[i+1][0] !== '-') {
          tasks.push({ 'exec' : argv[i+1] });
          i++;
        } else {
          usage();
        }
      break;

      case '-t' :
      case '--test' :
        test = true;
      break;

      default : 
        if (argv[i][0] !== '-') {
          tasks.push({'file' : argv[i]})
        }
      break;
    }
  }

  if (tasks.length === 0) interactive = true;
}

