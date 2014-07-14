package com.groovy.secondday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:37
 */

def textCorpus =
        """
Life, it seems, will fade away
Drifting further every day
Getting lost within myself
Nothing matters, no one else

I have lost the will to live
Simply nothing more to give
There is nothing more for me
Need the end to set me free

Things not what they used to be
Missing one inside of me
Deathly lost, this can't be real
Cannot stand this hell I feel

Emptiness is filling me
To the point of agony
Growing darkness taking dawn
I was me, but now he's gone

No one but me can save myself, but it's too late
Now I can't think, think why I should even try
Yesterday seems as though it never existed
Death greets me warm, now I will just say goodbye
"""
List<String> words = textCorpus.tokenize()
Map<String, Integer> wordFrequency = [:]
words.each { String word ->
    wordFrequency[word] = wordFrequency.get(word, 0) + 1
}

wordFrequency.sort({ it.value }).reverseEach { println "it = $it" }

List<String> wordList = wordFrequency.keySet().toList()
wordList.sort { wordFrequency[it] }
String statistic = '\n'
wordList[-1..-4].each { String word ->
    statistic += "${word.padLeft(12)}: "
    statistic += "${wordFrequency[word]}\n"
}
println statistic

def c = { println it }
println c.getParameterTypes()




