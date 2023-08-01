package day1;

import java.util.Scanner;

public class Biggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int big=Biggest(n);
		System.out.println("Biggest:"+big);
	}

	private static int Biggest(int n) {

		int big=0;
		do {
			int d=n%10;
			if(d>big)
				big=d;
			n=n/10;
		
			
		}
		while(n!=0);
		return big;
	}

}
