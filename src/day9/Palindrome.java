package day9;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	boolean p=isPalindrome(s);
	if(p)
		System.out.println(s+ " is palindrome");
	else
		System.out.println(s+ " is not palindrome");
}

private static boolean isPalindrome(String s) {
	// TODO Auto-generated method stub
	int i=0,j=s.length()-1;//madam
	while(i<j)//0-4/
	{
		if(s.charAt(i)!=s.charAt(j))
		{
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
