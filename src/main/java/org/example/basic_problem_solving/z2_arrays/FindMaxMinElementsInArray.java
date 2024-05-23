package org.example.basic_problem_solving.z2_arrays;

import java.util.Scanner;

public class FindMaxMinElementsInArray {

    // Take input an array A of size N and write a program to print maximum and minimum elements of the input.
    // The only line of the input would contain
    // a single integer N that represents the length of the array followed by the N elements of the input array A.
    // Problem constraints
    // 1 <= N <= 1000
    // 1 <= A <= 1000

    // algo:
    // Iterate over the array
    // max = arr[0]; if max < arr[i] then max = arr[i];
    // min = arr[0]; if min > arr[i] then min = arr[i];
    // print max and min after completing N iterations

    private static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String[] arr = line.split(" ");
        int size = Integer.parseInt(arr[0]);

        int[] intArr = new int[size];
        for (int i = 1; i <= size; i++) {
            intArr[i - 1] = Integer.parseInt(arr[i]);
        }
        findMinMax(intArr);
    }

}
