package com.piash;

import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int num;
    do {
        num = sc.nextInt();
        sum += num;
        //done
    } while(num >= 0);
    System.out.println("Sum is : " +sum);
    }
}
