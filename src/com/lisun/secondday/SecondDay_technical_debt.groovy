package com.lisun.secondday

import com.lisun.firstday.Person

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 22.05.2014
 * Time: 10:00
 */

ArrayList.metaClass.count {def elemnet, Closure c ->
def counter = 0
    delegate.each {
        if (c(it, elemnet))
        counter++
    }
    counter
}

def alex = new Person(name: "Alex", age: 15)

def jack = new Person(name: 'Jack', age: 35)
List list = [alex, jack, new Person(name: 'Barcuh', age: 36), new Person(name: 'Nikolay', age: 33)]
def count = list.count(jack) { a, b ->

    a.age == b.age
}
println count











