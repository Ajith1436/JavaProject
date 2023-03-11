package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("John");
		list1.add("Ajith");
		list1.add("Shilpa");
		list1.add("Manu");
	//list1.add(null);

		System.out.println("The list is " + list1);
		System.out.println("The Size of list is " + list1.size());
		System.out.println("The First Name in list is " + list1.get(0));
		System.out.println("The Last Name in list is " + list1.get(list1.size() - 1));
		list1.add(0, "King");
		System.out.println("The list is " + list1);
		list1.set(1, "Unni");
		System.out.println("The list is " + list1);
		list1.remove(2);
		System.out.println("The list is " + list1);

		// Iterate through the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("The Name in list is " + list1.get(i));
		}
		System.out.println("For each Loop");

		for (String val : list1) {
			System.out.println("The Name in List is " + val);
		}
		System.out.println("Printing using Iterator");
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println("Name is " + itr.next());
		}
		// the below method will only work, when we have an unsorted list
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("The Reversed list is " + list1);

		// the below method is used to sort a list
		Collections.sort(list1);
		System.out.println("The Sorted list is " + list1);

		// the below method will only work, when we have a sorted list
		Collections.reverse(list1);
		System.out.println("The Reversed list is " + list1);
	}

}
