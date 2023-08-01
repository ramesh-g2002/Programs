package day9;

import java.util.Scanner;

public class Xylem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=0;i<=s;i++) {
		String rs=isxylem(i);
		if(rs=="Xylem")
		{
			System.out.println(i+" is Xylem");
		}
	}
	
	/*else
	{
		System.out.println(s+" is phloam number");
	}*/
}

private static String isxylem(int s) {
	// TODO Auto-generated method stub
	int r=s%10;
	s=s/10;
	int sum=0;
	while(s>9)
	{
		int d=s%10;
		sum+=d;
		s=s/10;
	}
	int es=r+s;
	if(sum==es)
		return "Xylem";
	else
		
	return "Phloem";
}
}
