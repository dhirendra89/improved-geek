package org.example.basic_problem_solving.z3_sub_arrays;

public class SumOfAllSubArrays {

    // You are given an integer array A of length N.
    // You have to find the sum of all subarray sums of A.
    // Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= Ai <= 10^4

    // algo:
    // Iterate over array and find the contribution of each element in subarray and add them into sum variable

    private static long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (long) arr[i] * (arr.length - i) * (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3};
        System.out.println(sum(arr));
    }
}
