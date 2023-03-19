package com.piash;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        boolean found = false;
        for(int num:arr){
            if(num == key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
