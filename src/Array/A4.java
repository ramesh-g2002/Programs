package Array;

public class A4 {
public static void main(String[] args) {
	char[] a= {'k','a','p','a','y'};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]=='a')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
