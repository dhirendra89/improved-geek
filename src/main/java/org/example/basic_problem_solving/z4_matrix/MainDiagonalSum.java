package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class MainDiagonalSum {

    // Problem Description
    // You are given an N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
    // Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

    // 1 <= N <= 10^3
    // -1000 <= A[i][j] <= 1000

    private static int sum(int[][] mat) {
        int total = 0;
        for (int sum = 0; sum < mat.length + mat[0].length - 2; sum++) {
            if (sum > mat.length - 1) {
                continue;
            }
            total += mat[sum][sum];
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};

        Arrays.stream(mat).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println("---------------------------------");
        System.out.print(sum(mat));
    }
}
