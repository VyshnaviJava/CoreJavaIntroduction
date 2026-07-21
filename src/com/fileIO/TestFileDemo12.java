package com.fileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestFileDemo12 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("employee.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee obj = (Employee) ois.readObject();

        System.out.println("Username : " + obj.username);
        System.out.println("Password : " + obj.password);
        System.out.println("Age : " + obj.age);
        System.out.println("Phone : " + obj.phone);

        ois.close();
        fis.close();
    }
}