package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class MatrixScalarProduct {

    // You are given a matrix A and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
    // Problem Constraints
    // 1 <= A.size() <= 1000
    // 1 <= A[i].size() <= 1000
    // 1 <= A[i][j] <= 1000
    // 1 <= B <= 1000

    private static int[][] scalarProduct(int[][] mat, int B) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[r][c] = mat[r][c] * B;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        Arrays.stream(scalarProduct(mat, B)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
