package day9;

import java.util.Scanner;

public class ArmStrong {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int s=sc.nextInt();
	for(int i=0;i<=s;i++)
	{
		boolean rs=isArmStrong(i);
		
		if(rs)
			System.out.println(i);
	}
}

private static boolean isArmStrong(int i) {
	// TODO Auto-generated method stub
	int sum=0,temp=i;
	do {
		int d=i%10;
		sum+=d*d*d;
		i=i/10;
	}
	while(i!=0);
	if(temp==sum)
		return true;
	else
	return false;
}
}
