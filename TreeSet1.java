package collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <String> t1=new TreeSet<String>();
		t1.add("java");
		t1.add("spring");
		t1.add("hibernate");
		t1.add("boot");
		System.out.println("names are: "+t1);
		
		t1.pollFirst();
		System.out.println("list is:" +t1);
		
		t1.pollLast();
		System.out.println("list is: "+t1);
		
		t1.ceiling("java");
		System.out.println("after ceiling list is: "+t1);
		
		t1.higher("hibernet");//it will print words after that word
		System.out.println("list is: "+t1);
		
		t1.lower("boot");//it will print words before that word
		System.out.println("list is: "+t1);
		

	}

}
