package day4;

import java.util.Scanner;

public class Speacail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	boolean rs=isSpcail(n);
	if(rs)
		System.out.println(n+"is specail");
	else
		System.out.println(n+"is not specail");

}

private static boolean isSpcail(int i) {
	int d1=i%10;
	int d2=i/10;
	int sum=d1+d2+d1*d2;
	if(sum==i)
		//System.out.println(i);

	return true;
	else
		return false;
}
}
