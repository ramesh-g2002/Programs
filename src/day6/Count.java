package day6;

public class Count {
public static void main(String[] args) {
	int i=4224,count=0;
	while(i>0)
	{
		i=i/10;
		count++;
	}
	System.out.println(count);
}
}
