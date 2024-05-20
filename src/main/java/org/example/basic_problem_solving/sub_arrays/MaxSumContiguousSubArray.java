package org.example.basic_problem_solving.sub_arrays;

public class MaxSumContiguousSubArray {

    // Find the maximum sum of contiguous non-empty subarray within an array A of length N.

    // algo:
    // Iterate over array
    // for each element calc the currSum and find max of (currSum, maxSum)
    // If currSum is < 0 then reset it to 0
    // Kadanse's algo.

    private static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -10};
        System.out.println(maxSum(arr));
    }
}
