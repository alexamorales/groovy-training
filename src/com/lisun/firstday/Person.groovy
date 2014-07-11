package com.lisun.firstday

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 10:50
 */
@EqualsAndHashCode
@ToString
class Person {
    String name
    int age

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Person person = (Person) o
        if (age != person.age) false
        if (name != person.name) false

        return true
    }

    int hashCode() {
        def result = (name != null ? name.hashCode() : 0)
        result = 31 * result + age
        result
    }

    def asBoolean(){
        if (this.age > 120) {
            print("FirstDay.Person $name dead!")
        }
    }
}
