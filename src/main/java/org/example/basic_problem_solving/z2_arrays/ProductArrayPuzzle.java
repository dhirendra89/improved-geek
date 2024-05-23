package org.example.basic_problem_solving.z2_arrays;

import java.util.Arrays;

public class ProductArrayPuzzle {

    // Given an array of integers A, find and return the product array of the same size
    // where the ith element of the product array will be equal to the product of all the elements divided
    // by the ith element of the array.
    // Note: It is always possible to form the product array with integer (32 bit) values.
    // Solve it without using the division operator.

    // 2 <= length of the array <= 1000
    // 1 <= A[i] <= 10

    // Input 1:
    //   A = [1, 2, 3, 4, 5]
    //Output 1:
    //   [120, 60, 40, 30, 24]

    // Input 2:
    //   A = [5, 1, 10, 1]
    // Output 2:
    //   [10, 50, 5, 50]

    // algo:
    // Iterate over array and find the product of all elements
    // Iterate over array and divide product by arr[i] and hold it in new array

    private static int[] productArray(int[] arr) {
        int[] productArr = new int[arr.length];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            productArr[i] = product / arr[i];
        }
        return productArr;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {5, 1, 10, 1};
        Arrays.stream(productArray(arr)).forEach(ele -> System.out.print(ele + " "));
    }
}
