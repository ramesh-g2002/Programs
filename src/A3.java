import java.util.Scanner;

public class A3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	double n=sc.nextInt();
	driver(n);
}

private static void driver(double n) {
	String[] s= {"TOI","HINDU","ET","BM","HT"};
	double[] TOI= {3.0,3.0,3.0,3.0,3.0,5.0,6.0};
	double[] HINDU= {2.5,2.5,2.5,2.5,2.5,4.0,4.0};
	double[] ET= {4,4,4,4,4,4,10};
	double[] BM= {1.5,1.5,1.5,1.5,1.5,1.5,1.5,};
	double[] HT= {2,2,2,2,2,4,4};
	double[] sum= {sumof(TOI),sumof(HINDU),sumof(ET),sumof(BM),sumof(HT)};
	for(int i=0;i<sum.length-1;i++)
	{
		for(int j=i+1;j<sum.length;j++)
		{
			double d=sum[i]+sum[j];
			if(n>=d)
			{
				System.out.print("{\""+s[i]+"\" ,"+"\""+s[j]+"\"}"+",\"");

			}
		}
	}
	
	// TODO Auto-generated method stub
	
}


private static double sumof(double[] arr) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	
	return sum;
}
}