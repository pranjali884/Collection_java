package collection;

import java.util.*;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer,String> lang=new LinkedHashMap<>();
		lang.put(1, "java");
		lang.put(2, "spring");
		lang.put(3, "spring");

		
		System.out.println("lang are:"+lang);
		
		//to print key and values
		System.out.println(lang.entrySet());
		
		//to print only keys
		System.out.println(lang.keySet());
		
		//to print only values
		System.out.println(lang.values());
		
		//to check size
		System.out.println("size of: "+lang.size());
		
		//t
		
		
		

	}

}
