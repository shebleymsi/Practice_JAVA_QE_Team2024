package learnJavaQEWinter2022.RakibProblemsPractice.StringProblems;


import java.util.Arrays;

public class StringMethods01 {

    public static void main(String[] args) {

        String str = "Hello World!";

        printMessage(str);
        getLength(str);
        getToUpperCase(str);
        getToLowerCase(str);
        getCharAt(str);
        //getCharAtIndexOutOfBound(str);
        getCharAtIndexOutOfBoundExceptionHandle(str);
        getIndexByCharacter(str);
        getIndexByCharacter1(str);
        getIndexByCharacter2(str);

    }


    // 0. print message
    public static void printMessage(String str) {
        System.out.println(str);
    }

    // 1. length of the given string
    public static void getLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    // 2. toUpperCase() method
    public static void getToUpperCase(String str) {
        System.out.println("String in uppercase: " + str.toUpperCase());
    }

    // 2. toLowerCase() method
    public static void getToLowerCase(String str) {
        System.out.println("String in uppercase: " + str.toLowerCase());
    }

    //===================================== charAt() method =====================================================
    //4. charAt() method
    public static void getCharAt(String str) {
        System.out.println("Character at index 6: " + str.charAt(6));
    }

    //4.01. charAt() method --> index out of bound
    public static void getCharAtIndexOutOfBound(String str) {
        System.out.println("Character-at 13 index out of bound : " + str.charAt(12));
    }

    //4.01.01. charAt() method --> index out of bound
    public static void getCharAtIndexOutOfBoundExceptionHandle(String str) {
        try {
            System.out.println("Character-at 13 index out of bound exception handle : " + str.charAt(13));
        } catch (Exception e) {
            System.out.println("Index 13 is out String");
        }
    }

    //=============================================== getIndexByCharacter =============================================

    // 5. indexOf() method
    private static void getIndexByCharacter(String str) {
        System.out.println("Index of 'W': " + str.indexOf('W'));

    }

    // 5.1 indexOf() method use case-insensitive --> toLowerCase() ==> manual approach
    public static void getIndexByCharacter1(String str) {
        System.out.println("Index of 'W': " + str.toLowerCase().indexOf('w'));
    }

    // 5.2 indexOf() method use case-insensitive --> toLowerCase() ==> Dynamic approach whatever case you put
    public static void getIndexByCharacter2(String str) {
        System.out.println("Index of 'W': " + str.toLowerCase().indexOf("w".toLowerCase()));

    }

// ==============================================================================================================








// ==================================================================================


//        // 6. lastIndexOf() method
//        System.out.println("Last index of 'o': " + message.lastIndexOf('o'));
//
//        // 7. substring() method
//        System.out.println("Substring from index 2 to 7: " + message.substring(2, 7));
//
//        // 8. replace() method
//        System.out.println("Replace 'World' with 'Java': " + message.replace("World", "Java"));
//
//        // 9. trim() method
//        String str2 = "   Hello World!   ";
//        System.out.println("String after trimming: " + str2.trim());
//
//        // 10. split() method
//        String str3 = "Hello,World,Java";
//        String[] strArray = str3.split(",");
//
//        System.out.println("Splitting the string by comma: ");
//
//        for (String s : strArray) {
//            System.out.println(s);
//        }
//        //printMessage(str3); by Arrays.toString method
//        System.out.println("print by toString method: " + Arrays.toString(strArray));
//
//
//        // 11. startsWith() method
//        System.out.println("String starts with 'Hello': " + message.startsWith("Hello"));
//
//        // 12. endsWith() method
//        System.out.println("String ends with 'World!': " + message.endsWith("World!"));
//
//        // 13. contains() method
//        System.out.println("String contains 'World': " + message.contains("World"));
//
//        // 14. equals() method
//        String str4 = "Hello World!";
//        System.out.println("String equals 'Hello World!': " + message.equals(str4));
//
//        // 15. equalsIgnoreCase() method
//        String str5 = "hello world!";
//        System.out.println("String equals ignore case 'hello world!': " + message.equalsIgnoreCase(str5));
//
//        // 16. isEmpty() method
//        System.out.println("String is empty: " + message.isEmpty());
//
//        // 17. concat() method
//        System.out.println("Concatenation of two strings 'Hello' and 'World!': " + message.concat(" World!"));


}

