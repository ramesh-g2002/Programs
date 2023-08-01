package day7;

import java.util.Arrays;
import java.util.Scanner;

public class A13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter");
	int a=sc.nextInt();
	int b1=sc.nextInt();
	System.out.println("Enter the fisrt Array");
	int[] b=new int[a];
	System.out.println("Enter the Secound Array");
	int[] c=new int[b1];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	for(int i=0;i<c.length;i++)
	{
		c[i]=sc.nextInt();
	}
	System.out.println("user enter first array");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	System.out.println("user enter Scecond array");
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
	int[] d=merge(b,c);
	for(int i=0;i<d.length;i++)
	{
		System.out.print(d[i]+" ");
	}
	
	
	
}

private static int[] merge(int[] b, int[] c) {
	// TODO Auto-generated method stub
	int[] d=new int[b.length+c.length];
	for(int i=0;i<b.length;i++)
	{
		d[i]=b[i];
	}
	for(int i=0;i<c.length;i++)
	{
		d[i+b.length]=c[i];
	}
	return d;
}
}
