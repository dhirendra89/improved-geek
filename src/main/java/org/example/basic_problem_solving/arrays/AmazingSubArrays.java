package org.example.basic_problem_solving.arrays;

public class AmazingSubArrays {

    // You are given a string S, and you have to find all the amazing substrings of S.
    //An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
    //Input - Only argument given is string S.

    // Constraints
    // 1 <= length(S) <= 1e6
    // S can have special characters

    private static int count(String A) {
        int count = 0;
        char[] arr = A.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A' ||
                    arr[i] == 'e' || arr[i] == 'E' ||
                    arr[i] == 'i' || arr[i] == 'I' ||
                    arr[i] == 'o' || arr[i] == 'O' ||
                    arr[i] == 'u' || arr[i] == 'U') {
                count+= arr.length - i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "ABEC";
        System.out.println(count(A));
    }
}
