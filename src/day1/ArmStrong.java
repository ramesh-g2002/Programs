package day1;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		for(int i=100;i<=500;i++)
		{
			boolean rs=armstroong(i);
			if(rs)
				System.out.println("armstroong:"+i);
		}
	}

	private static boolean armstroong(int i) {
int sum=0,temp=i;
do {
	int d=i%10;
	sum=sum+d*d*d;
	i=i/10;
	
}
while(i!=0);
if(sum==temp)
	return true;
else
		return false;
	}
		
	}
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean arm=ArmStrong(n);
	
		if(arm)
		System.out.println("ArmStrong:"+n);
		else
			System.out.println("arm");
	}

	private static boolean ArmStrong(int n) {
int sum=0,temp=n;
do {
	int d=n%10;
	sum=sum+d*d*d;
	n=n/10;
}
while(n!=0);
if(sum==temp)
		return true;
else
	return false;
	}}*/


