package com.piash;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCommonElements {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the first array
            System.out.print("Enter the size of the first array: ");
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            System.out.print("Enter the elements of the first array: ");
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }

            // Read the second array
            System.out.print("Enter the size of the second array: ");
            int m = scanner.nextInt();
            int[] arr2 = new int[m];
            System.out.print("Enter the elements of the second array: ");
            for (int i = 0; i < m; i++) {
                arr2[i] = scanner.nextInt();
            }

            // Generate the third array with common elements
            ArrayList<Integer> commonElements = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr1[i] == arr2[j]) {
                        commonElements.add(arr1[i]);
                        break;
                    }
                }
            }

            // Convert the ArrayList to an array
            int[] arr3 = new int[commonElements.size()];
            for (int i = 0; i < commonElements.size(); i++) {
                arr3[i] = commonElements.get(i);
            }

            // Print the third array
            System.out.println("The third array with common elements:");
            System.out.println(Arrays.toString(arr3));
        }
    }

