package org.example.basic_problem_solving.z1_given_number;

import java.util.Scanner;

public class FindArmstrongNumber {

    public static void main(String[] args) {

        System.out.print("Enter Number...");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int a = 1; a <= N; a++) {
            int n = a;
            int sum = 0;
            while (n > 0) {
                int m = n % 10;
                sum += (m * m * m);
                n = n / 10;
            }
            if (sum == a) {
                System.out.println(a);
            }
        }

    }

}
