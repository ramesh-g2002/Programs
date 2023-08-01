package day2;

import java.util.Scanner;

public class Speacial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	int cl=0,sl=0,dc=0,spc=0;
	for(int i=0;i<n.length();i++)
	{
		char ch=n.charAt(i);
		if(ch>='A'&& ch<='Z')
		{
			cl++;
		}
		else if(ch>='a'&&ch<='z')
		{
			sl++;
		}
		else if(ch>='0'&&ch<='9')
		{
			dc++;
		}
		else
			spc++;
	}
	System.out.println("number of cap:"+cl);
	System.out.println("number of small:"+sl);
	System.out.println("number of digit:"+dc);
	System.out.println("number of Specal:"+spc);



}
}
