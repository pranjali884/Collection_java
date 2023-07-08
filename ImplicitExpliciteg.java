package collection;

public class ImplicitExpliciteg {

	public static void main(String[] args) {

		System.out.println("implicit/widening type convrsion");
		//smaler to bigger datatypes
		//byte->short->int->double->long
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		System.out.println("byte value: "+b);
		System.out.println("short value: "+s);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
		
		System.out.println("explicit/narrowing type conversions: ");
		//double->int->short->byte
		double dl=23.20;
		float fl=(float)dl;
		long l1=(long)fl;
		int i1=(int)l1;
		short s1=(short)i1;
		byte b1=(byte)s1;
		
		System.out.println("double value: "+dl);
		System.out.println("float: "+fl);
		System.out.println("long: "+l1);
		System.out.println("int: "+i1);
		System.out.println("short value: "+s1);
		System.out.println("byte value: "+b1);
		
	}

}
