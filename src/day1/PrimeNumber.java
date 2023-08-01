package day1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean pr=PrimeNumber(n);
		if(pr==true)
		System.out.println("PrimeNumber:"+n);
		else
			System.out.println("PrimeNumber is not:"+n);
		
	}

	private static boolean PrimeNumber(int n) {
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
			
		}
		return true;
	}
}
