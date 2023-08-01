package day9;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int s1=sc.nextInt();
	int f=0,s=1,t=0;
	System.out.println(f+" "+s);
	while(true)
	{
		t=f+s;
		if(t>s1)
			break;
		System.out.print(" "+t);
		f=s;
		s=t;
	}
}
}
