package day2;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String n=sc.nextLine();
		boolean rs=isPolindrome(n);
		if(rs==true)
			System.out.println("String is polindrome:"+n);
		else
			System.out.println("String is not polindrome:"+n);

	}

	private static boolean isPolindrome(String n) {
int i=0,j=n.length()-1;
while(i<j)
{
	if(n.charAt(i)!=n.charAt(j))
		return false;
	i++;
	j--;
}
		return true;
	}
}
