package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> basket = new HashMap<String, Integer>();
		basket.put("item 1", 2);
		basket.put("item 2", 5);
		basket.put("item 3", 1);
		basket.put("item 4", 3);

		System.out.println("The items in Basket is " + basket);
		basket.put("item 4", 2);
		System.out.println("The items after updated in Basket is " + basket);
		basket.remove("item 2");
		System.out.println("The items after removal update in Basket is " + basket);

		/*
		 * basket.put("item 5", null);
		 * System.out.println("The items after adding null as value in Basket is " +
		 * basket);
		 * 
		 * basket.put(null, 3);
		 * System.out.println("The items after adding null as Key in Basket is " +
		 * basket);
		 * 
		 * // Can Make as <Integer, Integer>.....<String, Integer>.... <String, String>
		 * as key and Value HashMap<Integer, Integer> basket1 = new HashMap<Integer,
		 * Integer>(); basket1.put(101, 50);
		 * System.out.println("The items in Basket1 is " + basket1);
		 */

		for (String i : basket.keySet()) {
			System.out.println("The Item Name in Basket is " + i);
			System.out.println("The Quantity is " + basket.get(i));

		}
		for (Integer j : basket.values()) {
			System.out.println("The Quantity in Basket is " + j);

		}

	}

}
