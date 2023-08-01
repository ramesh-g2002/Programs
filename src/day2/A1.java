package day2;

public class A1 {
public static void main(String[] args) {
	String s1="java";
	System.out.println(s1.length());
	System.out.println(s1.charAt(0));
	System.out.println(s1.charAt(3));
	System.out.println(s1.indexOf('j'));
	System.out.println(s1.indexOf('g'));
	char[] ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(i+"-->"+ch[i]);
	}
	char[] c= {'r','a','m','e','s','h'};
	String s2=new String(c);
	System.out.println(s2);

}
}
