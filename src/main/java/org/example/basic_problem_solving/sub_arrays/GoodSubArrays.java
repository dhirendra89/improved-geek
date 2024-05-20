package org.example.basic_problem_solving.sub_arrays;

public class GoodSubArrays {

    // Problem Description
    // Given an array of integers A, a subarray of an array is said to be good if it fulfills any
    // one of the criteria:
    // 1. Length of the subarray is to be even, and the sum of all the elements of the subarray must
    // be less than B.
    // 2. Length of the subarray is to be odd, and the sum of all the elements of the subarray must
    // be greater than B.
    // Your task is to find the count of good subarrays in A.

    // Problem Constraints
    // 1 <= len(A) <= 5 x 10^3
    // 1 <= A[i] <= 10^3
    // 1 <= B <= 10^7

    // algo:
    // Iterate over array
    // pick each element and for each subarray for this element calc no. of elements and sum
    // check the conditions for even and odd subarray
    // return the good array count if condition satisfies

    private static int find(int[] arr, int B) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 == 0) {
                    if (sum < B) {
                        count++;
                    }
                } else {
                    if (sum > B) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B = 65;
        System.out.println(find(arr, B));
    }
}
