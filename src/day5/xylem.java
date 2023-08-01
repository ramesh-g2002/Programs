package day5;

import java.util.Scanner;

public class xylem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	String s=isxylem(n);
	System.out.println(s);
}

private static String isxylem(int n) {
	// TODO Auto-generated method stub
	int l=n%10;
	n=n/10;
	int sum=0;
	while(n>9)
	{
		
		int d=n%10;
		sum=sum+d;
		n=n/10;
	}
		int es=l+n;
	if(sum==es)
	return "xylem";
	else
		return "phlem";
}
}
