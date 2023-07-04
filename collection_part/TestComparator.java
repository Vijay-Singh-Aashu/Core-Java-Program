package collection_part;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	public static void main(String[] args) {
		// Creating a list of students
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(101, "Vijay", 23));
		al.add(new Students(106, "Ajay", 27));
		al.add(new Students(105, "Jai", 21));

		System.out.println("sorting by RollNo");
		// Using AgeComparator to sort the elements
		Collections.sort(al, new RollNoComparator());
		// Travering the list again
		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by Name");
		// Using NameComparator to sort the elements
		Collections.sort(al, new NameComparator());
		// Traversing the elements of list
		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by Age");
		// Using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		// Travering the list again
		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
