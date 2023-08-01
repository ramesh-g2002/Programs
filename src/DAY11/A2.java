package DAY11;

import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	double rad=sc.nextDouble();
	double area=3.143*rad*rad;
	double circumference=2*3.143*rad;
	System.out.println("area:"+area);
	System.out.println("circumference:"+circumference);
}
}
