package com.fileIO;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args)throws IOException {
		System.out.println("Main method started");
		File f = new File("test.txt"); 
		boolean status = f.createNewFile();
		
		if(status) {
			System.out.println("file has been created");
		}else {
			System.out.println("something went wrong");
		}
	}

}
