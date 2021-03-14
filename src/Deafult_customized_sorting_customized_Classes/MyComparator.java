package Deafult_customized_sorting_customized_Classes;

import java.util.Comparator;

public class MyComparator implements Comparator {
	 public int compare(Object obj1, Object obj2) {
		 Employee e1 = (Employee) obj1;
		 String s1 = e1.name;
		 Employee e2 = (Employee) obj2;
		 String s2 = e2.name;
		 
		 return s1.compareTo(s2);
	 }

}
