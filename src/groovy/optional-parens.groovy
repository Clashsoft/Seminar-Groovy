#!/usr/bin/env groovy
def make(what) {
	[ with: { Object... e ->
		[ and: { other ->
			println("my $what contains ${ e.join(', ') } and $other")
		} ]
	} ]
}
def cake = 'cake', sugar = 'sugar', eggs = 'eggs', flour = 'flour'
make cake with sugar, eggs and flour
make(cake).with(sugar, eggs).and(flour)
