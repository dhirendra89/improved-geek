package org.example.basic_problem_solving.arrays;

public class OneElementIsGreaterThanItself {

    // Given an array of N size. Count the elements having at least one element greater than themselves.

    // algo:
    // Find the max element in the array ->
    // --> iterate over array [1, N] and store the max element in max variable
    // Count the no. of frequency of max element in array
    // --> iterate over the array and count the no. of times max element present in array
    // Subtract N - count(max) = No. of elements desired

    private static Integer countGreater(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (max == arr[i])
                count++;

        return arr.length - count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 5, 9, 10, 2, 3, 4, 4, 11, 15, 15, 20};
        System.out.println("No. of elements - " + countGreater(arr));
    }

}
