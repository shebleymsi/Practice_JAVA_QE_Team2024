package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems;

public class ReplaceCharacters05 {

        public static void main(String[] args) {
            String str = "Hello World!";
            String oldChar = "o";
            String newChar = "a";
            System.out.println("The string after replacing characters is: " + replaceCharacters(str, oldChar, newChar));
        }

        public static String replaceCharacters(String str, String oldChar, String newChar) {
            return str.replace(oldChar, newChar);
        }
}
