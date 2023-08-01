package Collection;

import java.util.ArrayList;

public class List4 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();

	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(100);
	System.out.println("a1.get(0):"+a1.get(0));
	System.out.println("a1.get(1):"+a1.get(1));
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
}
}
