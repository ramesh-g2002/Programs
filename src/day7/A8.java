package day7;

import java.util.Scanner;

public class A8 {
	public  int[] readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size");
		int a=sc.nextInt();
		System.out.println("Enter "+a+" values");
		int[] ar=new int[a];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
		
	}

public void display(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println();
}

public int countprime(int[] x) {
	// TODO Auto-generated method stub
	int count = 0;
	for(int i=0;i<x.length;i++)
	{
		boolean rs=isPrime(x[i]);
		if(rs==true)
			count++;
	}
	return count;
}

private boolean isPrime(int n) {
	// TODO Auto-generated method stub
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
		
	}
	return true;
}

public void updateArray(int[] x) {
	// TODO Auto-generated method stub
	for(int i=0;i<x.length;i++)
	{
		int sum=0,v=x[i];
		while(v!=0)
		{
			sum=sum+v%10;
			v=v/10;
		}
		sum=x[i];
	}
	
}
	
		
	
	}
	
	
