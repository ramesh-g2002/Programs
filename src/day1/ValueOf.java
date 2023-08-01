package day1;

public class ValueOf {
	public static void main(String[] args) {
		char[] ch= {'b','y','e'};
		String s=new String(ch);
		System.out.println(s);
		char[] s2= {'h','e','l','l','o'};
		String s3=String.valueOf(s2);
		System.out.println(s3);
		
	}

}
