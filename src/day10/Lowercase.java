package day10;

public class Lowercase {
public static void main(String[] args) {
	String s="APPLE";
	char[] c=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A'&&c[i]<='Z')
			c[i]=(char)(c[i]-32);
		
	}
	System.out.println(c);
}
}
