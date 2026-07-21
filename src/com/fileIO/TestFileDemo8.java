package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo8 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("test.txt");

        fw.write(65);
        fw.write('\n');
        fw.write("Have a nice day");
        fw.write('\n');
        fw.write("Files concepts are crazy!");

        fw.flush();
        fw.close();
    }
}