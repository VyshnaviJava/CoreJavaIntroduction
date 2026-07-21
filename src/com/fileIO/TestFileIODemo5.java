package com.fileIO;

import java.io.File;

public class TestFileIODemo5 {

	public static void main(String[] args) {
		File f = new File("test.txt");
		File[] files=f.listFiles();
		int dirCount=0;
		int fileCount=0;
		int misCount=0;
		
		if(files != null) {
			for(File file: files) {
				if(file.isDirectory()) {
					dirCount++;
				}
				else if(file.isFile()) {
					fileCount++;
				}
				else {
					misCount++;
				}
			}
			System.out.println("Directories:"+dirCount);
			System.out.println("Files:"+fileCount);
			System.out.println("others:"+misCount);
		}else {
			System.out.println("Invalid folder path");
		}
		

}
}
