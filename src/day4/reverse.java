package day4;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int r=revesre(n);
	System.out.println(r);
}

private static int revesre(int n) {

	int rev=0;
	do{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	while(n!=0);
	return rev;
}
}
