#!/usr/bin/env groovy
class Duck { void quack() { println "I'm a duck" } }
class Frog { void quack() { println "I'm a frog" } }
def duck = new Duck(); duck.quack()
    duck = new Frog(); duck.quack()
    duck = "a string"; duck.quack()
