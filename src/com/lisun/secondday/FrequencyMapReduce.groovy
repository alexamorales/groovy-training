package com.lisun.secondday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:37
 */

def textCorpus =
        """
Am
А куда сегодня еду я?
Dm
А чтоб найти сегодня тебя.
C
А со мной едет лучший друг,
E
Hам хочется найти подруг.

А на улице тепло,
А едем мы уже давно,
А где найти девчонок нам,
Двум весёлым пацанам?

Dm G Am
Hу где же вы, девчонки, девчонки, девчонки,
Dm G Am
Короткие юбчонки, юбчонки, юбчонки ?

А, как обидно пацанам.
А, что же, что же делать нам?
А, где девчонок отыскать,
А, чтобы их очаровать?

"Эй!" - вслед девчонкам я кричу, -
"Эй, садись, девчонки, прокачу!" -
Hо не заметят нас они,
И опять в машине мы одни.

Hу где же вы, девчонки, девчонки, девчонки,
Короткие юбчонки, юбчонки, юбчонки ?

А на улице темно,
А люди уже спят давно,
А только мы одни не спим,
Ай, познакомится хотим.

А нет девчонок - вот беда.
А нам уже домой пора,
Hо завтра вечером опять
Будем мы любовь искать.

Hу где же вы, девчонки, девчонки, девчонки,
Короткие юбчонки, юбчонки, юбчонки ?
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




