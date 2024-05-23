package org.example.basic_problem_solving.z2_arrays;

public class SecondLargestElement {

    // statement:
    // You are given an integer array A.
    // You have to find the second-largest element/value in the array or report that no such element exists.
    // Problem Constraints
    // 1 <= |A| <= 10^5
    // 0 <= A[i] <= 10^9

    // algo:
    // iterate over array
    // pick element and compare it with max, max < arr[i]
    // if true then max = arr[i]
    // Iterate over array
    // check if element is less than max and greater than secondMax element then secondMax = arr[i]

    private static int secondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i] && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {20, 12, 15, 19, 13, 5, 13, 12, 18};
        System.out.println(secondLargest(arr));

    }

}
