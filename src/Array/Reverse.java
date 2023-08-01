package Array;

import java.util.Arrays;

public class Reverse {
public static void main(String[] args) {
	int[] a= new int[]{1,-3,5,-1,4,-2};
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
}
}
