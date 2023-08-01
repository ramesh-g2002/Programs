package day1;

public class ReverseString {
public static void main(String[] args) {
	/*String s="Ramesh";
	int len=s.length();
	System.out.println(len);
	String rev=" ";
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	rev=rev.trim();
	System.out.println(rev.length());

	System.out.println(rev);*/
	String s="java";
	String s1=" ";
	for(int i=0;i<s.length();i++)
	{
		s1=s.charAt(i)+s1;
	}
	System.out.println(s1.length());

	s1=s1.trim();
	System.out.println(s1);
	System.out.println(s1.length());
}
}
