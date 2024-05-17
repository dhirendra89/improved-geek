package org.example.basic_problem_solving.arrays;

import java.util.Arrays;

public class LeadersInArray {

    // Given an integer array A containing N distinct integers,
    // you have to find all the leaders in array A.
    // An element is a leader if it is strictly greater than all the elements to its right side.
    //NOTE: The rightmost element is always a leader.

    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= A[i] <= 10^8

    // algo:
    // Iterate over array from N-1 to 0
    // the right most element is always a leader
    // Store leader into leader variable
    // for each element compare it with leader
    // If it is greater than leader than it is also a leader and put into leader array

    private static int[] leaders(int[] arr) {
        int[] leaders = new int[arr.length];
        int leader = arr[arr.length - 1];
        leaders[arr.length - 1] = leader;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > leader) {
                leader = arr[i];
                leaders[i] = arr[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        Arrays.stream(leaders(arr)).forEach(ele -> System.out.print(ele + ","));
    }

}
