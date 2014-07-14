package com.groovy.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:00
 */
class QuickSort {
    def quickSort(list) {
        if (list.size() < 2) return list
        def pivot = list[list.size().intdiv(2)]
        def left = list.findAll { item -> item < pivot }
        def middle = list.findAll { item -> item == pivot }
        def right = list.findAll { item -> item > pivot }
        quickSort(left) + middle + quickSort(right)
    }

}
