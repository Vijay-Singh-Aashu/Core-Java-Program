package collection_part;

import java.util.LinkedList;

public class Program7 {

	public static void main(String[] args) {
		LinkedList c1 = new LinkedList();
		c1.add(23);
		c1.add(45);
		c1.add(45.78);
		c1.add(78.99);
		c1.add("Mohan");
		c1.add(null);
		c1.add(null);
		c1.add(2, 56);
		c1.add(5, 568);
		c1.add(9, 78);

		for (int i = 0; i < c1.size(); i++) {
			System.out.println(c1.get(i));
		}
		
	}

}
