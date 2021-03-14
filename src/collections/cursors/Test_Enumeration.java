package collections.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Test_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		for(int i=1; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			Integer i = (Integer) en.nextElement();
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
