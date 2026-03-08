package com.languagefundamentals.constructors;

public class Parameterized {
	String sid;
	String sname;
	int sage;
	
	Parameterized(){
		System.out.println("student no arg constructor called");
	}
	
	//Parameterized constructors
	Parameterized(String sid,String sname,int sage){
		System.out.println("Parameterized constructor called");
		this.sid = sid;
		this.sname = sname;
		this.sage =sage;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		
		Parameterized s1 = new Parameterized("JFS-01","siddu",21);
		s1.show();
		
		Parameterized s2 = new Parameterized("JFS-02","Tilak",22);
		s2.show();
		
		System.out.println("main method started !");
		

	}
	
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println("*************************");
	}

}
