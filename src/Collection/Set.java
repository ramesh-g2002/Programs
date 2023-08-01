package Collection;

import java.util.ArrayList;

public class Set {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	a1.set(1, 2000);
	System.out.println(a1);
}
}
