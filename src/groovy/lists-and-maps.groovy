#!/usr/bin/env groovy
def l = [1, 2, 3]
assert l instanceof ArrayList
assert l[0] == 1 && l[-1] == 3
l << 4
assert l[0, 2] == [1, 3] && l[1..3] == [2, 3, 4]

def m = [a: 1, b: 2]
assert m instanceof LinkedHashMap
assert m['a'] == 1 && m.b == 2
m['c'] = 3; m.d = 4
assert m['foobar'] == null && m.unknown == null
