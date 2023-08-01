package day2;

import java.util.Scanner;

public class Lower {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	String c=lowerCase(n);
	System.out.println(c);
}

private static String lowerCase(String n) {
char[] ch=n.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(ch[i]>='A'&&ch[i]<='Z')
		ch[i]=(char)(ch[i]+32);
}
n=new String(ch);
	return n;
}
}
