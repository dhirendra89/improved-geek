package org.example.basic_problem_solving.arrays;

public class TimeToEquality {

    // Given an integer array A of size N. In one second, you can increase the value of one element by 1.
    //Find the minimum time in seconds to make all elements of the array equal.

    // Problem Constraints
    // 1 <= N <= 10^6
    // 1 <= A[i] <= 1000

    // algo:
    // Iterate over array and find the max element
    // Iterate over array and for each element i<max ? sum+=max-arr[i]

    private static int equalitySeconds(int[] arr) {
        int totalSeconds = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                totalSeconds += max - arr[i];
            }
        }
        return totalSeconds;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};
        System.out.println(equalitySeconds(arr));
    }
}
