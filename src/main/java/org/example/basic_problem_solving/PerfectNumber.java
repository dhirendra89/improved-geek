package org.example.basic_problem_solving;

import java.util.Scanner;

public class PerfectNumber {

    // N is a perfect number if all its divisible ''s sum is equal to the number N.

    // algo:
    // iterate to [1, sqr(N)]
    // check if N is divisible by i
    // if divisible then i, N/i are the factors of N, add them and store it into sum variable
    // finally after loop check if sum is equal to N

    private static boolean isPerfectNumber(int N) {
        int sum = 1;

        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i + N / i;
            }
        }
        return sum == N;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number of your choice.. ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(N + " is a perfect number: " + isPerfectNumber(N));

    }

}
