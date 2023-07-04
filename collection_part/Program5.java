package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program5 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(68);
		c1.add(678.67);
		c1.add("mOHAN");
		c1.add(68);
		
		Collection c2 = new ArrayList();
		c2.add(100);
		c2.add(200);
		
		Collection c3 = new ArrayList();
		c3.add(70);
		c3.add(170);
		
		Collection c4 = new ArrayList();
		c4.add(400);
		c4.add(440);
		c1.addAll(c2);
		c1.addAll(c3);
		c1.addAll(c4);
		
		System.out.println(c1);
		
		c1.retainAll(c4);
		System.out.println(c1);

	}

}
