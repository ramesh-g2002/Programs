package Collection;

import java.util.ArrayList;

public class List1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println(a1.isEmpty());
	a1.add(10);
	a1.add(10.5);
	a1.add(true);
	a1.add("Hello");
	System.out.println(a1);//[10, 10.5, true, Hello]
	System.out.println(a1.size());//4
	System.out.println(a1.isEmpty());//false
	a1.add(20);
	a1.add(10);
	System.out.println("a1 List:"+a1);//a1 List:[10, 10.5, true, Hello, 20, 10]
	System.out.println("size:"+a1.size());//6
	ArrayList a2=new ArrayList();
	a2.add(50);
	a2.add(60);
	a2.add(a1);
	System.out.println("a2:"+a2);//[50, 60, [10, 10.5, true, Hello, 20, 10]]
	System.out.println(a2.size());//3
	a2.addAll(a1);
	System.out.println("a2 addall:"+a2);
	System.out.println(a2.size());



	
	

}
}
