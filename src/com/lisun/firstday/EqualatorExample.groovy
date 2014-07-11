package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:54
 */

def persons = [new Person(name: "Alex", age: 15), new Person(name: "Grisha", age: 5), new Person(name: "Grisha", age: 25)]

def person = new Person(name: "Alex", age: 15)

def count = new EqualatorUtils().equlatorUsage(persons,person, {a,b -> a})