package org.example.basic_problem_solving.arrays;

import java.util.Arrays;

public class LeftRotateArrayElementKTimes {

    // statement:
    // Given an array of integers A and multiple values in K, which represents the number of times array A needs to be left rotated.
    // Find the rotated array for each value and return the result in the form of a matrix
    // where ith row represents the rotated array for the ith value in K.

    // algo:
    // Iterate over array and for each element
    // find new index using formula:
    // [2N + (i-K)%N]%N

    private static int[] rotate(int[] arr, int K) {
        int[] arr1 = new int[arr.length];
        int N = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int index = (2 * N + (i - K) % N) % N;
            arr1[index] = arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int K = 22;
        Arrays.stream(rotate(arr, K)).forEach(el -> System.out.print(el + " "));
    }

}
