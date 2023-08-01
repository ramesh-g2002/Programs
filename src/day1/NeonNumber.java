package day1;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean pr=NeonNumber(n);
		if(pr==true)
		System.out.println("NeonNumber:"+n);
		else
			System.out.println("NeonNumber is not:"+n);
		
	}

	private static boolean NeonNumber(int n) {
int sq=n*n,sum=0;
while(sq>0)
{
	int r=sq%10;
	sum=sum+r;
	sq=sq/10;
}
		return sum==n;
	}

}
