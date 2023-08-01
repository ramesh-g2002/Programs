package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List10 {
public static void main(String[] args) {
	LinkedList a1=new LinkedList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(10);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.addFirst(100);
	a1.addLast("hello");
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	a1.removeFirst();
	a1.removeLast();
	System.out.println(a1);
	System.out.println(a1.size());
}
}
