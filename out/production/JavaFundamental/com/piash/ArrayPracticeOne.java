package com.piash;

import java.util.Arrays;

public class ArrayPracticeOne {
    public static void main(String[] args) {
        int N = 10;
        int [] squares = new int[N];
        for(int i = 1; i <=N; i++){
            squares[i-1]= i*i;
        }
        System.out.println(Arrays.toString(squares));
    }
}
