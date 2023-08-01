package day4;

import java.util.Scanner;

public class Perfect {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
	boolean s=isperfact(i);
	if(s)
		System.out.println(i+"is perfact");
	}
	//else
	//System.out.println(n+"is not perfact");

}

private static boolean isperfact(int n) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
	return sum==n;
}

}
