package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program4 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(68);
		c1.add(678.67);
		c1.add("Mohan");
		c1.add(68);
		c1.add(120);
		c1.add(200);

		Collection c2 = new ArrayList();
		c2.add(68);
		c2.add(100);
		c2.add("Mohan");

		c1.removeAll(c2);
		System.out.println(c1);
		System.out.println(c2);

	}

}
