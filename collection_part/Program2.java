package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program2 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		System.out.println(c1);
		c1.add(34);
		c1.add(68);
		c1.add(678.67);
		c1.add("mOHAN");
		System.out.println(c1);

		Collection c2 = new ArrayList();
		c2.add(45);
		c2.add(80);
		c2.addAll(c1);
		c2.add(100);

		System.out.println(c2);

	}

}
