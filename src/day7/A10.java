package day7;

import java.util.Scanner;

public class A10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=sc.nextInt();
		System.out.println("Enter "+a+" values");
		int[] ar=new int[a];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int b=countprime(ar);
		System.out.println(b);
	}

	private static int countprime(int[] ar) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			boolean rs=isprime(ar[i]);
			if(rs==true)
				count++;
		}
		return count;
	}

	private static boolean isprime(int ar) {
		// TODO Auto-generated method stub
		for(int i=2;i<=ar/2;i++)
		{
			if(ar%i==0)
				return false;
		}
		
		return true;
	}

}
