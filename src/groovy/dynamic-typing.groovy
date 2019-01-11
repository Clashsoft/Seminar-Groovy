#!/usr/bin/env groovy
class Duck { void quack() { println "quack" }}

def duck = new Duck(); duck.quack()
duck = [quack: { println "I'm not a duck"}] as Duck
assert duck instanceof Duck; duck.quack()
duck = "I'm a string"; duck.quack()
