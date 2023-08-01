package day4;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int s=countdigits(n);
	System.out.println(s);
	
}

private static int countdigits(int n) {
	int count=0;
	do
	{
		n=n/10;
		count++;
	}
	while(n!=0);
	return count;
}
}
