package day7;

import java.util.Scanner;

public class A21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String  s1=" ";
		String[] s2=s.split(" ");
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		s1=s1.trim();
		System.out.println(s1);
		for(int i=0;i<s2.length;i++)
		{
			//System.out.println(s2[i]);
			//System.out.println(s2[i].charAt(0));
			s1=s2[i]+" "+s1;
		}
		s1.trim();
		System.out.println(s1);
		}
}
