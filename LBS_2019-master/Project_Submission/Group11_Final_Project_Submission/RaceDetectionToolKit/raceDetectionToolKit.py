##############################################################################################
#
# Description : Python tool to detect race Conditions in programs 
# Input  : Menu based option and takes program as an input
# Output :  Results of the different tools as selected
# Usage : /intucell/bin/latest/python2.7 raceDetectionToolKit.py
# Author : Himanshu
#
##############################################################################################

# -*- coding: utf-8 -*-
# -*- coding: utf-8 -*-
import json
import os
import re
from texttable import Texttable
from collections import OrderedDict
from collections import defaultdict
import subprocess
import sys
from subprocess import call
from bunch import Bunch
from time import sleep

import inspect

class Formats:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'


def ensure_dir(directory):
    if not os.path.exists(directory):
        os.makedirs(directory)

def read_input(msg, convert_func):
    try:
        value = raw_input(msg)
        if convert_func is not None:
            value = convert_func(value)
    except ValueError:
        value = None
    return value

def valid_int(number):
    if number.isdigit():
        return number
    else:
        raise ValueError

def get_input(msg, name, validate_func, convert_func=None):
    value = read_input(msg, convert_func)
    while not validate_func(value):
        print "Invalid {}".format(name)
        value = read_input(msg, convert_func)
    return value


def get_base_app_directories():
    import master
    base = inspect.getfile(master).split("scripts/code_generator")[0]
    directories = {
        'BASE': base,
        'SON_INIT': "{}{}".format(base, "dist/debian-init.sh")
    }
    return directories


def str_to_bool(string):
    if string in ['YES', 'Y']:
        return True
    elif string in ['NO', 'N']:
        return False
    else:
        raise ValueError

def valid_apps(apps):
    if len(apps) == 0:
        return True
    return all(map(lambda x: x in app_names, apps))


def string_to_list_of_strings(string):
    if string == '':
        return []
    return map(lambda s: s.strip(), string.split(','))


def map_strings_to_list_of_strings(strings):
    return "'{}'".format("','".join(strings))

def _banner(message):
    table = Texttable()
    table.set_deco(Texttable.BORDER)
    table.add_rows([[message]])
    return table.draw()

# Main function which takes the input like APP or infra and perform the actions accordingly
def main():
    os.system('clear')
    print
    print
    print _banner((Formats.OKGREEN + '\n    LBS, TDA602_DIT101 - 2019       \n \n RACE DETECTION ToolKit \n').center(50)) + Formats.ENDC
    print
    print
    _main_menu()

def _main_menu():
    print Formats.WARNING + "Welcome : Input options to use this Tool >> " + Formats.ENDC
    print
    print Formats.WARNING + "1. Valgrind (Helgrind) >> " + Formats.ENDC
    print Formats.WARNING + "2. GCC+ThreadSanitiser" + Formats.ENDC
    print Formats.WARNING + "3. RV-Predict/C" + Formats.ENDC
    print Formats.WARNING + "4. RV-Predict/Java" + Formats.ENDC
    print Formats.WARNING + "5. ThreadSafe" + Formats.ENDC
    print Formats.WARNING + "6. Vmlens" + Formats.ENDC
    print Formats.WARNING + "7. Java PathFinder (JPF)" + Formats.ENDC
    print Formats.WARNING + "8. RoadRunner " + Formats.ENDC
    print Formats.WARNING + "9. EXIT " + Formats.ENDC
    print
    print

    _option = get_input(Formats.OKGREEN +"Enter an option to run the tool [ 1-8 ] = "+ Formats.ENDC,
                     "Invalid Option, Check menu options and select a valid choice!!",
                     lambda x: x>0,
                     valid_int)

    print Formats.WARNING + " >> Enterted Choice : {}".format(_option) + Formats.ENDC
    _menu = {
        '1' : _run_valgrind,
        '2' : _run_gcc,
        '3' : _rv_c,
        '4' : _rv_java,
        '5' : _th_safe,
        '7' : _jpf,
        '6' : _vm,
        '8' : _roadrunner,
        '9' : _quit
    }

    _menu[_option]()
    print


def subprocess_cmd(command):
    process = subprocess.Popen(command,stdout=subprocess.PIPE, shell=True)
    proc_stdout = process.communicate()[0].strip()

def _quit():
    exit(1)


def _code_coverage():
    directories = get_base_app_directories()
    if status == 0 :
         print Formats.OKGREEN + 'code coverage created in file reports_npm_code_coverage'+ Formats.ENDC


def _run_simualtor_process():
    # run intest command to enable the simulatoron top of added code
    directories = get_base_app_directories()

def _run_valgrind():
    print
    print
    os.system('echo Helgrind is a Valgrind tool for detecting synchronisation errors in C')
    os.system('C++ and Fortran programs that use the POSIX pthreads threading primitives.Helgrind can detect three classes of errors Misuses of the POSIX pthreads API Potential ')
    os.system('deadlocks and other misbehaviour, and can be difficult to find by other means. Official Documentation  valgrind.org/docs/manual/hg-manual.html')
    os.system('g++ -pthread -o bin/example ../C++/example.cc')
    os.system('valgrind --tool=helgrind bin/example')
    print
    print
    _main_menu()

def _rv_c():
    print
    print
    os.system('echo Rv-Predict is one of Runtime Verifiechoion Company products. Rv-Predict can automatically and efficiently detect concurrency issues of data races in Java and C/C++ software with no false positives. Official Website: https://runtimeverifiechoion.com/predict/ ')
    print
    print
    _main_menu()

def _run_gcc():
    print
    print
    os.system('echo ')
    os.system('g++ -pthread -o bin/example ../C++/example.cc')
    os.system('valgrind --tool=helgrind bin/example')
    print
    print
    _main_menu()

def _rv_java():
    print
    print
    os.system('echo ')
    os.system('echo Rv-Predict is one of Runtime Verifiechoion Company products. Rv-Predict can automatically and efficiently detect concurrency issues of data races in Java and C/C++ software with no false positives. Official Website: https://runtimeverifiechoion.com/predict/ ')
   
    print
    print
    _main_menu()

def _th_safe():
    print
    print
    os.system('echo Inside a folder that has the edited threadsafe-project.properties file: java -jar /home/rayya/threadsafe/threadsafe.jar')
    print
    print
    _main_menu()

def _jpf():
    print
    print
    os.system('cat cd jpf-core ./gradlew buildJars java -jar build/RunJPF.jar src/examples/Racer.jpf')
    print
    print
    _main_menu()
def _vm():
    print
    print
    os.system('cat It is a tool that dynamically traces multithreaded java software to detect race conditions and deadlocks with no false positives. It provides a shortcut or a new way for junit test and it analyzes and fixes all detected bugs inside Eclipse. Junit is a unit testing framework that automatically tests different classes and methods in  java. Official Website: http://vmlens.com/')
    print
    print
    _main_menu()
def _roadrunner():
    print
    print
    os.system('cat ROADRUNNER is a dynamic analysis framework designed to facilitate rapid prototyping and experimentation with dynamic analyses for concurrent Java programs. It provides a clean API for communicating an event stream to back-end analyses, where each event describes some operation of interest performed by the target program, such as accessing memory, synchronizing on a lock, forking a new thread, and so on. This API enables the developer to focus on the essential algorithmic issues of the dynamic analysis, rather than on orthogonal infrastructure complexities.')
    print
    print
    _main_menu()

def _process_input(_vendor, _tech, _input_file, _input_xml, _module_name):
    pass

if __name__ == '__main__':
    main()
