package day1;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		boolean pr=SpyNumber(i);
		if(pr==true)
		System.out.println("SpyNumber:"+i);
		
		//else
			//System.out.println("SpyNumber is not:"+n);
		
	}}

	private static boolean SpyNumber(int n) {
int sum=0,prod=1;
do {
	int d=n%10;
	sum=sum+d;
	prod=prod*d;
	n=n/10;
}
while(n!=0);
if(sum==prod)
		return true;
else
	return false;
	}

}
