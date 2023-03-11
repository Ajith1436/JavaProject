package collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> basket2 = new TreeMap<String, Integer>();
		basket2.put("item 1", 2);
		basket2.put("item 2", 5);
		basket2.put("item 3", 1);
		basket2.put("item 4", 3);
		System.out.println("The items in Basket is " + basket2);
	}

}
