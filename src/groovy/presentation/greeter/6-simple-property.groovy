       class Greeter {
	        String name









	       String greeting(String name) {
		       "Hello " + name + ", I am " + this.name + "!"
	}
}

Greeter greeter = new Greeter()
greeter.setName "Groovy"

System.out.println greeter.greeting("World")
