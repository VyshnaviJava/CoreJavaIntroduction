package com.fileIO;

import java.io.File;
import java.io.IOException;

public class TestFileDemo3 {

	public static void main(String[] args)throws IOException  {
		File f = new File("test.txt");
		System.out.println(f.isDirectory());//checks whether the path is folder or not
		System.out.println(f.isFile());//check whether the path is file
		System.out.println(f.getAbsolutePath());//returns the complete path as a string
		System.out.println(f.getAbsoluteFile());//returns the complete path as a file object
		System.out.println(f.getCanonicalPath());//returns real path after removing the symbols
		System.out.println(f.getCanonicalFile());//same but as returns file object
		System.out.println(f.getFreeSpace());//returns the amount of free disk space
		System.out.println(f.getTotalSpace());//returns the amount of total size of the disk
		System.out.println(f.getUsableSpace());//returns the space that java can actually use
		
		boolean status= f.mkdir();
		
		if(status) {
			System.out.println("Directory created");
		}else {
			System.out.println("already exists");
		}

	}

}
