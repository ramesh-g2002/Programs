package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class List14 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add(13);
	h1.add(2);
	h1.add(33);
	h1.add(2);
	System.out.println(h1);
	ArrayList a1=new ArrayList(h1);
	Collections.sort(a1);
	for(Object i:a1)
	{
		System.out.println("sort:"+i);
	}
	

}
}
