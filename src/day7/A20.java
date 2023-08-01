package day7;

import java.util.Scanner;

public class A20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first String");
	String s=sc.nextLine();
	System.out.println("Enter second String");
	String s1=sc.nextLine();
	boolean rs=isAnagram(s,s1);
	if(rs==true)
		System.out.println(s+" is Anagram");
	else
		System.out.println(s+" is not Anagram");

		
	
}

private static boolean isAnagram(String s, String s1) {
	// TODO Auto-generated method stub
	int[] c1=countfreq(s);
	int[] c2=countfreq(s1);
	for(int i=0;i<26;i++)
	{
		if(c1[i]!=c2[i])
			return false;
	}
	return true;
}

private static int[] countfreq(String s) {
	// TODO Auto-generated method stub
	int[] count=new int[26];
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&&ch<='Z')
			count[ch-65]++;
		else if(ch>='a'&&ch<='z')
			count[ch-97]++;
	}
	return count;
}
}
