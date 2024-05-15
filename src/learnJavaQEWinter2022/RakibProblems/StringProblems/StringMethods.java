package learnJavaQEWinter2022.RakibProblems.StringProblems;


import java.util.Arrays;

public class StringMethods {


    public static void printMessage(String message) {

        System.out.println(message);

        // 1. length of the string
        System.out.println("Length of the string: " + message.length());

        // 2. toUpperCase() method
        System.out.println("String in uppercase: " + message.toUpperCase());

        // 3. toLowerCase() method
        System.out.println("String in lowercase: " + message.toLowerCase());

        // 4. charAt() method
        System.out.println("Character at index 4: " + message.charAt(4));

        // 5. indexOf() method
        System.out.println("Index of 'o': " + message.indexOf('o'));

        // 6. lastIndexOf() method
        System.out.println("Last index of 'o': " + message.lastIndexOf('o'));

        // 7. substring() method
        System.out.println("Substring from index 2 to 7: " + message.substring(2, 7));

        // 8. replace() method
        System.out.println("Replace 'World' with 'Java': " + message.replace("World", "Java"));

        // 9. trim() method
        String str2 = "   Hello World!   ";
        System.out.println("String after trimming: " + str2.trim());

        // 10. split() method
        String str3 = "Hello,World,Java";
        String[] strArray = str3.split(",");

        System.out.println("Splitting the string by comma: ");

        for (String s : strArray) {
            System.out.println(s);
        }
        //printMessage(str3); by Arrays.toString method
        System.out.println("print by toString method: " + Arrays.toString(strArray));


        // 11. startsWith() method
        System.out.println("String starts with 'Hello': " + message.startsWith("Hello"));

        // 12. endsWith() method
        System.out.println("String ends with 'World!': " + message.endsWith("World!"));

        // 13. contains() method
        System.out.println("String contains 'World': " + message.contains("World"));

        // 14. equals() method
        String str4 = "Hello World!";
        System.out.println("String equals 'Hello World!': " + message.equals(str4));

        // 15. equalsIgnoreCase() method
        String str5 = "hello world!";
        System.out.println("String equals ignore case 'hello world!': " + message.equalsIgnoreCase(str5));

        // 16. isEmpty() method
        System.out.println("String is empty: " + message.isEmpty());

        // 17. concat() method
        System.out.println("Concatenation of two strings 'Hello' and 'World!': " + message.concat(" World!"));

    }


    public static void main(String[] args) {
        String str = "Hello World!";
        printMessage(str);
    }

}

