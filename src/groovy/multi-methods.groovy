#!/usr/bin/env groovy
String take(Object o) { return "Object" }
String take(String s) { return "String" }

Object arg = "I'm a String"
assert take(arg) == "String"
