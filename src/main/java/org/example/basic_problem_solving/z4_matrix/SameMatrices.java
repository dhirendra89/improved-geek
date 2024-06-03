package org.example.basic_problem_solving.z4_matrix;

public class SameMatrices {

    // You are given two matrices A and B of equal dimensions, and you have to check whether two matrices are equal or not.
    // NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.

    // algo:
    // Iterate over rows
    // Iterate over cols
    // check mat1[r][c] == mat2[r][c]
    // if at least one does not match return 0 else 1

    private static int check(int[][] mat1, int[][] mat2) {
        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat1[0].length; c++) {
                if (mat1[r][c] != mat2[r][c]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 2, 3}, {4, 1, 6}, {7, 8, 9}};

        System.out.println(check(mat1, mat2));
    }
}
