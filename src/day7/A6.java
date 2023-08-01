package day7;

import java.util.Scanner;

public class A6 {
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
	int[] sm=isbig(b);
	System.out.println("big "+sm[0]);
	System.out.println("small "+sm[1]);
}

private static int[] isbig(int[] b) {
	int big=b[0],small=b[1];
	for(int i=0;i<b.length;i++)
	{
		if(b[i]>big)
		{
			big=b[i];
		}
		 else if(b[i]<small)
		 {
			 small=b[i];
		 }
			
	}
	int[] count= {big,small};
	return count;
}

}

