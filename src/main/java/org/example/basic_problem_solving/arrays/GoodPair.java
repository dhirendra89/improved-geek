package org.example.basic_problem_solving.arrays;

public class GoodPair {

    // Given an array A and an integer B.
    // A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
    // Check if any good pair exist or not.

    private static boolean pair(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (k - arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 9, 10, 2, 3, 4, 1, 4, 11, 15, 15, 20};
        int k = 5;
        System.out.println("Pair exists for k = " + k + " - " + pair(arr, k));
    }

}
