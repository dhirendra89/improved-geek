package org.example.basic_problem_solving.sub_arrays;

import java.util.Arrays;

public class AlternatingSubarrays {

    // You are given an integer array A of length N comprising 0's & 1's, and an integer B.
    // You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.
    // A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.

    // algo:
    // Iterate over array
    // pick each element and calc subarray of len(2*B+1)
    // find that subarray is alternative subarray
    // if it is then calc the mid of it and store it into indexes array
    // if B==0 then len(1) so count all the indexes as center of subarray

    // Problem Constraints
    // 1 <= N <= 10^3
    // A[i] equals to 0 or 1.
    // 0 <= B <= (N - 1) / 2

    private static int[] find(int[] arr, int B) {
        int[] idxArr = new int[arr.length];
        for (int i = 0; i <= arr.length - (2 * B + 1); i++) {
            if (B == 0) {
                idxArr[i] = i;
            } else {
                boolean isAlternative = true;
                for (int j = i + 1; j <= i + ((2 * B + 1) - 1); j++) {
                    if (arr[j] == arr[j - 1]) {
                        isAlternative = false;
                    }
                }
                if (isAlternative) {
                    idxArr[i] = (int) (Math.ceil((2 * B + 1) / 2)) + i;
                }
            }
        }
        return idxArr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 0, 1};
        int B = 0;
        Arrays.stream(find(arr, B)).forEach(ele -> System.out.print(ele + " "));
    }

}
