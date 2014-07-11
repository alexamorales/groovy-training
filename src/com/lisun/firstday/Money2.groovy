package com.lisun.firstday

import groovy.transform.ToString

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 15:58
 */
@ToString
class Money2 implements Comparable<Money2>{
    BigDecimal amount;

    Money2(BigDecimal amount) {
        this.amount = amount
    }

     Money2 next() {
       new Money2(++amount)
    }

    Money2 previous() {
        new Money2(--amount)
    }

    @Override
    int compareTo(Money2 o) {
        return this.amount.compareTo(o.amount)
    }
}
