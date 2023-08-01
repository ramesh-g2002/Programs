package day8;

public class A7 {
public static void main(String[] args) {
	int a=2544;
	int id;
	while(a>0)
	{
		id=a%10;
		if(id%2==1)
		{
			System.out.println(id);
		}
		a=a/10;
	}
}
}
