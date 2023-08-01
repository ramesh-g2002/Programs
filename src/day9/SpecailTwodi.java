package day9;

import java.util.Scanner;

public class SpecailTwodi {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=0;i<=s;i++)
	{
		boolean rs=specail(i);
		if(rs)
			System.out.println(i);
	}
	
}

private static boolean specail(int s) {
	// TODO Auto-generated method stub
	int d1=s/10;
	int d2=s%10;
	int d=d1+d2+d1*d2;
	if(s==d)	
		return true;
	else
	return false;
}
}
