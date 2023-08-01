package day9;

import java.util.Scanner;

public class Prefect {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=1;i<=s/2;i++)
	{
		boolean rs=isPerfect(i);
		if(rs)
			System.out.println(i+" is perfect number");
	}
	
	//else
		//.out.println(s+" is not a perfect number");
}

private static boolean isPerfect(int s) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=1;i<=s/2;i++)
	{
		if(s%i==0)
			sum+=i;
	}
	if(sum==s)
	return true;
	else
		return false;
}
}
