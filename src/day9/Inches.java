package day9;

import java.util.Scanner;

public class Inches {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of inches");
	double i=sc.nextDouble();
	double feet=i/12;
	System.out.println(feet);
	double inches=feet*12;
	System.out.println(inches);
	
}
}
