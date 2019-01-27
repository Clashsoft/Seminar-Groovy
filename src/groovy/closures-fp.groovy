def doubler = { it * 2 }, adder = { a, b -> a + b }
assert doubler(2) == 4 && adder(1, 2) == 3
assert [3, 1, 5].collect(doubler) == [6, 2, 10] && [1, 5, 7, 3].inject(0, adder) == 16
assert (1..7).findAll { it % 2 == 0 } == [2, 4, 6]
