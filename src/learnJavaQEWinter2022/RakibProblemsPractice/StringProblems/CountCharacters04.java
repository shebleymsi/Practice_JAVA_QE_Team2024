package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems;

public class CountCharacters04 {

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("The number of characters in the string is: " + countCharacters(str));
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}
