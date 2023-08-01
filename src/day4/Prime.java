package day4;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
	boolean s=isprime(i);
	if(s)
		System.out.print(i+",");
	}
	//else
	//System.out.println(n+"is not prime");

}

private static boolean isprime(int n) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
