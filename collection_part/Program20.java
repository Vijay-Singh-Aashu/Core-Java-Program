package collection_part;

import java.util.HashMap;
import java.util.Map;

public class Program20 {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put(12, "Mohan");
		m1.put(18, "jack");
		m1.put(16, "john");
		m1.put("Sohan", "Mohan");

		m1.put(12, "Jethalal");
		System.out.println(m1);

	}

}
