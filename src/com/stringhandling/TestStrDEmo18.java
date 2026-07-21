package com.stringhandling;

public class TestStrDEmo18 {

    public static void main(String[] args) {

        System.out.println("main method started");

        // Remove leading and trailing spaces
        String str = "      Java       is simple       ";

        System.out.println(str);

        str = str.trim();
        System.out.println(str);

        str = str.replaceAll("\\s", "");
        System.out.println(str);

        // substring()

        String str1 = "Hyderabad";

        System.out.println(str1.substring(0, 3));
        System.out.println(str1.subSequence(0, 3));

        int i = 100;
        char c = 'A';
        double sal = 500000.00;
        String str2 = "Srikanth";

        // Primitive to String

        String i1 = String.valueOf(i);
        String sal1 = String.valueOf(sal);

        System.out.println(100 + i);
        System.out.println(100 + i1);
        System.out.println(100000.00 + sal1);

        String i2 = "100";

        System.out.println(100 + i2);

        // String to int

        int i3 = Integer.parseInt(i2);
        System.out.println(100 + i3);

        // String to long

        String ph = "9972677655";
        long ph1 = Long.parseLong(ph);

        System.out.println(ph1);
    }
}