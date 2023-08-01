package day1;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		boolean pr=DisariumNumber(i);
		if(pr==true)
		System.out.println("DisariumNumber:"+i);
		//else
		//	System.out.println("DisariumNumber is not:"+i);
		}
	}

	private static boolean DisariumNumber(int n) {

		int dc=countDigis(n);
		int sum=0,temp=n;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+pow(d,dc);
			n=n/10;
			dc--;
		}
		return sum==temp;
	}

	private static int pow(int n, int p) {
		// TODO Auto-generated method stub
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}

	private static int countDigis(int n) {
		// TODO Auto-generated method stub
		int count=0;
		do{
		n=n/10;
		count++;
		}while(n!=0);
		return count;
	}

}
