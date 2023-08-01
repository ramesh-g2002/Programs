package day1;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	boolean r=isStrongNumber(i);
	if(r==true)
		System.out.println("StrongNumber:"+i);
	//else
	//	System.out.println("StrongNumber");
	
}}

private static boolean isStrongNumber(int n) {
int sum=0,t=n;
while(n>0)
{
	int r=n%10;
	sum=sum+fact(r);
	n=n/10;
}
	return sum==t;
}

private static int fact(int r) {
int f=1;
while(r>0)
{
	f=f*r;
	r--;
}
	return f;
}
}
