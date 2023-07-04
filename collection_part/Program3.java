package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program3 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(34);
		c1.add(68);
		c1.add(678.67);
		c1.add("mOHAN");
		c1.add(68);

		System.out.println(c1);
		System.out.println(c1.remove(68));
		System.out.println(c1.remove(70));
		System.out.println(c1);

	}

}
