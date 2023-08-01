package Collection;

import java.util.ArrayList;

public class Iterator1 {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Welcome");
	a1.add("to");
	a1.add("Helo");
	a1.add("bye");
      java.util.Iterator<String> i=a1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
