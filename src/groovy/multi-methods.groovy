#!/usr/bin/env groovy
String take(Object o) { return "Object" }
String take(String s) { return "String" }

Object o = "o"
assert take(o) == "String"
