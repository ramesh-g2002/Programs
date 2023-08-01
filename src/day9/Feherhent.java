package day9;

import java.util.Scanner;

public class Feherhent {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Celeius");
	double cel=sc.nextDouble();
	double fer=(cel*1.8)+32;
	double celeius=(fer-32)*5/9;
	System.out.println(fer+"-->"+celeius);
}
}
