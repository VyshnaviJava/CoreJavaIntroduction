package com.stringhandling;

import java.util.Scanner;

//(Q) WAP to print String in Reverse Order ..? 5 ways
//(Q) WAP to find the Given String is Palindrome or not ...?
//using charAt

public class TestStrDemo6 {

    public static void main(String[] args) {

        System.out.println("main method started ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ");
        String str = sc.next(); // Java --> 0 1 2 3

        String rev = "";

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " "); // J a v a

            rev = str.charAt(i) + rev; // avaJ
        }

        System.out.println("Reverse String : " + rev);

        if (str.equalsIgnoreCase(rev)) {

            System.out.println("The Given String is Palindrome !");

        } else {

            System.out.println("The Given String is not a Palindrome !");
        }

    }
}