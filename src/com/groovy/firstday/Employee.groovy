package com.groovy.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 12:34
 */
class Employee extends Person {
    int age
    BigDecimal salary;

    void plus(def bonus) {
        if (age > bonus.age) {
           salary+= bonus.amount
        }
    }
}
