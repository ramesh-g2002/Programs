package day9;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of square");
	double s=sc.nextDouble();
	double area=s*s;
	double per=4*s;
	System.out.println(area+"-->"+per);
	
}
}
