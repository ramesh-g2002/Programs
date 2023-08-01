package Array;

public class Split {
public static void main(String[] args) {
	String d1="Hello how are you";
	//String[] d2=d1.split(" ");
	String d2=" ";
	for(int i=0;i<d2.length();i++)
	{
		//System.out.println(d2[i].charAt(0));
		//d3=d2[i]+" "+d3;
		//d3=d1.charAt(i)+d3;
		d2=d1.charAt(i)+" "+d2;
	}
	System.out.println(d2);
}
}
