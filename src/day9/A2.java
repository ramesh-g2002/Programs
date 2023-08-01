package day9;

public class A2 {
public static void main(String[] args) {
	int[][] a= {{2,4,21},{3,4,4},{2,6,34},{3,8,4}};
	int sum=0;
	for(int i=0;i<a[0].length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			sum+=a[j][i];
			//System.out.print(a[i][j]+" ");
		}
		System.out.println("sum of row:"+(i+1)+":" +sum);
	}
	//System.out.println(sum);
	
	
}
}
