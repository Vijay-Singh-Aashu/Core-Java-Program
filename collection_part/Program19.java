package collection_part;

import java.util.LinkedList;
import java.util.Queue;

public class Program19 {

	public static void main(String[] args) {
		Queue q1 = new LinkedList();
		q1.add(56);
		q1.add(57);
		q1.add(568);
		q1.add(58);
		q1.add(100);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);

	}

}
