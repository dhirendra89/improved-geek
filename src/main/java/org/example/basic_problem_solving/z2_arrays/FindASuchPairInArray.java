package org.example.basic_problem_solving.z2_arrays;

public class FindASuchPairInArray {

    // statement:
    // Check if such pair exists in array?
    // ar[i] + ar[j] = k where i!=j

    // algo:
    // iterate over arr i [0, N] to process each element
    // iterate over arr j [i+1, N] to check k - ar[i] == ar[j]
    // If find return true
    // finally return false

    private static boolean pair(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (k - arr[i] == arr[j])
                    return true;
            }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 9, 10, 2, 3, 4, 1, 4, 11, 15, 15, 20};
        int k = 5;
        System.out.println("Pair exists for k = " + k + " - " + pair(arr, k));
    }

}
