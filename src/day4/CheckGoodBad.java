package day4;

import java.util.Scanner;

public class CheckGoodBad {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	String rs=Checkgb(n);
	System.out.println(rs);
}

private static String Checkgb(int n) {
	// TODO Auto-generated method stub
	int es=0,os=0;
	do {
		int d=n%10;
		if(d%2==0)
			es=es+d;
		else
			os=os+d;
	}
	while(n!=0);
	if(es==os)
	return "good";
	else
		return "bad";
	
}
}
