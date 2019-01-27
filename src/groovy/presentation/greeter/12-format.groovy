class Greeter {
	String name

	String greeting(String name) {
		"Hello $name, I am ${ this.name }!"
	}
}

def greeter = new Greeter(name: "Groovy")

println greeter.greeting("World")

// ==> Hello World, I am Groovy!
