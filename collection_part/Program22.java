package collection_part;

import java.util.Map;
import java.util.TreeMap;

public class Program22 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new TreeMap<Integer, String>();
		m1.put(12, "Mohan");
		m1.put(18, "jack");
		m1.put(16, "john");
		m1.put(45, "Mohan");
		m1.put(12, "Jethalal");
		System.out.println(m1);
		m1.remove(18);
		System.out.println(m1);

	}

}
