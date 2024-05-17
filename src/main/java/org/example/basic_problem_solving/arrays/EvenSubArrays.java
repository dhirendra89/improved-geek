package org.example.basic_problem_solving.arrays;

public class EvenSubArrays {

    // You are given an integer array A.
    //Decide whether it is possible to divide the array into one or more sub-arrays of even length
    // such that the first and last element of all sub-arrays will be even.
    // Return "YES" if it is possible; otherwise, return "NO" (without quotes).

    // Problem Constraints
    // 1 <= |A|, A[i] <= 10^6

    private static String decide(int[] arr) {
        String answer = "YES";
        if (arr.length % 2 != 0) {
            answer = "NO";
        }
        if (arr[0] % 2 != 0 || arr[arr.length - 1] % 2 != 0) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 7, 6};
        System.out.println(decide(arr));
    }
}
