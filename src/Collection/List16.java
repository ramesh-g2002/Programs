package Collection;

import java.util.LinkedHashSet;

public class List16 {
public static void main(String[] args) {
	LinkedHashSet l1=new LinkedHashSet();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add("heloo");
	System.out.println(l1);
	for(Object a:l1)
	{
		System.out.println(a);
	}
	
}
}
