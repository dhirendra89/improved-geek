package org.example.basic_problem_solving.sub_arrays;

public class MaximumSubArray {

    // You are given an integer array C of size A.
    // Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
    // But the sum must not exceed B.

    // Problem Constraints
    // 1 <= A <= 10^3
    // 1 <= B <= 10^9
    // 1 <= C[i] <= 10^6

    // algo:
    // Iterate over array
    // for each subarray find sum and if sum > B then pick another subarray

    private static int largestSum(int[] arr, int B) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = max(maxSum, sum, B);
            }
        }
        return maxSum;
    }

    private static int max(int a, int b, int B) {
        if (b > B) {
            return a;
        } else {
            return a > b ? a : b;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2};
        int B = 1;
        System.out.println(largestSum(arr, B));
    }

}
