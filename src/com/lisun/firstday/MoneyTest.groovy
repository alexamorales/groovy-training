package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 15:41
 */


def range = new Money2(10)..new Money2(20)
println range.contains(new Money2(10))


/*
def FirstDay.Money2 = new FirstDay.Money2(100)
switch (FirstDay.Money2) {
    case new FirstDay.Money2(0)..new FirstDay.Money2(70): println "бедный"; break
    case new FirstDay.Money2(71)..new FirstDay.Money2(120): println "норм";break
    case new FirstDay.Money2(121)..new FirstDay.Money2(170): println "богатый";break
}
*/


