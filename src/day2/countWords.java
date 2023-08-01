package day2;

import java.util.Scanner;

public class countWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	int count=countWords(n);
	System.out.println(count);
}

private static int countWords(String n) {
int count=0;
char[] ch=n.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')	
	count++;
}
	return count;
}
}
