package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer>d1=new ArrayDeque<Integer>();
		d1.add(1);
		d1.add(200);
		d1.add(150);
		System.out.println("list :"+d1);
		
		d1.offerFirst(350);
		System.out.println("list is"+d1);
		
		d1.offerLast(400);
		System.out.println("list: "+d1);
		
		d1.addFirst(160);//add element in first position
		System.out.println("list: "+d1);
		
		d1.addLast(320);
		System.out.println("list: "+d1);

	}

}
