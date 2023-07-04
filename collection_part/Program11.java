package collection_part;

import java.util.ArrayList;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(12);
		l1.add(42);
		l1.add(34);
		l1.add(1, 65);
		l1.add(76);
		l1.remove(3);
		l1.add(66);
		l1.remove(1);
		
		System.out.println(l1);
		System.out.println("index of 76 is: " + l1.indexOf(76));

		System.out.println("index of 78 is: " + l1.indexOf(78));

	}

}
