package com.threeprogram;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int[] primeNumber = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
// GET THE PRIME NUMBER
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                primeNumber[i] = numbers[i];
            }
        }
// SORTING BEFORE PRINT
        Arrays.sort(primeNumber);

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (primeNumber[i] == primeNumber[j]) {
                    primeNumber[j] = 0;
                }
            }
            if (primeNumber[i] != 0) {
               int noDuplicates = primeNumber[i];
                System.out.println(noDuplicates);
            }
        }
    }
}

