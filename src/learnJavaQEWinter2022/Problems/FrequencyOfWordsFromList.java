package learnJavaQEWinter2022.Problems;

import java.io.PrintStream;
import java.util.*;

public class FrequencyOfWordsFromList {

    public FrequencyOfWordsFromList() {
    }

    public static void getFrequencyOfWords(List<String> strings) {
        HashMap<String, Integer> map = new HashMap();

        for(int i = 0; i < strings.size(); ++i) {
            Integer count = (Integer)map.get(strings.get(i));
            if (map.get(strings.get(i)) == null) {
                map.put((String)strings.get(i), 1);
            } else {
                map.put((String)strings.get(i), count + 1);
            }
        }

        Iterator var4 = map.entrySet().iterator();

        while(var4.hasNext()) {
            Map.Entry mp = (Map.Entry)var4.next();
            PrintStream var10000 = System.out;
            Object var10001 = mp.getKey();
            var10000.println("Frequency of " + var10001 + " : " + mp.getValue());
        }

    }

    public static void getFrequencyOfWords1(List<String> strings) {
        TreeMap<String, Integer> map = new TreeMap();

        for(int i = 0; i < strings.size(); ++i) {
            Integer count = (Integer)map.get(strings.get(i));
            if (map.get(strings.get(i)) == null) {
                map.put((String)strings.get(i), 1);
            } else {
                map.put((String)strings.get(i), count + 1);
            }
        }

        Iterator var4 = map.entrySet().iterator();

        while(var4.hasNext()) {
            Map.Entry mp = (Map.Entry)var4.next();
            PrintStream var10000 = System.out;
            Object var10001 = mp.getKey();
            var10000.println("Frequency of " + var10001 + " : " + mp.getValue());
        }

    }
}
