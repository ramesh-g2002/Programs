package day4;

import java.util.Scanner;

public class Big {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
int big=isbiggest(x,y,z);
System.out.println(big);
}

private static int isbiggest(int x, int y, int z) {
	if(x>y&&x>z)
		return x;
	if(y>z)
		return y;
		
	return z;
}
}
