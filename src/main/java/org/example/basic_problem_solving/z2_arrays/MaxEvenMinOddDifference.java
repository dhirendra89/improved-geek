package org.example.basic_problem_solving.z2_arrays;

public class MaxEvenMinOddDifference {

    // statement:
    // You are given an array of integers A of size N.
    // Return the difference/subtraction between the
    // maximum among all even numbers of A
    // and
    // the minimum among all odd numbers in A.
    // max(even) - min(odd)

    // algo:
    // iterate over array
    // pick element and check if even and hold it in max
    // check if element is odd and hold it in min

    private static int difference(int[] arr) {
        double max = -1e9;
        double min = 1e9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            } else {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        return (int) (max - min);
    }

    public static void main(String[] args) {

        int[] arr = {5, 17, 100, 1};
        System.out.println(difference(arr));

    }

}
