def make(what) { [ with: { Object... contents -> [ and: { last ->
	println("my $what contains ${ contents.join(', ') } and $last")
} ] } ] }
def cake = 'cake', sugar = 'sugar', eggs = 'eggs', flour = 'flour'
make cake with sugar, eggs and flour
make(cake).with(sugar, eggs).and(flour)
