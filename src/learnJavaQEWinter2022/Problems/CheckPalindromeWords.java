package learnJavaQEWinter2022.Problems;

public class CheckPalindromeWords {

    public CheckPalindromeWords() {
    }

    public static void main(String[] args) {
        checkPalindrome("DAD");
        checkPalindrome("MADAM");
        checkPalindrome("MOM");
        checkPalindrome("HAPPY");
        checkPalindrome("NEW");
    }

    public static void checkPalindrome(String st) {
        boolean status = true;
        char[] word = st.toLowerCase().toCharArray();
        int statingIndex = 0;

        for(int endingIndex = word.length - 1; endingIndex > statingIndex; --endingIndex) {
            if (word[statingIndex] != word[endingIndex]) {
                status = false;
            }

            ++statingIndex;
        }

        System.out.println(st + " is a palindrome word " + status);
    }
}

