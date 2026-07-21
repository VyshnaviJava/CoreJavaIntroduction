package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.next();

        int arr[] = new int[127];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int max = -1;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (arr[str.charAt(i)] > max) {

                max = arr[str.charAt(i)];
                maxChar = str.charAt(i);

            }
        }

        System.out.println("Maximum Occurrence Character is : " + maxChar);

        sc.close();
    }
}