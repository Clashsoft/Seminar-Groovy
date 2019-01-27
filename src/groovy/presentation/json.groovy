import groovy.json.JsonBuilder

def builder = new JsonBuilder()
builder {
	student {
		name "Alice"
		credits 20
		courses 'Math', 'C++'
	}
}

println builder.toPrettyString()
