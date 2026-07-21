package com.stringhandling;

import java.util.Arrays;
import java.util.Scanner;

public class TestStrDemo20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First String");
        String s1 = sc.next();

        System.out.println("Enter another String");
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("The Given Strings are not anagram");
            sc.close();
            return;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("The Given Strings are anagram");
        } else {
            System.out.println("The Given Strings are not anagram");
        }

        sc.close();
    }
}