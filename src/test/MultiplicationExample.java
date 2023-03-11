package test;

import java.util.Scanner;

public class MultiplicationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		System.out.println("The Multipication table ");
		System.out.println("Enter the value of Multiplication Table needed ");
		Scanner scanner = new Scanner(System.in);
		j = scanner.nextInt();
		System.out.println("The Multipication table of ");
		for (i = 1; i < 11; i++) {
			int mul = j * i;

			System.out.println(+j + "*" + i + " = " + mul);
		}

		scanner.close();
	}

}
