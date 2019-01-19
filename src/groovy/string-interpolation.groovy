#!/usr/bin/env groovy
def a = 1, b = 2
assert "$a+$b=${a+b}" == '1+2=3'
def match = '123.456' =~ /(\d+)\.(\d+)/
assert match instanceof java.util.regex.Matcher && match
assert match.group(1) == "123" && match.group(2) == "456"
