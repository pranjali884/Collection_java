package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ankita");
		list.add(0, "Vaishnavi");
		list.add(null);
		list.add("Shivani");
		list.add(2, "Shreya");
		System.out.println("List of elements: " + list);
		System.out.println("Length of list: " + list.size());
		System.out.println("Get value from list: " + list.get(0));
		System.out.println("Set value into list: " + list.set(2, "Nikita"));
		System.out.println("List of elements: " + list);
		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		String arr[] = list.toArray(new String[0]);
		System.out.println("Array of elements: " + list);
		//Enhance for loop(for each)
		for (String s : arr) {
			System.out.println(s);
		}
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }

	}
	}





