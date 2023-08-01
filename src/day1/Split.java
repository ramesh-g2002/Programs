package day1;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	String s1="Hello How are you";
	String[] s2=s1.split(" ");
	for(String w:s2)
	{
		System.out.println(w);
	}
	
	/*String[] str= {"Scaler","by","InterviewBit"};
	System.out.println(str);
	String str1=convertArraytoString(str);
	System.out.println("convertArraytoString:"+str1);
}

private static String convertArraytoString(String[] str) {

	return Arrays.toString(str);
}*/
}
}