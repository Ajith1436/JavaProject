package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name1 = "Ajith";
		String Name2 = "Shilpa is my wife";

		System.out.println("The Length of first string is " + Name1.length());
		System.out.println("The Length of Second string is " + Name2.length());
		System.out.println("The 4th character in 2nd String is " + Name2.charAt(13));
		System.out.println("The Last letter in 2nd String is " + Name2.charAt(Name2.length() - 1));
		System.out.println("The String in Upper case is " + Name2.toUpperCase());
		System.out.println("The string to lower case is " + Name2.toLowerCase());

	}
}
