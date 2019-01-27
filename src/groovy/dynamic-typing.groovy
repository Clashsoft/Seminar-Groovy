class Duck { void quack() { println "I'm a duck" } }
class Frog { void quack() { println "I'm a frog" } }
void speak(Object o) { o.quack() }
void speak(String s) { println s + " can't talk" }
for (def o in [ new Duck(), new Frog(), "A String" ]) { quack(o) }
