package day7;

import java.util.Scanner;

public class A5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the size");
	int a=sc.nextInt();
	int[] b=new int[a];
	System.out.println("enter "+a+" values");
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
		
	}
	int sm=issum(b);
	System.out.println("sum "+sm);
}

private static int issum(int[] b) {
	int sum=0;
	for(int i=0;i<b.length;i++)
	{
		sum+=b[i];
	}
	return sum;
}
}
