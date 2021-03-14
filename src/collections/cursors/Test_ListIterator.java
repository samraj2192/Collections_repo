package collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L = new LinkedList();
		L.add("GB_Bazar");
		L.add("LakeChowmuni");
		L.add("Asthabal");
		L.add("ColonelChowmuni");
		L.add("Gurkhbasti");
		L.add("KrishnaNagar");
		System.out.println(L);
		
		ListIterator LT = L.listIterator();
		while(LT.hasNext()) {
			String S = (String) LT.next();
			if(S.equals("GB_Bazar")) {
				LT.remove();
			}
			else if(S.equals("Asthabal")) {
				LT.add("Udaipur");
			}
			else if(S.equals("Gurkhbasti")) {
				LT.set("JaiNagar");
			}
		}
		System.out.println(L);

	}

}
