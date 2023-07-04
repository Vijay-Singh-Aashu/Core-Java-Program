package collection_part;

import java.util.Comparator;

public class NameComparator implements Comparator<Students> {

	public int compare(Students s1, Students s2) {
		return s1.name.compareTo(s2.name);
	}
}
