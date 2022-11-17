package DZ_5;

import java.util.HashMap;
import java.util.Map;


public class CountCommonWordsWithOneOccurrence {
       public static int countWords(String[] words1, String[] words2) {
        int countCommonWords = 0;
        if (words1.length > words2.length) return countWords(words2, words1);

        Map<String, Integer> mapa = new HashMap<>();
        for (String str : words1) {
            if (mapa.containsKey(str)) {
                mapa.put(str, mapa.get(str) + 1);
            } else {
                mapa.put(str, 1);
            }
        }

        for (String key : mapa.keySet()) {
            if (mapa.get(key) == 2) {
                mapa.put(key, mapa.get(key) + 1);
            }
        }

        for (String str : words2) {
            if (mapa.containsKey(str)) {
                mapa.put(str, mapa.get(str) + 1);
            }
        }

        for (String key : mapa.keySet()) {
            if (mapa.get(key) == 2) {
                countCommonWords++;
            }
        }
        return countCommonWords;
    }
}
