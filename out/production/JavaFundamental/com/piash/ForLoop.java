package com.piash;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter N numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxValue = Integer.MIN_VALUE;
        for(int i = 1; i<=n; i++){
            int current = sc.nextInt();
            maxValue = Math.max(current,maxValue);
        }
        System.out.println(maxValue);
    }
}

