package Collection;

import java.util.ArrayList;

public class List7 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add("hello");
	a1.add(20);
	System.out.println(a1);
	int a=(Integer)(a1.get(0));
	System.out.println(a);
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.add(30);
	a2.add(40);
	a2.add(50);
	System.out.println(a2);
	int b=a2.get(0);
	System.out.println(b);

}
}
