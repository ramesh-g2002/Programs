package Collection;

import java.util.LinkedList;

public class List17 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.offer(10);
	l1.offer(20);
	l1.offer("hello");
	l1.offer(10);
	System.out.println(l1);
	System.out.println(l1.size());
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
}
}
