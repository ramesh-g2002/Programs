package day9;

public class SecondLargestArray {
public static void main(String[] args) {
	int[] a= {5,2,4, 222,123 ,4353};
	int first=a[0],second=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>first)
		{
			//second=first;
			first=a[i];
			
		}
		else if(a[i]>second)
		{
			second=a[i];
		}
	}
	System.out.println(second);
	System.out.println(first);
}
}
