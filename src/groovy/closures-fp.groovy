#!/usr/bin/env groovy
def list = [1, 2, 3, 4, 5, 6]
assert list.collect { it * 2 } == [2, 4, 6, 8, 10, 12]
assert list.findAll { it % 2 == 0 } == [2, 4, 6]
assert list.inject(0) { a, b -> a + b } == 21
