package com.groovy.firstday


/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 10:35
 */

@Grab('commons-lang:commons-lang:2.4')
import org.apache.commons.lang.ClassUtils


println "FirstDay.Hello Groovy"

def person = new Person(name: 'Artem')

println "person = $person"



class Outer {
    class Inner {}
}

assert !ClassUtils.isInnerClass(Outer)
assert ClassUtils.isInnerClass(Outer.Inner)

def list = ['', 'One']
list[20] = ['XX']
println "list = $list"

/----------------------------------------------------------------------/

def http = [
        100: 'CONTINUE',
        200: 'OK'
]

assert http[200] == 'OK'


/------------------------------------------------------------------------/

def nameAndAge() {[name: 'John', age: new Random().nextInt(100)]}

Person p = nameAndAge() as Person
println p

List persons = []

(0..25).each { k -> persons[k] = nameAndAge();}
println(persons)

persons.each { pers -> pers.age += 10 }

println "persons = $persons"

/-----------------------------------------------------------------------------/


def person1 = new Person(name: "Alex", age: 0)
def person2 = new Person(name: "Alex", age: 7)
println person1 == person2


//List employeeList = []

//employeeList.each {employee -> new FirstDay.Employee(age: new Random().nextInt(90), salary: 1000)}

//println(employeeList)

Bonus bonus = new Bonus(amount: 500, age: 20)

Employee employee = new Employee(name: 'Alex', age: 26, salary: 1000)

employee + bonus

println(employee)

/---------------------------------------------------------/

def hryvna = new Money(amount: 4, currency: "UAH")
def dollars = new Money(amount: 10, currency: "USD")

dollars + hryvna
println(dollars)

