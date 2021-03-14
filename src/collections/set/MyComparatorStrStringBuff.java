package collections.set;

import java.util.Comparator;

public class MyComparatorStrStringBuff implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String S1 = obj1.toString();
		String S2 = obj2.toString();
		int l1 = S1.length();
		int l2 = S2.length();
		
		if(l1>l2)
			return -1;
		else if(l1<l2)
			return +1;
		else
			return S1.compareTo(S2); //normal alphabetical order
		
	}

}
