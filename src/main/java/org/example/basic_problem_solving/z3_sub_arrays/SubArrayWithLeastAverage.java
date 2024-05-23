package org.example.basic_problem_solving.z3_sub_arrays;

public class SubArrayWithLeastAverage {

    // Given an array A of size N, find the subarray of size B with the least average.
    // Problem Constraints
    // 1 <= B <= N <= 10^5
    // -10^5 <= A[i] <= 10^5

    // Iterate over array
    // Find the prefix sum
    // pick B elements and find average and find min(minAvg, currAvg)

    private static int leastAverage(int[] arr, int B) {
        int leastAvgIndex = -1;
        int minAvg = Integer.MAX_VALUE;
        int currAvg = 0;
        int[] psArr = new int[arr.length];
        psArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            psArr[i] = arr[i] + psArr[i - 1];
        }
        for (int i = 0; i <= arr.length - B; i++) {
            currAvg = i == 0 ? psArr[B - 1] / B : (psArr[i + B - 1] - psArr[i - 1]) / B;
            if (minAvg >= currAvg) {
                minAvg = currAvg;
                leastAvgIndex = i;
            }
        }
        return leastAvgIndex;
    }

    public static void main(String[] args) {
        int[] arr = {345, 119, 425, 67, 465, 376, 179, 472, 210, 404, 451, 389, 487, 417, 50, 467, 235, 465, 496, 35, 386, 172, 88, 98, 391, 315, 68, 346, 260, 309, 275, 20, 87, 336, 239, 467, 338, 118, 467, 448, 30, 406, 382, 191, 347, 182, 92, 185, 351, 190, 312, 384, 137, 479, 289, 334, 400, 152, 400, 453, 187, 264, 103, 497, 367, 33, 264, 179, 258, 345, 42, 121, 273, 389, 214, 466, 401, 432, 225, 407, 395, 276, 244, 111, 149, 26, 320, 446, 86, 474, 393, 420, 106, 209, 391, 153, 113};
        int B = 72;
        System.out.println(leastAverage(arr, B));
    }
}
