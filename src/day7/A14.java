package day7;

import java.util.Scanner;

public class A14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the String");
	String s=sc.nextLine();
	int[] a=new int[26];
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z')
			a[ch-65]++;
		else if(ch>='a'&&ch<='z')
			a[ch-97]++;
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
			System.out.println((char)(i+65)+"-->"+a[i]);
			
	}
}
}
