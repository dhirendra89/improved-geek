package org.example.basic_problem_solving.given_number;

public class CountNoOfFactors {

    private static int countNoOfFactors(int number) {
        int count = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int number = 25;
        System.out.println(number + " has No. of factors are: " + countNoOfFactors(number));
    }

}
