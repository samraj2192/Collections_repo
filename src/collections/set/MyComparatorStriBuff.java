package collections.set;

import java.util.Comparator;

public class MyComparatorStriBuff implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String S1 = obj1.toString();
		String S2 = obj2.toString();
		return S1.compareTo(S2);
		
	}

}
