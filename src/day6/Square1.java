package day6;

public class Square1 {
	public static void main(String[] args) {
		
	
	int i=1,sum=0;
	while(i<10)
	{
		if(i%2==1)
		{
		int a=i*i;
		sum=sum+a;
		}i++;
	}System.out.println(i+"---->"+sum);

}}
