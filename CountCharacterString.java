package com.threeprogram;

import java.util.Scanner;

public class CountCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = sc.nextLine();
        char[] noDuplicate = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            noDuplicate[i] =word.charAt(i);
        }

        for (int i = 0; i < noDuplicate.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < word.length(); j++) {
                if (noDuplicate[i] == noDuplicate[j]) {
                    noDuplicate[j] = '0';
                    counter++;
                }
            }
            if (noDuplicate[i] != '0') {
                char character = noDuplicate[i];
                System.out.print(character + " " + counter+",");
            }
        }
    }
}