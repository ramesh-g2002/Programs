package day7;

import java.util.Scanner;

public class A115 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String s1=swapfl(s);
	System.out.println(s1);
}

private static String swapfl(String s) {
	// TODO Auto-generated method stub
	char[] ch=s.toCharArray();
	int f=0;
	for(int i=0;i<ch.length;i++)
	{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			f=i;
		}
		else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
		{
			char t=ch[i];
			ch[i]=ch[f];
			ch[f]=t;
		}
	}
	s=new String(ch);
	return s;
}
}
