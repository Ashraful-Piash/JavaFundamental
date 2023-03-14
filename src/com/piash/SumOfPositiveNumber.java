package com.piash;

import java.util.Scanner;
//Given a stream of number. Read the numbers till you find a -ve(negative) number. And print their sum of numbers read so far
public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do{
            num = sc.nextInt();
            sum += num;
        }while (num>=0);
        System.out.println("sum :" +sum);
    }

}
