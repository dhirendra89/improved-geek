package org.example.basic_problem_solving.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseElementsInArray {

    // statement:
    // reverse the elements of array with sc O(1)

    // algo:
    // iterate over the array [1, N]
    // pick ith and element and swap it with (N-1)-i element
    // if (N-1)-i > i then do not swap (it is the middle element)

    private static int[] reverse(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = (arr.length - 1) - i;
            if (j <= i) {
                break;
            }
            int m = arr[i];
            arr[i] = arr[j];
            arr[j] = m;
        }
        return arr;
    }

    public static ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer> list = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++) {
            list.add(i, null);
        }

        for (int i = 0; i < A.size(); i++) {
            int j = (A.size() - 1) - i;
            if (j <= i) {
                list.add(i, A.get(i));
                break;
            }
            list.add(i, A.get(j));
            list.add(j, A.get(i));
        }
        return list;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Arrays.stream(reverse(arr)).forEach(System.out::println);

        solve(Arrays.asList(1, 2, 3, 4, 5)).forEach(System.out::print);

    }

}
