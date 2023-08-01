package day8;

public class A8 {
public static void main(String[] args) {
	int a=1432;
	int en = 0,on = 0;
	while(a>0)
	{
		int i=a%10;
		if(i%2==0)
	en+=i;
		else
			on+=i;
		a=a/10;
	}
	System.out.println("even: "+en);
	System.out.println("odd: "+on);
}
}
