public class Greeter {
	private String name

	public String getName() {
		return name
	}

	public void setName(String name) {
		this.name = name
	}

	public String greeting(String name) {
		return "Hello " + name + ", I am " + this.name + "!"
	}
}

Greeter greeter = new Greeter()
greeter.setName "Groovy"

System.out.println greeter.greeting("World")
