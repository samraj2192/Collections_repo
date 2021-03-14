package Deafult_customized_sorting_customized_Classes;

import java.util.Comparator;

public class Employee implements Comparable {
	String name ;
	int id ;
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	 public String toString() {
		return name + "__" + id;
	 }
	 
	 public int compareTo(Object obj) {
		 int id1 = this.id;
		 Employee e = (Employee)obj;
		 int id2 = e.id;
		 
		 if(id1 < id2) {
			 return -1;
		 }
		 else if(id1 > id2) {
			 return +1;
		 }
		 else
			 return 0;
	 }
	 
	

}
