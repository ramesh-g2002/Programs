package day7;

import java.util.Scanner;

public class A23 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int amt=sc.nextInt();

	nw(amt/100000000,"cores");
	nw(amt/100000%1000,"lakhs");
	nw(amt/1000%100,"thousand");
	nw(amt/100%10,"handard");
	nw(amt%100," ");
	
}

private static void nw(int i, String string) {
	// TODO Auto-generated method stub
	String[] x= {" ","one","two","three","four","five","six","seven","eight","nine","ten","elevine","tewleve","thirteen","fourten","fiveteen","sixtenn","seventeen","eighttenn","nineteen"};
	String[] y= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eightty","ninety"};
	if(i<20)
	
		System.out.print(x[i]+" ");
	else
		System.out.print(y[i/10]+x[i%10]+" ");
	if(i!=0)
		System.out.print(string+" ");
	}
	
}
