package day10;

import java.util.Scanner;

public class CountCSNS {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	String s=sc.nextLine();
	int c = 0,sm=0,n=0,sp=0;

	for(int i=0;i<s.length();i++)
	{
		char c1=s.charAt(i);
		
		if(c1>='A'&&c1<='Z')
			c++;
		else if(c1>='a'&&c1<='z')
			sm++;
		else if(c1>='0'&&c1<='9')
			n++;
		else
			sp++;
		
		
	}
	System.out.println("cap:"+c);
	System.out.println("small:"+sm);
	System.out.println("number:"+n);
	System.out.println("specail:"+sp);
}
}
