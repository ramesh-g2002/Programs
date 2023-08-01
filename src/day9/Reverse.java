package day9;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int s=sc.nextInt();
		int rev=reverse(s);
		System.out.println(rev);
	
	}

	private static int reverse(int s) {
		// TODO Auto-generated method stub
		int rev=0;
		do
		{
			int r=s%10;
			rev=rev*10+r;
			s=s/10;
			
		}
		while(s!=0);
		return rev;
	}

}
