package day7;

import java.util.Scanner;

public class A7 {
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
		int[] sm=iscount(b);
		System.out.println("even "+sm[0]);
		System.out.println("odd "+sm[1]);
	}

	private static int[] iscount(int[] b) {
		int ec=0,oc=0,sum=0,sum1=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				sum=sum+b[i];
			}
			else {
				sum1=sum1+b[i];
			}
			
		}
		int[] count= {sum,sum1};
		
		return count;
	}

}
