package day9;

import java.util.Scanner;

public class Recangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
	double length=sc.nextDouble();
	System.out.println("Enter the width");
	double width=sc.nextDouble();
	double area=length*width;
	double per=2*(length+width);
	System.out.println(area+"-->"+per);
	
}
}
