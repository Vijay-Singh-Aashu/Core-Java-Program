package collection_part;

import java.util.ArrayList;
import java.util.List;

public class Program12 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(12);
		l1.add(42);
		l1.add(34);
		l1.add(57);
		l1.add(42);
		
		System.out.println("FOR EACH LOOP ==============");
		for (Object x : l1) {
			System.out.println(x);
		}
		
		System.out.println("=====FOR LOOP ACCESS===========");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}

}
