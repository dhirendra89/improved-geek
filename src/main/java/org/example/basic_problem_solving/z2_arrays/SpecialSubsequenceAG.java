package org.example.basic_problem_solving.z2_arrays;

public class SpecialSubsequenceAG {

    // You have given a string A having Uppercase English letters.
    // You have to find how many times subsequence "AG" is there in the given string.
    // NOTE: Return the answer modulo 10^9 + 7 as the answer can be very large.

    // Problem Constraints
    // 1 <= length(A) <= 10^5

    // algo:
    // Iterate over array from N-1 to 0
    // keep a count on no. of g
    // on every a calculate the sum of g count, sum+=count

    private static int subsequence(String A) {
        int count_g = 0;
        int sum = 0;
        char[] arr = A.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'g' || arr[i] == 'G') {
                count_g += 1;
            }
            if (arr[i] == 'a' || arr[i] == 'A') {
                sum += count_g;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String A = "Anagram";
        System.out.println(subsequence(A));
    }
}
