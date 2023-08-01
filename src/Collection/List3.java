package Collection;

import java.util.ArrayList;

public class List3 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(15);
		a1.add(true);
		a1.add("hello");
		System.out.println(a1);
		System.out.println(a1.size());
		a1.add(1,3000);
		System.out.println("A1 add:"+a1);
		System.out.println(a1.size());

	}

}
