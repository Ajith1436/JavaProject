package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello Ajith";
		String result = "";

		for (int n = str1.length() - 1; n >= 0; n--) {
			result = result + str1.charAt(n);
		}
		System.out.println("The Reverse String is " + result);

	}
}
