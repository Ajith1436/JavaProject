package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Saneer");
		set1.add("Eldho");
		set1.add("Manjoose");
		set1.add("Manju");
		set1.add("Anju");
		set1.add(null);
		set1.add("Eldho");
		System.out.println("The HashSet values are "+set1);
		
		set1.remove(2);
		System.out.println("The HashSet values are "+set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Felix");
		set2.add("Shine");
		set2.add("Manu");
		set2.add("Karthik");
		set2.add("Jijo");
		System.out.println("The Tree Set values are "+set2);
		
		
		//Convert HashSet to a ArrayList
		ArrayList<String> list2 = new ArrayList<String>(set1);
		System.out.println("The Converted HashSet to a ArrayList values are "+list2);
		
		//Convert TreeSet to a ArrayList
		ArrayList<String> list3 = new ArrayList<String>(set2);
		System.out.println("The Converted TreeSet to ArrayList values are "+list3);
		
		//Convert HashSet to a TreeSet
		//TreeSet<String> set3 = new TreeSet<String>(set1);
		//System.out.println("The HashSet values are "+set3);
		
		//Convert TreeSet to a HashSet
		HashSet<String> set4 = new HashSet<String>(set2);
			System.out.println("The Converted TreeSet to a HashSet values are "+set4);
			
			ArrayList<String> list1 = new ArrayList<String>();
			list1.add("John");
			list1.add("Ajith");
			list1.add("Shilpa");
			list1.add("Manu");
			
			//Convert ArrayList to a HashSet
			HashSet<String> set5 = new HashSet<String>(list1);
			System.out.println("The Converted ArrayList to a HashSet values are "+list1);
			
			//Convert ArrayList to a TreeSet
			TreeSet<String> set6 = new TreeSet<String>(list1);
			System.out.println("The Converted ArrayList to a TreeSet values are "+list1);
			
			
	}

}
