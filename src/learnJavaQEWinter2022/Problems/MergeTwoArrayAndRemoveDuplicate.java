package learnJavaQEWinter2022.Problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAndRemoveDuplicate {

    public MergeTwoArrayAndRemoveDuplicate() {
    }

    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 3, 4, 6};
        int[] arrayB = new int[]{3, 9, 4, 6, 55, 99};
        System.out.println(Arrays.toString(mergeTwoArrayAndRemoveDuplicate(arrayA, arrayB)));
    }

    @Test
    public void testMergeTwoArrayAndRemoveDuplicate() {
        int[] arrayA = new int[]{1, 3, 4, 6};
        int[] arrayB = new int[]{3, 9, 4, 6, 55, 99};
        System.out.println(Arrays.toString(mergeTwoArrayAndRemoveDuplicate(arrayA, arrayB)));
    }

    public static int[] mergeTwoArrayAndRemoveDuplicate(int[] arA, int[] arB) {
        IntStream number = IntStream.concat(IntStream.of(arA), IntStream.of(arB));
        int[] remove = number.distinct().sorted().toArray();
        return remove;
    }
}


