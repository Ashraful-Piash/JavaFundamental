package com.piash;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: ");
        int n  = sc.nextInt();
        System.out.println("Values of array: ");
        int [] arr = new int[n];
        for(int i = 0; i<n; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of key: ");
        int key = sc.nextInt();
        int ans = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == key){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
