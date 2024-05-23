package org.example.basic_problem_solving.z2_arrays;

public class PrintAllPossibleSubArray {

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = i; j < arr.length; j++) {
                str += arr[j];
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        print(arr);
    }
}
