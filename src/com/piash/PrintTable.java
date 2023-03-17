package com.piash;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which table you want to print: ");
        int n = scanner.nextInt();
        for(int i =1 ; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n, i, n*i);
        }
    }
}

