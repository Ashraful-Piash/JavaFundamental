package com.piash;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digits = 0;
        while(num>0){
            num /= 10;
            digits ++;
        }
        System.out.println("Digits of number are: "+digits);
    }
}
