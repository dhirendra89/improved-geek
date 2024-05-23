package org.example.basic_problem_solving.z2_arrays;

import java.util.Arrays;

public class RangeSumQuery {

    // You are given an integer array A of length N.
    // You are also given a 2D integer array B with dimensions M x 2, where each row denotes a
    // [L, R] query.
    // For each query, you have to find the sum of all elements from L to R indices in A (0 -
    // indexed).

    // Problem Constraints
    // 1 <= N, M <= 10^5
    // 1 <= A[i] <= 10^9
    // 0 <= L <= R < N

    // algo:
    // Iterate over array and create prefix-sum array
    // Iterate over queries and for each query find sum
    // create an array and hold the sum on ith index for ith query
    // sum = psArr[R] - psArr[L-1]

    private static int[] queriesSum(int[] arr, int[][] Q) {
        int[] sumArr = new int[Q.length];
        int[] psArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            psArr[i] = i == 0 ? arr[i] : psArr[i - 1] + arr[i];
        }
        for (int i = 0; i < Q.length; i++) {
            int[] q = Q[i];
            sumArr[i] = q[0] == 0 ? psArr[q[1]] : psArr[q[1]] - psArr[q[0] - 1];
        }
        return sumArr;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int[][] Q = {{0, 3}, {1, 2}};

        int[] arr = {2, 2, 2};
        int[][] Q = {{0, 0}, {1, 2}};

        Arrays.stream(queriesSum(arr, Q)).forEach(System.out::println);
    }

}
