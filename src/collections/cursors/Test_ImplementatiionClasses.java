package collections.cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test_ImplementatiionClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector V = new Vector();
		Enumeration e = V.elements();
		Iterator i = V.iterator();
		ListIterator LT = V.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(LT.getClass().getName());
				

	}

}
