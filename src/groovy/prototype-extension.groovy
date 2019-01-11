#!/usr/bin/env groovy
0.metaClass.factorial = { 1 }
Number.metaClass.factorial = { delegate * (delegate - 1).factorial() }
assert 0.factorial() == 1 && 5.factorial() == 120
