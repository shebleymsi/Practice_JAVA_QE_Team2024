package learnJavaQEWinter2022.Problems;

public class CheckEvenOrOddNumber {

    public CheckEvenOrOddNumber() {
    }

    public static void main(String[] args) {
        checkEvenOrOdd(34);
        getTheSumOfNumbers(20);
    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("" + number + " Is an Even Number");
        } else {
            System.out.println("" + number + " Is an Odd Number");
        }

    }

    public static void getTheSumOfNumbers(int number) {
        int total = 0;

        for(int i = 0; i <= number; ++i) {
            total += i;
        }

        System.out.println(total);
    }
}
