package com.languagefundamentals;

//char Literals
//string Literals
//Boolean Literals
//Null Literals
public class TestLiteralsDemo3 {

	public static void main(String[] args) {
	 
		System.out.println("main method started");
		
		//int a = null;//invalid//Type mismatch:cannot convert from null to int
		//null is a literal, we can store for only object datatypes whenever we dont want to share any values. 
		
		
		
		String s = null;
		Integer i1 = null;
		TestLiteralsDemo3 t1 = null;
		
		t1 = new TestLiteralsDemo3();
		
		//In boolean we can store either true or false nothing else.
		boolean boo = true;
		boolean boo1 = false;
		
		if(boo) {
			System.out.println("Good mrng have a nice day");
		}
		
		if(boo1) {
			System.out.println("Good afternoon");
		}
		
		//collection of characters storing into double quotes will consider as string
		String s1 = "Vyshnavi";//string Literals-->Scp; string constant pool
		String s2 = "Vyshnavi";
		String s3 = new String("Vyshnavi");//heap area directly
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		//character can store 0 to 65535
		char c1 = 'A';//single Quote character
		char c2 = 65;//ASCII values
		char c3 = '\u0040';//unicode characters
		char c4 =126;
		char c5 = 655;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

	}

}
