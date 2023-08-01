package day6;

public class Factorial {
public static void main(String[] args) {
	int num=145;
	int num1=num;
	int sum=0;
	while(num>0)
	{
		int id=num%10;
		int f=factorial(id);
		sum=sum+f;
		num=num/10;
	}
	if(num1==sum)
	{
		System.out.println("fact");
	}
	else
	{
		System.out.println("not");
	}
}

private static int factorial(int n) {
	// TODO Auto-generated method stub
	int fact=1;
	for(int i=n;i>=1;i--)
	{
		fact=fact*i;
	}
	return fact;
}
}
