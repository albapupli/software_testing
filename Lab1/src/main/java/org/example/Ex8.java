package org.example;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println(" Average of the numbers is: " + average);
    }
}

