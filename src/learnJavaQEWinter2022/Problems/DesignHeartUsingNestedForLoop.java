package learnJavaQEWinter2022.Problems;

public class DesignHeartUsingNestedForLoop {



    public DesignHeartUsingNestedForLoop() {
    }

    public static void main(String[] args) {
        heart();
    }

    public static void heart() {
        int i;
        int j;
        for(i = 1; i <= 2; ++i) {
            for(j = 1; j <= 2 - i; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i; ++j) {
                System.out.print("*");
            }

            for(j = 1; j <= 2 * (2 - i + 1) - 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = 1; i <= 5; ++i) {
            for(j = 1; j <= i - 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * (5 - i + 1) - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
