package day1;

import java.util.Scanner;

public class SumofPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			if(r==1||r==2||r==3||r==5||r==7)
				sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
}
}
