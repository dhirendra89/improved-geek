package org.example.basic_problem_solving.util;

import java.util.Scanner;

public class TestCasesInputScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i = 1; i <= testCases; i++) {
            int size = scanner.nextInt();
            String blank = scanner.nextLine();
            String line = scanner.nextLine();
            String[] arr = line.split(" ");

            int[] intArr = new int[size];
            for (int l = 0; l < size; l++) {
                intArr[l] = Integer.parseInt(arr[l]);
            }
            int k = scanner.nextInt();

            boolean found = false;
            for (int j = 0; j < intArr.length; j++) {
                if (k == intArr[j]) {
                    found = true;
                }
            }
            System.out.println(found ? 1 : 0);
        }
    }
}
