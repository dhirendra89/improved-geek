package org.example.basic_problem_solving.z4_matrix;

public class MinorDiagonalSum {

    // You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
    // Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

    // Problem Constraints
    // 1 <= N <= 10^3
    // -1000 <= A[i][j] <= 1000

    private static int sum(int[][] mat) {
        int total = 0;
        for (int r = mat.length - 1; r >= 0; r--) {
            int c = (mat.length - 1) - r;
            total += mat[r][c];
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        System.out.println(sum(mat));
    }
}
