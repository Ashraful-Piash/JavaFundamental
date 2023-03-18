package com.piash;

import java.util.Scanner;

public class ArrayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i = 0; i< arr.length; i++){
                arr [i] = sc.nextInt();
        }
        System.out.println(arr[0]);
        System.out.println(arr[3]);

    }
}
