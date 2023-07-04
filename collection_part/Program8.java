package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program8 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(68);
		c1.add(67);
		c1.add(197);
		c1.add(68);

		System.out.println("Size is: " + c1.size());
		System.out.println(c1.isEmpty());
		System.out.println("================");

		for (Object x : c1) {
			Integer r = (Integer) x;
			if (r % 2 == 0) {
				System.out.println(r);
			}
		}

	}

}
