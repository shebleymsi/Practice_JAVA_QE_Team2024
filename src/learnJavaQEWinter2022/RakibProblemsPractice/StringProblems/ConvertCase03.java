package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems;

public class ConvertCase03 {

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("The string after converting to uppercase is: " + convertToUpperCase(str));
        System.out.println("The string after converting to lowercase is: " + convertToLowerCase(str));
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
}
