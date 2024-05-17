package org.example.basic_problem_solving.given_number;

import java.util.Scanner;

public class PrimeNumber {

    // A number is divisible by 1 or itself is a prime number.

    // algo:
    // iterate over [1, sqr(N)]
    // check if N's module is equal to zero than return false until last iteration
    // finally return true
    // TC -> O(sqr(N))

    private static boolean isPrimeNumber(int N) {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number of your choice.. ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(N + " is a prime number: " + isPrimeNumber(N));

    }

}
