package day2;

import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	int vc=0,c=0;
	for(int i=0;i<n.length();i++)
	{
		char ch=n.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vc++;
		}
		else
			c++;
	}
	System.out.println("Number of vowels:"+vc);
	System.out.println("Number of constants:"+c);

}
}
