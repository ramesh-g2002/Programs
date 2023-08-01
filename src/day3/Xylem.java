package day3;

import java.util.Scanner;

public class Xylem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=sc.nextInt();
	String r=isxylem(n);
	System.out.println(r);
}

private static String isxylem(int n) {
int l=n%10;
n=n/10;
int sum=0;
while(n>9)
{
	int d=n%10;
	sum=sum+d;
	n=n/10;
}
int es=l+n;
if(es==sum)
	return "Xylem number";
else
	return "Phloem number";
}
}
