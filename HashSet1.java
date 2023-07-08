package collection;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(2);
		h1.add(30);
		h1.add(50);
		System.out.println("list h1: "+h1);
		
		HashSet<Integer>h2= new HashSet<Integer>();
		h2.add(30);
		h2.add(90);
		h2.add(70);
		System.out.println("list h2: "+h2);
		
		h1.addAll(h2);
		System.out.println("list after adding: "+h1);
		
		h1.retainAll(h2);
		System.out.println("after retain list: "+h1);
		
		h1.removeAll(h2);
		System.out.println("list"+h1);
		
	}

}
