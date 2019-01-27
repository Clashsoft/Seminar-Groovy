def map = [ a: 1, b: 2 ] // LinkedHashMap
assert map['a'] == 1
assert map.b == 2

map['c'] = 3
map.d = 4

assert map.c == 3
assert map['foobar'] == null
assert map.unknown == null
