package day9;

import java.util.ArrayList;
import java.util.Collections;

public class Max {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(24);
	a.add(2131);
	a.add(3);
	a.add(2);
	Integer s = Collections.max(a);
	Integer min = Collections.min(a);
	Collections.sort(a);
	System.out.println(a);
	Collections.reverse(a);
	System.out.println(a);
	System.out.println(s);
	System.out.println(min);
}
}
