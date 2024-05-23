package org.example.basic_problem_solving.z4_matrix;

public class SquareMatrixDiagonals {

    // statement:
    // Print matrix's two diagonals

    // algo:
    // Iterate over rows [0, N-1] and print arr[r][r] elements - Diagonal 1
    // Iterate over rows [N-1, 0] and print arr[r][N-1 -r] elements - Diagonal 2
    // TC - 0(N)

    private static void print(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            System.out.print(arr[r][r] + " ");
        }
        System.out.println();
        for (int r = arr.length - 1; r >= 0; r--) {
            System.out.print(arr[r][arr.length - 1 - r] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(mat);
    }
}
