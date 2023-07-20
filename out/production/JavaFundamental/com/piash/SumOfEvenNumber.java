package com.piash;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum= sum + (2*i);
        }
        System.out.println("Sum of even number is : " +sum);
    }
}
