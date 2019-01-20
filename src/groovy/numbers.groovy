#!/usr/bin/env groovy
assert (0.1 + 0.2 == 0.3) && (1 / 2 == 0.5) && (3 ** 3 == 27)
@groovy.transform.Canonical class MyNum {
	def value
	def plus(MyNum rhs) { return new MyNum(this.value + rhs.value) }
}
assert new MyNum(1) + new MyNum(2) == new MyNum(3)
