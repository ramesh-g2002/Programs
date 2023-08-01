package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class List9 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();

	a1.add(100);
	a1.add(15);
	a1.add(56);
	a1.add(30);
	System.out.println("before sorting:"+a1);
	System.out.println("Size:"+a1.size());
	Collections.sort(a1);
	System.out.println("After Sorting:"+a1);
	Collections.reverse(a1);
	System.out.println("Reverse:"+a1);
}
}
