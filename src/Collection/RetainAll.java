package Collection;

import java.util.ArrayList;

public class RetainAll {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(300);
	a1.add(4000);
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(10);
	a2.add(20);
	a2.add(30);
	a2.add(40);
	System.out.println(a2.containsAll(a1));
	System.out.println(a2);
	a2.retainAll(a1);
	System.out.println("retainall:"+a2);

}
}
