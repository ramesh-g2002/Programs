package day1;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int prod=productofDigits(n);
		System.out.println("productofDigits:"+prod);
	}

	private static int productofDigits(int n) {
int prod=1;
do {
	int d=n%10;
	prod=prod*d;
	n=n/10;
}
while(n!=0);
		return prod;
	}

}
