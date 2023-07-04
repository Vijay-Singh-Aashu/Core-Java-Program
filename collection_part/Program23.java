package collection_part;

import java.util.Map;
import java.util.TreeMap;

public class Program23 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new TreeMap<Integer, String>();
		m1.put(12, "Mohan");
		m1.put(18, "jack");
		m1.put(16, "john");
		m1.put(45, "Mohan");
		m1.put(12, "Jethalal");

		System.out.println("============access Key===========");
		for (Integer x : m1.keySet()) {
			System.out.println(x);
		}

		System.out.println("============access values===========");
		for (String x : m1.values()) {
			System.out.println(x);
		}

		System.out.println("============access Entry===============");
		for (Map.Entry<Integer, String> x : m1.entrySet()) {
			System.out.println(x.getKey() + " : " + x.getValue());
		}

	}

}
