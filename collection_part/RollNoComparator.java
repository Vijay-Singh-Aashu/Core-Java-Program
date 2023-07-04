package collection_part;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		if (s1.rollno == s2.rollno)
			return 0;
		else if (s1.rollno > s2.rollno)
			return 1;
		else
			return -1;
	}

}
