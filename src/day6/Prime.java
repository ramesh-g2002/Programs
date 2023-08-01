package day6;

public class Prime {
public static void main(String[] args) {
	int n=6;
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==n)
		System.out.println("per");
	else
		System.out.println("not");
}
}
