package day7;

import java.util.Scanner;

public class A18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	boolean rs=ispolidrome(s);
	if(rs==true)
		System.out.println(s+" is polidrome");
	else
		System.out.println(s+" is not polidrome");

}

private static boolean ispolidrome(String s) {

String b=""; 	int j=s.length();
	for(int i=j-1;i>=0;i--)
	{
		b=b+s.charAt(i);
		if(s.equalsIgnoreCase(b))
			return true;
	}
	return false;
}

}
