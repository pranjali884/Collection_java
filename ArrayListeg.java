package collection;

import java.util.ArrayList;

public class ArrayListeg {

	public static void main(String[] args) {
		
		ArrayList <String>li=new  ArrayList();
		li.add("first");
		li.add("second");
		li.add("third");
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("size of array: "+li.size());
	}

}
