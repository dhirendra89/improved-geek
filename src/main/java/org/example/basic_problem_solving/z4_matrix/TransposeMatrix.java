package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class TransposeMatrix {

    // statement:
    // Given a square matrix, find transpose matrix

    // algo:
    // Iterate over matrix from sum [0, N+M-2)
    // r=sum
    // Iterate over matrix from colIndex [r+1, M-1)
    // swap arr[r][c] = arr[c][r]
    // Condition if sum >= M-1 break outer loop

    private static int[][] transpose(int[][] arr) {
        for (int sum = 0; sum < arr.length + arr[0].length - 2; sum++) {
            int r = sum;
            if (sum >= arr[0].length - 1) {
                break;
            }
            for (int c = r + 1; c < arr[0].length; c++) {
                int m = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = m;
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
        Arrays.stream(transpose(mat)).forEach(row -> {
            System.out.println();
            Arrays.stream(row).forEach(ele -> System.out.print(ele + " "));
        });
    }
}
