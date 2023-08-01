package day7;

import java.util.Scanner;

public class A22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String[] s1=s.split(" ");
	String s2=" ";
	for(int i=0;i<s1.length;i++)
	{
		s2=s1[i]+" "+s2;
	}
	s2.trim();
	System.out.println(s2);
}
}
