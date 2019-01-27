       class Greeter {
	private String name

	       String getName() {
		return name
	}

	       void setName(String name) {
		this.name = name
	}

	       String greeting(String name) {
		return "Hello " + name + ", I am " + this.name + "!"
	}
}

Greeter greeter = new Greeter()
greeter.setName "Groovy"

System.out.println greeter.greeting("World")
