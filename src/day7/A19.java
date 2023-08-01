package day7;

import java.util.Scanner;

public class A19 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	boolean rs=ispangram(s);
	if(rs=true)
		System.out.println(s+" is pangram");
	else
		System.out.println(s+" is not pangram");

}

private static boolean ispangram(String s) {
	// TODO Auto-generated method stub
	if(s.length()<26)
	return false;
	s=s.toLowerCase();
	for(char ch='a';ch<='z';ch++)
	{
		if(s.indexOf(ch)==-1)
			return false;
	}
	return true;
}
}
