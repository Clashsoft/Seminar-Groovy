#!/usr/bin/env groovy
def a = 1, b = 2
assert "$a+$b=${a+b}" == '1+2=3'

def g = "${ -> println 0; a }"
println g
a = 3
println g
