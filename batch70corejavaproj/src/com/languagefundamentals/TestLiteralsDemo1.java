package com.languagefundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		
		
         //Decimal Literals : Base is 10 --->0 to 9 numbers we can store here.
         int a1 = 123;
         int a2 = 56789;
        		 
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("*******************");
        
        //Octal Literals : Any number starts with 0 will consider as octal.
        //Base is 8-->0 to 7 numbers we can store here.
        
        int a3 = 0123;
        //0 1*8^2+ 2*8^1 +3*8^0 = 64 + 16 + 3=83
        
        int a4 = 0345;
        //0 3*8^2+ 4*8^1+ 5*8^0 = 192 + 32 + 5 = 229
        
        int a5 = 0674;
        int a6 = 0775;
        System.out.println(a3);//83
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println("*******************");
        //Hexa Decimal Literlas : base is 16-->0 to 9 & a-f 0rA-F-->a=10,b=11,c=12,d=13,e=14,f=15
        //Hexa Decimal Literals,we can represent with 0x or 0X
        int a7 = 0x123;
        
        //1*16^2 2*16^1 +3*16^0
        int a8 = 0x567;
        int a9 = 0x6789;
        int a10 = 0xabc;
        int a11 = 0x1a2b3c;
        int a12 = 0xDAD;//valid bcoz up to f is applicable
        //int a13 = 0xBeer;//Invalid bcoz of r token used 
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);
        System.out.println(a11);
        System.out.println(a12);
        //System.out.println(a13);
        System.out.println("*****************");
        //Binary Literals-->Base 2 -->0 to 1
        int a14 = 0b1010;
        //1*2^3+ 0*2^2 +1*2^1 +0*2^0
        int a15 = 0b10111;
        int a16 = 0b1100;
        
        System.out.println(a14);
        System.out.println(a15);
        System.out.println(a16);
        
        
        
        
        
        
        
	}

}
