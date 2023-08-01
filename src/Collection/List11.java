package Collection;

import java.util.Vector;

public class List11 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(10);
	v1.addElement("hello");
	v1.add(20);
	v1.add(30);
	v1.add(30);
	System.out.println(v1);
	System.out.println(v1.size());
	for(Object i:v1)
	{
		System.out.println(i);
	}
	v1.removeElement(20);
	System.out.println(v1);
	System.out.println("elementAt:"+v1.elementAt(1));
	System.out.println(v1.get(0));
	System.out.println("firstElement:"+v1.firstElement());
	System.out.println("lastElement:"+v1.lastElement());
	v1.removeAllElements();
	System.out.println(v1);
	System.out.println();
}
}
