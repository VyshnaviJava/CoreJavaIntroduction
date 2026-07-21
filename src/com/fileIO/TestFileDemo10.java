package com.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileDemo10 {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("test2.txt");

        pw.println("Hello");
        pw.println(100);
        pw.println(55.5);
        pw.println(5.5f);
        pw.println('C');

        pw.flush();
        pw.close();
    }
}