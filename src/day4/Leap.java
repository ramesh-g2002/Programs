package day4;

import java.util.Scanner;

public class Leap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		//boolean rs=isleap(i);
		if((i%4==0&&i%100!=0)||(i%400==0))
			System.out.println(i);
	}
	}

//private static boolean isleap(int i) {
	
		//System.out.println(i+"is leap");
	//else
		//System.out.println(i+" is not leap");
	//return true;
}

