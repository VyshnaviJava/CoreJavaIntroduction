package com.languagefundamentals;

//Floating Literals
//byte -->short-->int-->long-->float--->double

public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		

		float f1 = 100;
	    float f2 = 0123;// octal-->int-->float(valid)
		float f3 = 123F;//valid float represented by F
		//float f4 = 123.5;//invalid bcoz double cannot convert to float
		float f5 = 123.5F;
		float f6 = 0x123;// hexa-->int-->float
		//float f7 = 0123.5;//invalid
		float f7a = 0123.5F;//valid float -->float, not octal here
		//float f8 = 0x123.5F;// invalid hexa literal
		float f9 = 0x123F;// valid hexa-->int-->float
		float f10 = 1230.5F;
		
		
		System.out.println(f1);//100.0
		System.out.println(f2);//83.0
		System.out.println(f3);//123.0
		//System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);//291.0
		//System.out.println(f7);
		System.out.println(f7a);
		//System.out.println(f8);
		System.out.println(f9);
		System.out.println(f10);
	}

}
