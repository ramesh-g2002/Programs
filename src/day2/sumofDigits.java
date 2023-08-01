package day2;

import java.util.Scanner;

public class sumofDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	String n=sc.nextLine();
	int s=sumofDigits(n);
	System.out.println(s);
}

private static int sumofDigits(String n) {
int sum=0;
for(int i=0;i<n.length();i++)
{
	char ch=n.charAt(i);
	if(ch>='0'&&ch<='9')
	{
		sum=sum+ch-48;
	}
}	return sum;

}
}
