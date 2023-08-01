package day1;

import java.util.Scanner;

public class PerfactNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		boolean per=PerfactNumber(i);
		if(per==true)
			System.out.println("PerfactNumber:"+i);
		
		}
	}

	private static boolean PerfactNumber(int n) {
int sum=0,temp=n;
for(int i=1;i<=n/2;i++)
{
	if(n%i==0)
		sum=sum+i;
		
}
if(sum==temp)
		return true;
else
	return false;
	}
}
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean per=PerfactNumber(n);
		if(per==true)
		System.out.println("PerfactNumber:"+n);
		else
			System.out.println("PerfactNumber is not:"+n);
		
	}

	private static boolean PerfactNumber(int n) {
int sum=0,temp=n;
for(int i=1;i<=n/2;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
}
if(sum==temp)
		return true;
else
return false;
	}

}*/
