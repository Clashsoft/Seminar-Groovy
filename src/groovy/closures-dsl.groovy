def eval(Closure c) {
	def result = 0
	c.delegate.add = { result += it }; c.delegate.mul = { result *= it }
	c(); println(result)
}
eval { add 3; mul 4; add(-1); mul 0.5 }
