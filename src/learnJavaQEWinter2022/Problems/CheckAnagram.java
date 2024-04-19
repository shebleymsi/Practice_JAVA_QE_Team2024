package learnJavaQEWinter2022.Problems;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        isAnagram("ARMY", "MARYY");
    }

    public static void isAnagram(String st, String dt) {
        boolean status = true;
        if (st.length() != dt.length()) {
            status = false;
        } else {
            char[] arraySt = st.toLowerCase().toCharArray();
            char[] arrayDt = dt.toLowerCase().toCharArray();
            java.util.Arrays.sort(arraySt);
            java.util.Arrays.sort(arrayDt);
            status = java.util.Arrays.equals(arraySt, arrayDt);
        }

        if (status) {
            System.out.println(st + " and " + dt + " are Anagram");
        } else {
            System.out.println(st + " and " + dt + " are not Anagram");
        }

    }

    public static boolean isAnagram1(String st, String dt) {
        boolean status = true;
        if (st.length() != dt.length()) {
            status = false;
        } else {
            char[] arraySt = st.toLowerCase().toCharArray();
            char[] arrayDt = dt.toLowerCase().toCharArray();
            java.util.Arrays.sort(arraySt);
            java.util.Arrays.sort(arrayDt);
            status = Arrays.equals(arraySt, arrayDt);
        }

        if (status) {
            System.out.println(st + " and " + dt + " are Anagram");
        } else {
            System.out.println(st + " and " + dt + " are not Anagram");
        }

        System.out.println(status);
        return status;
    }
}
