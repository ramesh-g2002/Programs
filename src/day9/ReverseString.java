package day9;

public class ReverseString {
public static void main(String[] args) {
	String s="Test Automation Control";
	char[] c=s.toCharArray();
	String rev=" ";
	for(int i=c.length-1;i>=0;i--)
	{
		rev=rev+c[i];
	}
	System.out.println(rev);
}
}
