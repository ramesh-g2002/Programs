package day9;

import java.util.Scanner;

public class BigSmall2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int[][] mat=new int[row][col];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	System.out.println("user enter array");
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println( );
	}
	int big=isBiggest(mat);
	int s=isSmallest(mat);
	System.out.println(big+"-->"+s);
}

private static int isSmallest(int[][] mat) {
	// TODO Auto-generated method stub
	int small=mat[0][0];
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			if(mat[i][j]<small)
				small=mat[i][j];
		}
	}
	return small;
}

private static int isBiggest(int[][] mat) {
	// TODO Auto-generated method stub
	int big=0;
	for(int i=0;i<mat.length;i++)
	{
		for (int j = 0; j < mat[i].length; j++) {
			if(mat[i][j]>big)
				big=mat[i][j];
		}
	}
	return big;
}
}
