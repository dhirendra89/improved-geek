package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class ColumnSum {

    // Problem Description
    // You are given a 2D integer matrix A,
    // return a 1D integer array containing column-wise sums of original matrix.

    // algo:
    // Iterate over columns [0, M-1]
    // Iterate over rows [0, N-1]
    // sum+=arr[r][c]

    private static int[] find(int[][] mat) {
        int[] arr = new int[mat[0].length];
        for (int c = 0; c < mat[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < mat.length; r++) {
                sum += mat[r][c];
            }
            arr[c] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Arrays.stream(mat).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println();
        Arrays.stream(find(mat)).forEach(ele -> {
            System.out.print(ele + " ");
        });
    }
}
