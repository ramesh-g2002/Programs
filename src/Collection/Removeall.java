package Collection;

import java.util.ArrayList;

public class Removeall {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(100);
	a2.add(200);
	a2.add(300);
	a2.addAll(a1);
	System.out.println(a2);
	a2.removeAll(a1);
	System.out.println("a1:"+a1);
	System.out.println("a2:"+a2);
	
	


}
}
