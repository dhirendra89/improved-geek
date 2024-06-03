package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class MatrixMultiplication {

    // Problem Description
    // You are given two integer matrices A(having M X N size) and B(having N X P).
    // You have to multiply matrix A with B and return the resultant matrix. (i.e. return the matrix AB).

    // Problem Constraints
    // 1 <= M, N, P <= 100
    // -100 <= A[i][j], B[i][j] <= 100

    // algo:
    // Iterate over rows mat1 [0, M-1]
    // Iterate over cols mat2 [0, P-1]
    // Iterate over cols mat1 [0, N-1]
    // sum+= mat1[r][c2] * mat2[c2][c1]

    private static int[][] multiply(int[][] mat1, int[][] mat2) {
        int[][] mat = new int[mat1.length][mat2[0].length];
        for (int r = 0; r < mat1.length; r++) {
            for (int c2 = 0; c2 < mat2[0].length; c2++) {
                int sum = 0;
                for (int c1 = 0; c1 < mat1[0].length; c1++) {
                    sum += mat1[r][c1] * mat2[c1][c2];
                }
                mat[r][c2] = sum;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        /*int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};*/

        int[][] mat1 = {{1, 1}};
        int[][] mat2 = {{2}, {3}};

        Arrays.stream(multiply(mat1, mat2)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });

    }
}
