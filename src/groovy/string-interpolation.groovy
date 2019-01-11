#!/usr/bin/env groovy
def a = 1, b = 2
assert "$a+$b=${a+b}" == '1+2=3'
def g = "${ -> a++ }"
assert g == '1' && g == '2' && g == '3'
a = 10
assert g == '10'
