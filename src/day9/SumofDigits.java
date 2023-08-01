package day9;

import java.util.Scanner;

public class SumofDigits {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value");
	int s=sc.nextInt();
	int s1=issumofdigits(s);
	System.out.println(s1);
}

private static int issumofdigits(int s) {
	// TODO Auto-generated method stub
	int sum=0;
	do
	{
		int d=s%10;
		sum=sum+d;
		s=s/10;
		
	}
	while(s!=0);
	return sum;
}
}
