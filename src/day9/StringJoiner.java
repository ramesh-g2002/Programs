package day9;

public class StringJoiner {
public static void main(String[] args) {
	java.util.StringJoiner sj1=new java.util.StringJoiner(",");
	sj1.add("Apple");
	sj1.add("Ball");
	sj1.add("Cat");
	System.out.println(sj1);
	java.util.StringJoiner sj2=new java.util.StringJoiner(":");
    sj2.add("Peek");
    sj2.add("Queen");
    System.out.println(sj2);
    sj1.merge(sj2);
    System.out.println(sj1);
}
}
