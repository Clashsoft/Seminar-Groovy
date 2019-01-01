public class Main {
	class Animal             { void speak() { System.out.print("??? ");  }}
	class Dog extends Animal { void speak() { System.out.print("woof "); }}

	void take(Animal a) { System.out.print("Animal "); }
	void take(Dog    d) { System.out.print("Dog ");    }

	public static void main(String[] args) {
		Dog d = new Dog(); Animal a = d;
		a.speak(); d.speak();
		take(d); take(a);
	}
}
