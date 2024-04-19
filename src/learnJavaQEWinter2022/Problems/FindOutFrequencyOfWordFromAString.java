package learnJavaQEWinter2022.Problems;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FindOutFrequencyOfWordFromAString {

    public FindOutFrequencyOfWordFromAString() {
    }

    static void count_freq(String str) {
        Map<String, Integer> mp = new TreeMap();
        String[] arr = str.split("\\s+");

        for(int i = 0; i < arr.length; ++i) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], (Integer)mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        Iterator var5 = mp.entrySet().iterator();

        while(var5.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)var5.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)entry.getKey();
            var10000.println(var10001 + " : " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        String str = "hey sharif hope you are feeling good now and you  will recover   soon";
        count_freq(str);
    }
}


