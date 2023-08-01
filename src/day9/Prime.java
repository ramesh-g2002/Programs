package day9;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=2;i<=s/2;i++)
	{
		boolean rs=isPrime(i);
		if(rs)
			System.out.println(i+" is prime number");
	}
	
	//else
		//.out.println(s+ " is not a prime number");
}

private static boolean isPrime(int s) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=2;i<=s/2;i++)
	{
		if(s%i==0)
			return false;
	}
	return true;
}
}
