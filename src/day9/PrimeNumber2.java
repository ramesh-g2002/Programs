package day9;

import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the number");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] mat=new int[row][col];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	System.out.println("User entered array");
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			System.out.print(mat[i][j]+" ");
			
		}
		System.out.println( );
	}
	int n=isprimeNumber(mat);
	System.out.println(n);
}

private static int isprimeNumber(int[][] mat) {
	// TODO Auto-generated method stub
	int count=0;
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			boolean rs=isPrime(mat[i][j]);
			if(rs)
				count++;
			
		}
	}
	return count;
}

private static boolean isPrime(int n) {
	// TODO Auto-generated method stub
	for(int i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
}
