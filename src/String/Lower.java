package String;

import java.util.Scanner;

public class Lower {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String n=sc.nextLine();
	String s=lowercase(n);
	System.out.println(s);
}

private static String lowercase(String n) {
	// TODO Auto-generated method stub
	char[] ch=n.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='a'&&ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
	}
	String str=new String(ch);
	return str;
}
}
