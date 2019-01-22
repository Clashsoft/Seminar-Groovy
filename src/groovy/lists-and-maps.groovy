def list = [1, 2, 3]
assert list instanceof ArrayList && list[0] == 1 && list[-1] == 3
list << 4
assert list[0, 2] == [1, 3] && list[1..3] == [2, 3, 4]

def map = [a: 1, b: 2]
assert map instanceof LinkedHashMap && map['a'] == 1 && map.b == 2
map['c'] = 3; map.d = 4
assert map.c == 3 && map['foobar'] == null && map.unknown == null
