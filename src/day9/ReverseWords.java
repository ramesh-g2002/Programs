package day9;

public class ReverseWords {
public static void main(String[] args) {
	String s="Hello my Name Ramesh";
	String[] sp=s.split(" ");
	String rev=" ";
	for(int i=0;i<sp.length;i++)
	{
		if(i==sp.length-1)
			rev=sp[i]+rev;
		else
			rev=" "+sp[i]+rev;
		
	}
	
	System.out.println(rev);
}
}
