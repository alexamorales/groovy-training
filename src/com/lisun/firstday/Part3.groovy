package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 16:36
 */


def persons = [new Person(name: "Alex", age: 15), new Person(name: "Grisha", age: 5), new Person(name: "Grisha", age: 25)]
println persons

//persons.sort({a,b -> a.age.compareTo(b.age)})

print persons.sort({ a, b -> a.name <=> (b.name) ?: a.age <=> b.age })






