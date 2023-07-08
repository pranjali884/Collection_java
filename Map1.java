package collection;

import java.util.HashMap;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {

		HashMap<Integer,String> names=new HashMap<>();
		names.put(1, "sanju");
		names.put(1, "vedu");
		names.put(2, "ahista");
		names.put(3, "vedu");
		System.out.println("elements are: "+names);
		
		names.putIfAbsent(4, "pranjali");
		System.out.println("new element: "+names);
		
		System.out.println(names.containsKey(2));
		
		System.out.println(names.containsKey(0));
		
		System.out.println("size of :"+names.size());
		
		HashMap<Integer, String> stuid;
		Set<Integer> keySet = names.keySet();
        
        for (Integer key : keySet) 
        {
            System.out.println(key);
        }
		
		
	
	}

}
