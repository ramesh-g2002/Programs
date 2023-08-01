package day1;

public class First {
public static void main(String[] args) {
	String s1="Hello how are you";
	String[] s2=s1.split(" ");
	/*for(int i=0;i<s2.length;i++)
	{
		System.out.println(s2[i].charAt(0));
	}*/
	for(String s:s2)
	{
		System.out.println(s.charAt(0));
	}
}
}
