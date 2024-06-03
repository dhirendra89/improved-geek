package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class RowAndColumnToZero {

    // Problem Description
    // You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
    // Specifically, make entire ith row and jth column zero.

    // Problem Constraints
    // 1 <= A.size() <= 10^3
    // 1 <= A[i].size() <= 10^3
    // 0 <= A[i][j] <= 10^3

    private static int[][] zero(int[][] mat) {
        int[][] mat1 = new int[mat.length][mat[0].length];
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                if (mat[r][c] == 0) {
                    for (int c1 = 0; c1 < mat1[0].length; c1++) {
                        mat1[r][c1] = -1;
                    }
                    for (int r1 = 0; r1 < mat1.length; r1++) {
                        mat1[r1][c] = -1;
                    }
                } else {
                    if (mat1[r][c] != -1) {
                        mat1[r][c] = mat[r][c];
                    }
                }
            }
        }
        return mat1;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 0}, {7, 8, 9}};

        Arrays.stream(mat).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + "      "));
        });
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println();

        Arrays.stream(zero(mat)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + "          "));
        });
    }
}
