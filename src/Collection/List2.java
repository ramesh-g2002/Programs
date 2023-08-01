package Collection;

import java.util.ArrayList;

public class List2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(14);
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(30);
	a2.add(40);
	a2.addAll(a1);
	System.out.println(a2.size());
	System.out.println(a2);

}
}
