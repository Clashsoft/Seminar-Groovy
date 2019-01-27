def adder = { a, b -> a + b } // Closure
assert adder(1, 2) == 3
assert adder('a', 'b') == 'ab'

def doubler = { it * 2 }
assert doubler(3) == 6

def list = [ 1, 2, 3, 4, 5, 6 ]
assert list.collect(doubler) == [ 2, 4, 6, 8, 10, 12 ]
assert list.findAll { it % 2 == 0 } == [ 2, 4, 6 ]
assert list.collect { it ** 2 }.inject(0, adder) == 91
