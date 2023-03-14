package com.piash;

import java.util.Scanner;

public class PrintnNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<=N);
    }
}
