package DAY11;

import java.util.Scanner;

public class A7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	double c=sc.nextDouble();
	double f=(c*1.8)+32;
	System.out.println("Farenheit:"+f);
	float Farenheit,celsius;
	Farenheit=43;
	celsius=((Farenheit-32)*5)/9;
	System.out.println("celsius:"+celsius);
}
}
