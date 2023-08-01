package day2;

import java.util.Scanner;

public class lastCaps {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	String l=lastCaps(n);
	System.out.println(l);
}

private static String lastCaps(String n) {
char[] ch=n.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
		else if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
}
n=new String(ch);
	return n;
}
}
