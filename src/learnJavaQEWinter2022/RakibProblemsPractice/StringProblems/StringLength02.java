package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems;

// Write a Java program to get the length of a given string.
//write the code by using a method and call it from the main method.

public class StringLength02 {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("The length of the string is: " + getLength(str));
    }

    public static int getLength(String str) {
        return str.length();
    }
}
