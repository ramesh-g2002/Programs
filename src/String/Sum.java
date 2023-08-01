package String;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String n=sc.nextLine();
		int str=sumofDigits(n);
		System.out.println(str);
	}

	private static int sumofDigits(String n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;

		}
		return sum;
	}
}
