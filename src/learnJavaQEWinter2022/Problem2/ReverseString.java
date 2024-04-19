package learnJavaQEWinter2022.Problem2;

public class ReverseString {

    public ReverseString() {
    }

    public static void main(String[] args) {
        String name = "James";
        reverseString("We are learning reverse string");
    }

    public static void reverseString(String name) {
        String reverse = "";

        for(int i = 0; i <= name.length() - 1; ++i) {
            char var10000 = name.charAt(i);
            reverse = "" + var10000 + reverse;
        }

        System.out.println(reverse);
    }

    public static void reverseString1(String name) {
        String reverse = "";

        for(int i = name.length() - 1; i >= 0; --i) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println(reverse);
    }
}
