package Array;

public class OddSum {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==1)
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
