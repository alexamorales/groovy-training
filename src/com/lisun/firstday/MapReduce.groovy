package com.lisun.firstday
/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 21.05.2014
 * Time: 17:07
 */
class MapReduce {
    def mapReduce(String text) {
        String[] listArr = text.tokenize()

        List list = listArr.toList();

        def map = [:]


        for (String word : list) {
            Integer count = map.get(word)
            map.put(word, (count == null) ? 1 : count + 1)
        }
    }
}
