package collection;

public class StringCompareToeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java compareTo() method example";
		String str1 = "Java compareTo() method example";
		String str2 = "this is Java compareTo() method example";
		String str3 = "Java CompareTo() Method Example";
		String str4 = "a Java compareTo() method example";
		String str5 = new String("Java compareTo() method example");

		// comparing the str and str1 strings
		System.out.println(str.compareTo(str1));

		// comparing the str and str2 strings
		System.out.println(str.compareTo(str2));

		// comparing the str and str3 strings
		System.out.println(str.compareTo(str3));

		// comparing the str and str4 strings
		System.out.println(str.compareTo(str4));

		// comparing the str string and str5 string object
		System.out.println(str.compareTo(str5));
		}
		

	}


