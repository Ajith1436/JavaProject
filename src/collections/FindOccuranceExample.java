package collections;

import java.util.HashMap;

public class FindOccuranceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Clean World Green World Happy World";

		String[] arr1 = str.split(" ");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		for (String word : arr1) {
			if (!map1.keySet().contains(word)) {
				map1.put(word, 1);
			} else {
				map1.put(word, map1.get(word) + 1);
			}
		}

		System.out.println("The resulting map  is " + map1);

	}

}
