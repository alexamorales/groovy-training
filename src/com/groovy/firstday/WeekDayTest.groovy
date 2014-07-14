package com.groovy.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 16:15
 */

def sun = new Weekday('Вс')
def thu = new Weekday('Чт')
def worklog = ''
for (day in sun..thu) {
    worklog += "Поработал в $day "
}
println worklog
