package org.example.basic_problem_solving.z2_arrays;

public class Bulbs {

    // statement:
    // A wire connects N light bulbs.
    //Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
    //Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
    //You can press the same switch multiple times.
    //Note: 0 represents the bulb is off and 1 represents the bulb is on.

    // 0 <= N <= 5×10^5
    // 0 <= A[i] <= 1

    // algo:
    // Iterate over array and count the 0s and 1s
    // Iterate over array and for each element check 0s or 1s
    // If 0 then count_0 -1; if 1 then count_1 -1
    // If 0 then count_0 = count_1; and count_1=count_0;
    // return count+= count_0;

    private static int switches(int[] arr) {
        int count = 0;
        int count_0 = 0;
        int ptr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_0 += 1;
            }
        }
        if (count_0 == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && ptr == 0) {
                ptr = 1;
                count += 1;
            }
            if (arr[i] == 1 && ptr == 1) {
                ptr = 0;
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0};
        System.out.println(switches(arr));
    }
}
