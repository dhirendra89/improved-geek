package org.example.basic_problem_solving.z2_arrays;

public class RemoveElementFromArrayForthatEvenAndOddIndexedSumIsEqual {

    // Problem Description
    // Given an array, arr[] of size N, the task is to find the count of array indices
    // such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

    // Problem Constraints
    // 1 <= N <= 105
    // -105 <= A[i] <= 105
    // Sum of all elements of A <= 109

    //Input Format
    //First argument contains an array A of integers of size N

    // algo:
    // Iterate over array
    // Prepare even and odd indexed prefix Sum arrays
    // Iterate over array and check on the index that sum of even and odd indexed elements is
    // equal and increase count.

    private static int removeElementEvenAndOddIndexedElementSumIsEqual(int[] arr) {

        int count = 0;
        int N = arr.length;
        int[] peArr = new int[N];
        int[] poArr = new int[N];
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                peArr[i] = i == 0 ? arr[0] : peArr[i - 1] + arr[i];
                poArr[i] = i == 0 ? 0 : poArr[i - 1];
            } else {
                poArr[i] = i == 1 ? arr[i] : poArr[i - 1] + arr[i];
                peArr[i] = peArr[i - 1];
            }
        }

        for (int i = 0; i < N; i++) {
            int eSum = 0;
            int oSum = 0;
            eSum = poArr[N - 1] - poArr[i] + (i == 0 ? 0 : peArr[i - 1]);
            oSum = peArr[N - 1] - peArr[i] + (i == 0 ? 0 : poArr[i - 1]);
            if (eSum == oSum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println(removeElementEvenAndOddIndexedElementSumIsEqual(arr));
    }
}
