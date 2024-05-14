package org.example.basic_problem_solving.arrays;

public class MaxSelectedElementInArray {

    // Little Ponny is given an array, A, of N integers.
    // In a particular operation, he can set any element of the array equal to -1.
    // He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B.
    // If it is not possible, then return -1.

    // algo:
    // iterate over array and check if B is present in array
    // if not present than return -1
    // If present count number of max element than B and return that count

    private static int operations(int[] arr, int B) {
        int count = 0;
        boolean present = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == B) {
                present = true;
                break;
            }
        }
        if (present) {
            for (int i = 0; i < arr.length; i++) {
                if (B < arr[i]) {
                    count += 1;
                }
            }
            if (count == 0) {
                return -1;
            }
        } else {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(operations(arr, 1));
    }

}

