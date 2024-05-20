package org.example.basic_problem_solving.sub_arrays;

public class CountingSubArrays {

    // Given an array A of N non-negative numbers and a non-negative number B,
    // you need to find the number of subarrays in A with a sum less than B.
    // We may assume that there is no overflow.

    // Problem Constraints
    // 1 <= N <= 5 x 10^3
    // 1 <= A[i] <= 1000
    // 1 <= B <= 10^7
    private static int count(int[] arr, int B) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < B) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6};
        int B = 10;
        System.out.println(count(arr, B));
    }
}
