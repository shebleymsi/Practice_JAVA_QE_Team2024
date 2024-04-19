package learnJavaQEWinter2022.Problems;

public class FindOutGreatestNumber {


    public FindOutGreatestNumber() {
    }

    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 78;
        int num3 = 87;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("" + num1 + " is the largest number");
        }

        if (num2 >= num1 && num1 >= num3) {
            System.out.println("" + num2 + " is the largest number");
        } else {
            System.out.println("" + num3 + " is the largest number");
        }

    }
}


