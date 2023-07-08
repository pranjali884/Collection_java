package collection;

import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector<String> ve=new Vector<>();
		ve.add("guddi");
		ve.add("dada");
		System.out.println("list1: "+ve);

		Vector<String> vf=new Vector<>();
		vf.add("mona");
		vf.add("aba");
		System.out.println("list2: "+vf);
		
		ve.addAll(vf);
		System.out.println(ve);
		
	}

}
