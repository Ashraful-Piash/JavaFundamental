package com.piash;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = 0;

        while (number > 0){
            number /= 10;
            digits ++;
        }
        System.out.println(digits);

    }
}
