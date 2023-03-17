package com.piash;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StarPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value on n : ");
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
