package org.example.basic_problem_solving.util;

import java.util.Arrays;
import java.util.Scanner;

public class LineScannerEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int K = Integer.parseInt(scanner.nextLine());

        String[] arr = line.split(" ");
        int size = Integer.parseInt(arr[0]);

        int[] intArr = new int[size];
        for (int i = 1; i <= size; i++) {
            intArr[i - 1] = Integer.parseInt(arr[i]);
        }

        Arrays.stream(intArr).forEach(System.out::print);
        System.out.println();
        System.out.println(K);

    }

}
