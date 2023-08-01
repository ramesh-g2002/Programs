package Collection;

import java.util.ArrayList;

public class List5 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20.3);
	a1.add(true);
	a1.add("hello");
	System.out.println(a1);
	System.out.println("A1 size:"+a1.size());
	a1.remove("hello");
	System.out.println("Remove:"+a1);
	a1.remove(new Integer(10));
	System.out.println(a1);

}
}
