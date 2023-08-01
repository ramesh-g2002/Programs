package day9;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	System.out.println("Second String");
	String s1=sc.nextLine();
	if(isAnagram(s,s1))
	{
		System.out.println(s+ " is Angaram "+ s1);
	}
	else
	{
		System.out.println(s+ " is Not Angaram "+ s1);
	}
}

private static boolean isAnagram(String s, String s1) {
	// TODO Auto-generated method stub
	if(s.length()!=s1.length())
		return false;
	char[] a = s.toCharArray();
	char[] a1=s1.toCharArray();
	Arrays.sort(a);
	Arrays.sort(a1);
	return Arrays.equals(a, a1);
	
}
}
