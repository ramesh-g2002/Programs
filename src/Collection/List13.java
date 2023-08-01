package Collection;

import java.util.HashSet;

public class List13 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	System.out.println(h1.add(10));
	System.out.println(h1.add(20));
	System.out.println(h1.add("Hello"));
	System.out.println(h1.add(30));
	System.out.println(h1.add(10));
	for(Object a:h1)
	{
		System.out.println(a);
	}
}
}
