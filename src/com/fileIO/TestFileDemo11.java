package com.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{

    private static final long serialVersionUID = 1L;

    String username = "Srikanth";
    transient String password = "Javaissimple@3";
    int age = 22;
    long phone = 9999999999L;
}

public class TestFileDemo11 {

    public static void main(String[] args) throws IOException {

        Employee emp = new Employee();

        FileOutputStream fos = new FileOutputStream("employee.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);

        oos.close();
        fos.close();
    }
}