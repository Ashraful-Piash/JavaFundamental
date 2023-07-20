package com.piash;

import java.util.Scanner;

public class FirstNOddNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i ++){
            System.out.println("first n odd numbers are: "+  ( 2*i+1));
        }
    }
}
