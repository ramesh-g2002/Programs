package Array;

public class A2 {
public static void main(String[] args) {
	int[] a=new int[4];
	a[0]=5;
	a[1]=6;
	a[2]=7;
	a[3]=8;
	//a[4]=9;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
	System.out.println(a[i]);
		}
	}
}
}
