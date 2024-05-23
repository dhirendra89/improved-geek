package org.example.basic_problem_solving.z2_arrays;

public class EquilibriumIndexOfArray {

    // statement:
    // You are given an array A of integers of size N.
    // Your task is to find the equilibrium index of the given array
    // The equilibrium index of an array is an index such that the sum of elements at lower
    // indexes is equal to the sum of elements at higher indexes.
    // If there are no elements that are at lower indexes or at higher indexes,
    // then the corresponding sum of elements is considered as 0.
    // Note:
    // Array indexing starts from 0.
    // If there is no equilibrium index then return -1.
    // If there are more than one equilibrium indexes then return the minimum index.

    // algo:
    // Iterate over array
    // at every element calculate the sum of cumulative sum
    // sum = arr[0], sum = arr[i] + arr[i-1]
    // (ie. create a prefix sum at every index) [PS array]
    // Iterate over array pick every index
    // Find the left sum Sl at index ith
    // Sl -> Sl=0 i!=o then Sl=psArr[i-1]
    // Sr -> Sr=0 if i!=N then psArr[N] - psArr[i]

    private static int equilibriumIndex(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int min = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int sL = 0;
            int sR = 0;
            if (i != 0) {
                sL = arr[i - 1];
            }
            if (i != arr.length - 1) {
                sR = arr[arr.length - 1] - arr[i];
            }
            if (sL == sR && min > i) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 2};
        System.out.println(equilibriumIndex(arr) + " is the equilibrium index.");
    }

}
