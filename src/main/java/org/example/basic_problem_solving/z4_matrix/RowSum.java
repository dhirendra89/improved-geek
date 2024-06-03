package org.example.basic_problem_solving.z4_matrix;

import java.util.Arrays;

public class RowSum {

    // Return an array containing row sum of given matrix

    private static int[] sum(int[][] mat) {
        int[] arr = new int[mat.length];
        for (int r = 0; r < mat.length; r++) {
            int sum = 0;
            for (int c = 0; c < mat[0].length; c++) {
                sum += mat[r][c];
            }
            arr[r] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        Arrays.stream(sum(mat)).forEach(ele -> System.out.print(ele + " "));
    }
}
