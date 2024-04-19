package learnJavaQEWinter2022.Problems;

public class CheckPermutation {


    public CheckPermutation() {
    }

    public static void main(String[] args) {
        checkOutPermutation("", "ABC");
        System.out.println("****************************************");
        checkOutPermutation("", "DAD");
    }

    public static void checkOutPermutation(String prefix, String st) {
        if (st.length() == 0) {
            System.out.println(prefix);
        }

        for(int i = 0; i < st.length(); ++i) {
            String newWord = prefix + st.charAt(i);
            String var10000 = st.substring(0, i);
            String newAlphabeticWord = var10000 + st.substring(i + 1);
            checkOutPermutation(newWord, newAlphabeticWord);
        }

    }
}


