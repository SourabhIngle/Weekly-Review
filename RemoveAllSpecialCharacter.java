package com.threeprogram;

import java.util.Scanner;

public class RemoveAllSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any sentence : ");
        String userInput = sc.nextLine();
        String cleanString = userInput.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Without special character sentence is : \n" + cleanString);
    }
}
