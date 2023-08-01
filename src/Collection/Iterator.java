package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Welcome");
	a1.add("to");
	a1.add("Helo");
	a1.add("bye");
	ListIterator<String> a2=a1.listIterator();
	while(a2.hasNext())
	{
		System.out.println(a2.next());
	}
	
}
}
