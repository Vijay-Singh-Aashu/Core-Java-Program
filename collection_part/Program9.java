package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program9 {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();
		System.out.println(c1.hashCode());
		Collection c2 = new ArrayList();
		System.out.println(c2.hashCode());
		c1.add(34);
		c1.add(68);
		c1.add(67);
		c1.add(197);
		c1.add(68);

		int sum = 0;
		Object[] x = c1.toArray();
		for (int i = 0; i < x.length; i++) {
			System.out.println((Integer) x[i] + 10);
		}

	}

}
