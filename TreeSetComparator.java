package collection;


import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetComparator {
    public static void main(String[] args) {

       
        TreeSet<String> animals = new TreeSet<String>(new CustomComparator());
        animals.add("Elephant");
        animals.add("Dog");
        animals.add("Zebra");
        animals.add("zebBa");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("TreeSet: " + animals);
    }


    public static class CustomComparator implements Comparator<String> {

        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);

            // elements are sorted in reverse order
            if (value <0) {
                return -1;
            }
            else if (value > 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}