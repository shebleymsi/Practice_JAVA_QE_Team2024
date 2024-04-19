package learnJavaQEWinter2022.Problems;

public class DesignPatternUsingForLoop {


    public DesignPatternUsingForLoop() {
    }

    public static void main(String[] args) {
        designTriangle(5);
    }

    public static void designTriangle(int row) {
        for(int i = 0; i < row; ++i) {
            int j;
            for(j = row - i; j > 1; --j) {
                System.out.print(" ");
            }

            for(j = 0; j <= i; ++j) {
                System.out.print("a ");
            }

            System.out.println();
        }

    }

    public static void rightTriangle(int rowNum) {
        for(int i = 1; i <= rowNum; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

    }

    public static void reverseTriangle(int rowNum) {
        for(int i = rowNum; i >= 1; --i) {
            for(int k = i; k >= 1; --k) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
