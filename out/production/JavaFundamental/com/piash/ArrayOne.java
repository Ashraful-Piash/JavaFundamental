package com.piash;

import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
                arr [i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i ++ ){
            System.out.println("At index " + i + " Value: " + arr[i]);
        }
    }
}
