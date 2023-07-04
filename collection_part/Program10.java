package collection_part;

import java.util.ArrayList;
import java.util.Collection;

public class Program10 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		c1.add(34);
		c1.add(68);
		c2.add(34);
		System.out.println(c1.equals(c2));
		
		c2.add(68);
		System.out.println(c1.equals(c2));
		c2.add(null);
		c2.add(100);
		System.out.println(c2);

	}

}
