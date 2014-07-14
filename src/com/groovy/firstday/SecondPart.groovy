package com.groovy.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 14:55
 */

def greeting = 'FirstDay.Hello'
greeting <<= ' Groovy'
greeting << '!'
greeting[1..4] = 'i'

println "greeting = $greeting"

/----------------------------------------/

String str = "The rain in Spain stays mainly in the plain!"
String wordEnding = /\w*ain/
def rhyme = "/\b$wordEnding\b/"
def found = ''
str.eachMatch(rhyme) { match -> found += match + ' ' } // == (str =~ rhyme).each{match -> found += match + ' '}

println(str)



/------------------------------------/

def age = 36
switch (age) {
    case 16 ..20 : insurancRate = 0.05; break
    default: throw new IllegalArgumentException()
}

/-------------------------------------/







