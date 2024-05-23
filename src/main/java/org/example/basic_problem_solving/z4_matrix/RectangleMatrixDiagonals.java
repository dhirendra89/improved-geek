package org.example.basic_problem_solving.z4_matrix;

public class RectangleMatrixDiagonals {

    // statement:
    // Print matrix's all diagonals

    // algo:
    // Iterate over sum of matrix index 0, N+M-2
    // Iterate over rows [sum 0] and find column index c=sum-r
    // print elements in rows loop where r [0, N] and c [0, M]

    private static void print(int[][] arr) {
        for (int sum = 0; sum <= (arr.length + arr[0].length) - 2; sum++) {
            for (int r = sum; r >= 0; r--) {
                int c = sum - r;
                if (r < arr.length && c < arr[0].length && r >= 0 && c >= 0) {
                    System.out.print(arr[r][c] + " ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        print(mat);
    }
}
