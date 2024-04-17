package learnJavaQEWinter2022.practiceMathPoblem.stringProblem;

import java.util.Scanner;

public class LearnCharAt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the sentence: ");
        String letterOff = scanner.nextLine();

        getCharacter(letterOff);
        scanner.close();

    }

    public static String getCharacter(String letterOf) {

        // String str = "I love NewYork";

        String letter = String.valueOf(letterOf.charAt(0));
        System.out.println("nth position is: " + letter);
        return letter;

    }

}
