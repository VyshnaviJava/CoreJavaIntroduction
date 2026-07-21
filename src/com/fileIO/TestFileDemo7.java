package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileDemo7 {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("test.txt");

        BufferedReader br = new BufferedReader(fr);

        String st = br.readLine();

        while(st != null){

            System.out.println(st);

            st = br.readLine();

            Thread.sleep(1000);
        }

        br.close();
        fr.close();
    }
}