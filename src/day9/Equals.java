package day9;

import java.util.HashSet;

public class Equals {
public static void main(String[] args) {
	int[] a= {2,3 ,4,5};
	int[] b= {9,7,3,4};
	HashSet< Integer> h=new HashSet<Integer>();
	
	for(int i=0;i<a.length;i++)
	{
		h.add(a[i]);
		
	}
	for (int j = 0; j < b.length; j++) {
		if(h.contains(b[j]))
			System.out.print(b[j]+" ");
		
	}
	
	
}
}
