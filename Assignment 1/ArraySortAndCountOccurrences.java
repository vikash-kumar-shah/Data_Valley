//Arrays
// 1)write a java code for sorting an array, and find number of occurrences of a particular number in java.


import java.util.Arrays;

public class ArraySortAndCountOccurrences {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 2, 2, 5, 2, 1};
        int numToCount = 2;

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numToCount) {
                count++;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Number of occurrences of " + numToCount + ": " + count);
    }
}