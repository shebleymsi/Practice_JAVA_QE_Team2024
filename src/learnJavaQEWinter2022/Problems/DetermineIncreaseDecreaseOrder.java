package learnJavaQEWinter2022.Problems;

import java.util.Scanner;

public class DetermineIncreaseDecreaseOrder {


    public DetermineIncreaseDecreaseOrder() {
    }

    public static void main(String[] args) {
        findOutIncreaseDecreaseOrder();
    }

    public static void findOutIncreaseDecreaseOrder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing Order");
        } else {
            System.out.println("nether Increasing or Decrease order");
        }

    }
}
