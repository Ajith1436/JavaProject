package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		System.out.println("Display using For Loop");
		for (i = 0; i < 10; i++) {
			System.out.println(" " + i);
		}

		int j;
		System.out.println("Display in reverse using For Loop");
		for (j = 10; j > 0; j--) {
			System.out.println(" " + j);
		}
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };

		for (int k = 0; k < arr1.length; k++) {
			System.out.println("The element in array is " + arr1[k]);
		}
		// For Each Loop
		for (int l : arr1) {
			System.out.println("The value is " + l);
		}

		// Character of a word
		String str1 = "Ajith";
		for (int m = 0; m < str1.length(); m++) {
			System.out.println("The charatcer is " + str1.charAt(m));
		}
		
		String str2 = "Shilpa";
		for (int n = str2.length()-1; n >=0; n--) {
			System.out.println("The Reverse charatcer is " + str2.charAt(n));
		}

	}

}
