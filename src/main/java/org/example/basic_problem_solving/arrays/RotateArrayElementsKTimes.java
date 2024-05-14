package org.example.basic_problem_solving.arrays;

import java.util.Arrays;

public class RotateArrayElementsKTimes {

    // statement:
    // Rotate elements in an array of N size to K times

    // algo:
    // Create an empty array to reposition the elements
    // Iterate over array and pick the element
    // Find the new index of element [(i%N) + K]
    // [(i%N) + K] > N ? [(i%N) + K] - N
    // SC -> O(N)

    private static int[] rotate(int[] arr, int K) {
        int[] ar = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int index = (i + K) % arr.length;
            ar[index] = arr[i];
        }
        return ar;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println();
        Arrays.stream(rotate(arr, 6)).forEach(el -> System.out.print(el + " "));
        System.out.println();
        /*Arrays.stream(rotate(arr, 2)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(rotate(arr, 3)).forEach(System.out::print);
        System.out.println();
        Arrays.stream(rotate(arr, 4)).forEach(System.out::print);
        System.out.println();*/

    }

}
