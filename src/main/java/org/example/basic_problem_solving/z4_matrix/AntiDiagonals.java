package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class AntiDiagonals {

    // Problem Description
    // Give an N * N square matrix A, return an array of its anti-diagonals

    // Problem Constraints
    // 1<= N <= 1000
    // 1<= A[i][j] <= 1e9

    // algo:
    // Create a matrix mat[2*N-1][N]
    // Iterate over sum [0, m+n-2)
    // Iterate over rows [sum, 0]
    // c=sum-r
    // new Index = mat1[sum][sum <= c ? c : c - (sum - N-1)]

    private static int[][] find(int[][] arr) {
        int[][] mat = new int[2 * arr.length - 1][arr.length];
        for (int sum = 0; sum <= arr.length + arr[0].length - 2; sum++) {
            for (int r = 0; r <= sum; r++) {
                int c = sum - r;
                if (r > arr.length - 1 || c > arr[0].length - 1) {
                    continue;
                }
                int i = sum <= arr.length - 1 ? c : c - (sum - (arr.length - 1));
                mat[sum][i] = arr[r][c];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        // int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr = {{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
        Arrays.stream(arr).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println();
        Arrays.stream(find(arr)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
