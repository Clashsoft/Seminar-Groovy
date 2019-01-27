def list = [ 1, 2, 3 ] // ArrayList
list.add(4)
list << 5

assert list[0] == 1
assert list[-1] == 5
assert list[0, 2, -2] == [ 1, 3, 4 ]
assert list[1..3] == [ 2, 3, 4 ]
assert list[-1..0] == [ 5, 4, 3, 2, 1 ]
