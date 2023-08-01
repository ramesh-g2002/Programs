package day9;

import java.util.Scanner;

public class Mainmat1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] mat=new int[row][col];
	for(int i=0;i<mat.length;i++)
	{
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
			
			
		}
	}
	System.out.println("user enter the matrix");
	for(int i=0;i<mat.length;i++)
	{
		for (int j = 0; j < mat[i].length; j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println( );
	}
	System.out.println(sumOfMat(mat));
}

private static int sumOfMat(int[][] mat) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<mat.length;i++)
	{
		for (int j = 0; j < mat[i].length; j++) {
			sum+=mat[i][j];
		}
	}
	return sum;
}
}
