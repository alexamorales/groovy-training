package com.lisun.secondday

import com.lisun.firstday.Person

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:56
 */

class Count {
    public int count(List list, def element, Closure c) {
        if(c.getProperties().size()!=2) throw new RuntimeException("must receive 2 parameters in closure")
        def counter=0
        list.each {
            if(c(it,element)){
                counter++;
            }
        }
        counter
    }
}




def jack = new Person(name: 'Jack', age: 35)
List list = [jack, new Person(name: 'Barcuh', age: 36), new Person(name: 'Nikolay', age: 33)]
def count = new SecondDay.Counter().count(list, jack) { a, b ->

    a.age == b.age
}
println count


