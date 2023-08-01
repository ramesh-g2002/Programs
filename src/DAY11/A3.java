package DAY11;

import java.util.Scanner;

public class A3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	double width=sc.nextDouble();
	double length=sc.nextDouble();
	double area=width*length;
	double perimeter=2*(width+length);
	System.out.println("area:"+area);
	System.out.println("perimeter:"+perimeter);


}
}
