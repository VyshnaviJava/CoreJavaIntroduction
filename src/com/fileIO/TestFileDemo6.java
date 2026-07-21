package com.fileIO;

import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo6 {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("test.txt");

        int i = fr.read();

        while(i != -1){

            System.out.print((char)i);

            i = fr.read();

            Thread.sleep(500);
        }

        fr.close();
    }
}