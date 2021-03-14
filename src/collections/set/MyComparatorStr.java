package collections.set;

import java.util.Comparator;

public class MyComparatorStr implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		
		//return s1.compareTo(s2);
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
		//return +1;
		//return -1;
		//return 0;
	}

}
