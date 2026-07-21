package com.logicalstatements01;

import java.util.Scanner;

public class TestLSDemo8 {

	public static void main(String[] args) {
		
		System.out.println("Cricketer info");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a jersey number to get the details");
		int jno = sc.nextInt();
		
		switch(jno) {
		case 7 :
			System.out.println("Thala for a reason");
			System.out.println("The one & only the best capital mr.dhoni");
			break;
			
		case 18 :
			System.out.println("THe king kohli");
			System.out.println("The most consistent player");
			break;
		case 45 :
			System.out.println("The HIT man");
			System.out.println("A good captain and also a good hitter");
			break;
		default :
			System.out.println("entered jersey no details not added here");
		}
	}

}