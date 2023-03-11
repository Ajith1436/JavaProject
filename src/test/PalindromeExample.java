package test;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Nitin";
		String result = "";
		String result1 = "";

		for (int n = str1.length() - 1; n >= 0; n--) {
			result = result + str1.charAt(n);
		}
		if (str1.equals(result)) {
			System.out.println(str1 + " is Palindrome");
		} else {
			System.out.println(str1 + " is Not a Palindrome");
		}

		for (int m = str1.length() - 1; m >= 0; m--) {
			result1 = result1 + str1.charAt(m);
		}
		if (str1.equalsIgnoreCase(result)) {

			System.out.println("The given string is palindrom");

		} else {

			System.out.println("The given string is not palindrom");
		}

		String str2 = "Jhon Meets David and Lily";
		String[] arr1 = str2.split(" ");
		String result2 = "";

		for (int i = arr1.length - 1; i >= 0; i--) {
			result2 = result2 + arr1[i] + " ";
		}
		System.out.println(result2.trim());

	}
}
