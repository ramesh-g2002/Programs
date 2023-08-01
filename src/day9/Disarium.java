package day9;

import java.util.Scanner;

public class Disarium {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=0;i<=s;i++)
	{
		boolean rs=isdisarium(i);
		if(rs)	
			System.out.println(i+" is a disarium number");
	}
	
	//else
		//System.out.println(s+" is not a disarium number");
		
}

private static boolean isdisarium(int s) {
	// TODO Auto-generated method stub
	int dc=countDigit(s);
	int sum=0,temp=s;
	while(s!=0)
	{
		int d=s%10;
		sum+=pow(d,dc);
		s=s/10;
		dc--;
	}
	if(sum==temp)
	return true;
	else
		return false;
}

private static int pow(int d, int dc) {
	// TODO Auto-generated method stub
	int prod=1;
	while(dc>0)
	{
	prod*=d;
	dc--;
	}
	return prod;
}

private static int countDigit(int s) {
	// TODO Auto-generated method stub
	int count=0;
	do {
		s=s/10;
		count++;
	}
	while(s!=0);
	return count;
}
}
