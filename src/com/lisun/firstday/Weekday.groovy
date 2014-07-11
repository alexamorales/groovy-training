package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 16:13
 */
    class Weekday implements Comparable<Weekday> {

        static final DAYS = [
                'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'
        ]

        private int index = 0

        Weekday(String day) {

            index = DAYS.indexOf(day)
        }

        Weekday next() {
            new Weekday(DAYS[(index + 1) % DAYS.size()])
        }

        Weekday previous() {
            return new Weekday(DAYS[index - 1])
        }

        int compareTo(Weekday other) {
            return this.index <=> other.index
        }

        String toString() {
            return DAYS[index]
        }
    }
