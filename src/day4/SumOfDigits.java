package day4;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int s=sum(n);
	System.out.println(s);
}

private static int sum(int n) {
int sum=0;
do
{
	int d=n%10;
	sum=sum+d;
	n=n/10;
}
while(n!=0);
	return sum;
	
}
}
