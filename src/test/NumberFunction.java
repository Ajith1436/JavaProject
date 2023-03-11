package test;

public class NumberFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;

		// int result = subtraction(num1,num2);
		int sum = addition(num1, num2);
		int sub = subtraction(num1, num2);
		int multiply = Multiplication(num1, num2);

		System.out.println("The Sum is: " + sum);
		System.out.println("The Difference of value is " + sub);
		System.out.println("The multiple value is " + multiply);
	}

	public static int addition(int a, int b) {

		return a + b;
	}

	public static int subtraction(int a, int b) {

		return a - b;

	}

	public static int Multiplication(int a, int b) {
		return a * b;
	}

}
