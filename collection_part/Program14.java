package collection_part;

import java.util.ArrayList;
import java.util.List;

public class Program14 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		l1.add(17);
		l1.add(34);
		l1.add(7857);
		l1.add(97);
		l1.add(119);
		l1.add(71);
		List l2 = new ArrayList();
		for (int i = 0; i < l1.size(); i++) {
			if (checkPrime(l1.get(i))) {
				l2.add(l1.get(i));
			}
		}
		System.out.println("prime numbers: " + l2);
	}

	public static boolean checkPrime(int n) {
		int factor = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				factor++;
			}
		}
		if (factor == 0) {
			return true;
		} else {
			return false;
		}

	}

}
