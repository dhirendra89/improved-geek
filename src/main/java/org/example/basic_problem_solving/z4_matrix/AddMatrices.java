package org.example.basic_problem_solving.z4_matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMatrices {

    // Problem Description
    // You are given two matrices A & B of same size, you have to return another matrix which is
    // the sum of A and B.
    // Note: Matrices are of same size means the number of rows and number of columns of both
    // matrices are equal.

    // algo:
    // Iterate over rows
    // Iterate over each column
    // add two elements(cells) mat1[i][j]+ mat2[i][j]
    // return new matrix

    private static int[][] add(int[][] mat1, int[][] mat2) {
        int[][] mat = new int[mat1.length][mat1[0].length];
        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat1[r].length; c++) {
                mat[r][c] = mat1[r][c] + mat2[r][c];
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        Arrays.stream(mat1).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println();
        Arrays.stream(mat2).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println();

        System.out.println("--------------------------------------------");

        Arrays.stream(add(mat1, mat2)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
