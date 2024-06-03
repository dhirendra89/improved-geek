package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class MatrixSubtraction {

    // Problem Description
    // You are given two integer matrices A and B having same size (Both having same number of rows (N) and columns (M)).
    // You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
    // If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.

    // Problem Constraints
    // 1 <= N, M <= 103
    // -10^9 <= A[i][j], B[i][j] <= 10^9

    // algo:
    // Iterate over rows [0, N-1]
    // Iterate over cols [0, M-1]
    // mat[r][c] = mat1[r][c] - mat2[r][c]

    private static int[][] subtraction(int[][] mat1, int[][] mat2) {
        int[][] mat = new int[mat1.length][mat1[0].length];
        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[r][c] = mat1[r][c] - mat2[r][c];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Arrays.stream(subtraction(mat1, mat2)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
