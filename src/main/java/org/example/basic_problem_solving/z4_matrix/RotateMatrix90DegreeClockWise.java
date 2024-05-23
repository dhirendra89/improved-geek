package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class RotateMatrix90DegreeClockWise {

    // statement:
    // Rotate given square matrix 90 degree clock wise

    // algo:
    // First transpose the matrix
    // then reverse each row

    private static int[][] rotate90degree(int[][] arr) {
        for (int sum = 0; sum <= arr.length + arr[0].length - 2; sum++) {
            int r = sum;
            for (int c = r + 1; c < arr[0].length; c++) {
                int m = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = m;
            }
        }
        for (int r = 0; r < arr.length; r++) {
            for (int i = 0; i < arr[0].length; i++) {
                int j = arr[0].length - 1 - i;
                if (i >= j) {
                    break;
                }
                int m = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = m;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        Arrays.stream(mat).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
        System.out.println();
        System.out.println("--------------------------------------------");
        Arrays.stream(rotate90degree(mat)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
