package Collection;

import java.util.PriorityQueue;

public class List18 {
public static void main(String[] args) {
	PriorityQueue p1=new PriorityQueue();
	p1.add(210);
	p1.add(20);
	p1.add(330);
	p1.add(40);
	System.out.println(p1);
	while(!(p1.isEmpty()))
	{
		System.out.println(p1.poll());
	}
}
}

