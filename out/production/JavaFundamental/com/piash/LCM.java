package com.piash;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a: ");
        int a = sc.nextInt();
        System.out.println("Give b: ");
        int b = sc.nextInt();
        int lcm = findLCM(a,b);
        System.out.println("LCM of " + a + " and " + b
                + " is " + lcm);
        sc.close();
    }
    public static int findLCM(int a, int b)
    {
        int greater = Math.max(a, b);
        int smallest = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % smallest == 0)
                return i;
        }
    }
}
