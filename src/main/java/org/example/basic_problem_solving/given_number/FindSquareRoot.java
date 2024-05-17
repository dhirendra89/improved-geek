package org.example.basic_problem_solving.given_number;

public class FindSquareRoot {

    // No. of iteration square root of N
    private static int squareRoot(int number) {
        int i = 0;
        while (i < number) {
            if (i * i == number) {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

        int N = 49;
        System.out.println(squareRoot(N) + " is the square root of " + N);

    }

}
