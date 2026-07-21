package com.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo9 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("test.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(65);
        bw.write(66);
        bw.newLine();

        bw.write("Chill");
        bw.newLine();

        bw.write("Try to be Active");
        bw.newLine();

        bw.write("Focus on Learning");

        bw.flush();

        bw.close();
        fw.close();
    }
}