package day1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rev=ReverseNumber(n);
		System.out.println("ReverseNumber:"+rev);
	}

	private static int ReverseNumber(int n) {
int rev=0;
do {
	int d=n%10;
	rev=rev*10+d;
	n=n/10;
}
while(n!=0);
		return rev;
	}

}
