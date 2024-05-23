package org.example.basic_problem_solving.z1_given_number;

public class FindSquareRoot2 {

    private static int squareRoot(int N) {

        int start = 1;
        int end = N;
        int m = (start + end) / 2;

        if (m * m == N) {
            return m;
        }
        while (true) {
            int l = m * m;
            if (l > N) {
                end = m - 1;
            } else {
                start = m + 1;
            }
            m = (start + end) / 2;

            if (m * m == N) {
                return m;
            } else if (start == end || end < start) {
                return -1;
            }

        }
    }

    public static void main(String[] args) {

        int N = 1000;
        System.out.println(squareRoot(N) + " is the square root of " + N);

    }

}
