package collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Pranju");
		list.add( "Vaishnavi");
		list.add("sanju");
		list.add("Shivani");
		list.add(2, "Shreya");
		System.out.println("List of elements: " + list);
		
		 list.addFirst("Anju");
		 list.addLast("vedu");
		 System.out.println("List of elements: " + list);
		 
		list.removeFirst();
		list.removeLast();
		System.out.println("List of elements: " + list);
		
		list.getFirst();
		list.getLast();
		System.out.println("List of elements: " + list);
		
		System.out.println("Length of list: " + list.size());
		
		System.out.println("Get value from list: " + list.get(0));
		
		System.out.println("Set value into list: " + list.set(2, "Nikita"));
		
		System.out.println("List of elements: " + list);
		
		System.out.println("Remove element from list: " + list.remove(0));
		System.out.println("List of elements: " + list);
	}

}
