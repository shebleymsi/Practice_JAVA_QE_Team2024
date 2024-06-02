package learnJavaQEWinter2022.RakibProblems;

import java.util.Arrays;

// write a method for addition



public class Practice {

        public static void main(String[] args) {

            int[] array = {4, 4, 2, 5, 7, 1};
            System.out.println("Original array: " + Arrays.toString(array));

            int min = findMin(array);
            System.out.println("Minimum number: " + min);

            int max = findMax(array);
            System.out.println("Maximum number: " + max);

            linearSort(array, min, max);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }

        public static int findMin(int[] array) {


            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min; //Return the Minimum:
        }

        public static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static void linearSort(int[] array, int min, int max) {
            int range = max - min + 1;
            int[] count = new int[range];
            int[] output = new int[array.length]; //Source array

            //int[] array = {4, 4, 2, 5, 7, 1};
            // Count occurrences of each element
            for (int i = 0; i < array.length; i++) {
                count[array[i] - min]++;
                System.out.println(count[array[i] - min]);

                // show me the iteration



            }

           // Place elements in correct position in output array
            int index = 0;
            for (int i = 0; i < range; i++) {
                for (int j = 0; j < count[i]; j++) {
                    output[index++] = i + min;
                }
            }

            /*System.out.println("===============");
            System.out.println(Arrays.toString(count));
            System.out.println(Arrays.toString(output)); */

            System.arraycopy(output, 0, array, 0, array.length);

        }
    }
