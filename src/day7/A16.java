package day7;

import java.util.Scanner;

public class A16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String s1=lastcap(s);
	System.out.println(s1);
}

private static String lastcap(String s) {
	// TODO Auto-generated method stub
char[]	ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
		else if(ch[i]>'A'&&ch[i]<'Z')
			ch[i]=(char)(ch[i]+32);
		//if(i==0&&ch[i]!=' '||ch[i]!=' '&& ch[i-1]==' ')
}
s=new String(ch);
	return s;
}
}
