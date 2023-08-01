package day5;

import java.util.Scanner;

public class F {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	
	int f=0,s=1,t=0;
	System.out.println(f+" "+s);
	while(true)
	{
		t=f+s;
		if(t>n)
			break;
		System.out.println(t);
		f=s;
		s=t;
	}
}
}
