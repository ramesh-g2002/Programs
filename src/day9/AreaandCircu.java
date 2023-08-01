package day9;

import java.util.Scanner;

public class AreaandCircu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	double s=sc.nextDouble();
	double area=3.143*s*s;
	double cir=2*3.143*s;
	System.out.println(area+"--> "+cir);
	
}
}
