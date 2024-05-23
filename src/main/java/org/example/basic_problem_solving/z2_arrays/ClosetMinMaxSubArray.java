package org.example.basic_problem_solving.z2_arrays;

public class ClosetMinMaxSubArray {

    // This problem can be solved in a simple O(N) complexity.
    // We can implement a sliding window kind of algorithm using two pointers. We can slide over
    // the array and keep track of every last occurrence of the minimum and maximum element of the array.
    // In order to find the start point, we can simply remember the last occurrences of a minimum
    // and a maximum value, respectively. And for each min-max pair, we check the length of the
    // sub-array that encloses them and then update out overall based on that.

    //algo:
    // Iterate over array and find min and max
    // Keep two pointers for min and max, minPtr=-1, mxPtr=-1, size=Integer.Max_Value
    // Iterate over array and check either element is max or min
    // And update pointer accordingly with index and calculate the size if both pointers have
    // greater value than -1 (ie. condition that satisfies closet must have one min and one max
    // element in it)

    private static int closetMinMax(int[] arr) {
        int size = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_ptr = -1;
        int min_ptr = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                max_ptr = i;
            }
            if (arr[i] == min) {
                min_ptr = i;
            }
            if (max_ptr != -1 && min_ptr != -1) {
                int elements = max_ptr > min_ptr ? (max_ptr - min_ptr) + 1 : (min_ptr - max_ptr) + 1;
                size = size > elements ? elements : size;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 6, 9};
        System.out.println(closetMinMax(arr));
    }

}
