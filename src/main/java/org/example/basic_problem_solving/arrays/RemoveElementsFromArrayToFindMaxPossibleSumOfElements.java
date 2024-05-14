package org.example.basic_problem_solving.arrays;

public class RemoveElementsFromArrayToFindMaxPossibleSumOfElements {

    //You are given an integer array A of size N.
    //You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
    //Find and return the maximum possible sum of the B elements that were removed after the B operations.

    //NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
    //Remove 3 elements from front and 0 elements from the back, OR
    //Remove 2 elements from front and 1 element from the back, OR
    //Remove 1 element from front and 2 elements from the back, OR
    //Remove 0 elements from front and 3 elements from the back.

    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= B <= N
    // -10^3 <= A[i] <= 10^3

    // A = [5, -2, 3 , 1, 2]
    // B = 3
    // Ans: 8

    //  A = [ 2, 3, -1, 4, 2, 1 ]
    // B = 4
    // Ans: 9

    // algo:
    // Iterate over array and create a prefix-sum array
    // Iterate from i=0 to i<=B
    // Find the sum for i and B-i elements from psArray
    // hold max sum and return

    private static int maxPossibleSum(int[] arr, int B) {
        int max = 0;
        int[] psArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            psArr[i] = i == 0 ? arr[0] : psArr[i - 1] + arr[i];
        }

        for (int i = 0; i <= B; i++) {
            int K = B - i;
            int sum = 0;
            if (i == 0) {
                sum = B == arr.length ? psArr[psArr.length - 1]
                        : psArr[psArr.length - 1] - psArr[psArr.length - (K + 1)];
            } else if (K == 0) {
                sum = B == arr.length ? psArr[psArr.length - 1] : psArr[i - 1];
            } else {
                sum = psArr[i - 1] + (psArr[psArr.length - 1] - psArr[psArr.length - (K + 1)]);
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // int[] arr = {5, -2, 3, 1, 2};
        // int B = 3;

        int[] arr = {2, 3, -1, 4, 2, 1};
        int B = 4;
        System.out.println(maxPossibleSum(arr, B));
    }

}
