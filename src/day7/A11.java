package day7;

import java.util.Arrays;
import java.util.Scanner;

public class A11 {
	public static void main(String[] args) {
		A8 a=new A8();
		int[] x = a.readArray();
		System.out.println("user enter array");
		a.display(x);
	a.updateArray(x);
	System.out.println("After update");
	a.display(x);
}
}