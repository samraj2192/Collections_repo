package collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Al = new ArrayList();
		for(int i=1; i<10; i++) {
			Al.add(i);
		}
		System.out.println(Al);
		Iterator I = Al.iterator();
		while(I.hasNext()) {
			Integer j = (Integer) I.next();
			if(j%2!=0) {
				System.out.println(j);
			}
			else {
				I.remove();
			}
		}
		System.out.println(Al);

	}

}
