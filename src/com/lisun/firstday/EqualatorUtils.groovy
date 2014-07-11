package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:47
 */
class EqualatorUtils {

    def equlatorUsage(List list, def element, Closure equalator) {
        def counter = 0
        list.each {
            c(it, element)(
                    counter++
            )
        }
    }
}
