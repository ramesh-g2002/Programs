package Collection;

import java.util.LinkedList;

public class List20 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.offer(10);
		l1.offer(20);
		l1.offer(30);
		l1.offer(40);
		System.out.println(l1);
		while(!(l1.isEmpty()))
		{
			System.out.println(l1.poll());
		}
		
	}

}
