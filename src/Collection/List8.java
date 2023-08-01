package Collection;

import java.util.ArrayList;

public class List8 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(10.8);
	a1.add(true);
	a1.add("false");
	
	for(Object i:a1)
	{
		System.out.println(i);
	}

}
}
