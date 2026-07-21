package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {
		
		String s1 = "Java";//String Literals---->SCP :String Constant Pool
		String s2 = "Java";//0 objects
		String s3 = "Java";//0 objects
		
		String s4 = new String("Srikanth");//String object Literal---->Heap Area + Scp-->2 objects
		String s5 = new String("Srikanth");//String object Literal---->Heap Area + Scp-->1 objects
        String s6 = "Srikanth";//string Literals--->SCP-->0 objects
        
        String s7 = new String(s6);//1 object : creating object with another String
        String s9 = s5;//Re-assigning and creating string
        
        String s8 = s6 + s3;//concatenation operator//SrikanthJava
	}

}
