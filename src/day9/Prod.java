package day9;

import java.util.Scanner;

public class Prod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
			int s=sc.nextInt();
			int p=prodOfDigits(s);
			System.out.println(p);
			
}

private static int prodOfDigits(int s) {
	// TODO Auto-generated method stub
	int prod =1;
	do {
		int r=s%10;
		prod*=r;
		s=s/10;
		
	}
	while(s!=0);
	return prod;
}
}
