package DAY11;

import java.util.Scanner;

public class A4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	double s=sc.nextDouble();
	double area=s*s;
	double perimeter=4*s;
	System.out.println("area:"+area);
	System.out.println("perimeter:"+perimeter);
}
}
