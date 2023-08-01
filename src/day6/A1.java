package day6;

public class A1 {
public static void main(String[] args) {
	int a =165136;
	while(a>0)
	{
		int d=a%10;
		if(d%2==1)
		{
			System.out.println(d);
		}
		a=a/10;
	}
}
}
