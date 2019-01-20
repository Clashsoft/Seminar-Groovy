#!/usr/bin/env groovy
def take(Object o) { return "Object" }
def take(String s) { return "String" }
Object arg = "I'm a String"
assert take(arg) == "String"
