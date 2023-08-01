package day7;

import java.util.Scanner;

public class A3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int ar=sc.nextInt();
	int[] a=new int[ar];
	System.out.println("Enter "+a+" size ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("user enter the array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
