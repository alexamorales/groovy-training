package com.lisun.firstday

import groovy.json.JsonSlurper
import groovy.transform.ToString

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 13:00
 */
@ToString
class Money {

    String currency
    BigDecimal amount

    void plus(def money) {
        if (this.currency == money.currency) {
            amount += money.amount
        }

        def rate = new JsonSlurper().parse(new URL("http://rate-exchange.appspot.com/currency?from=${money.currency}&to=${this.currency}")).rate
        amount += rate * money.amount;
    }

    void plus(int money) {
        amount += money
    }

}

