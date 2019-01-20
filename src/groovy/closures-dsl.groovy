#!/usr/bin/env groovy
def eval(Closure c) {
	def result = 0
	c.delegate = new Object() { void add(v) { result += v }
	                            void mul(v) { result *= v } }
	c(); println(result)
}
eval { add 3; mul 4; add(-1); mul 0.5 }
