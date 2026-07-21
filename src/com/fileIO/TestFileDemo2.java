package com.fileIO;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args)throws IOException {
		System.out.println("main method started");
		
		File f = new File("test.txt");
		boolean isExist = f.exists();
		
		if(!isExist) {
			f.createNewFile();
			System.out.println("file has createdd");
		}else {
			System.out.println("already available");
		}
	}

}
