package learnJavaQEWinter2022.practiceMathPoblem.stringProblem;
import java.util.Scanner;
public class LearnCharAtChatGPT {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char result = getCharacterAtIndex(input);
            System.out.println("Character at index 0: " + result);

            scanner.close();
        }

        public static char getCharacterAtIndex(String str) {
            return str.charAt(0);
        }
    }


