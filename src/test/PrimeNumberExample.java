package test;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value ");
		j = scan.nextInt();
	
		boolean flag = true;

		for (int i = 2; i <= j / 2; i++) {

			int rem = j % i;

			if (rem == 0) {

				flag = false;
				break;
			}
		}

		if (flag == true) {

			System.out.println( j +" is prime number");
		} else {
			System.out.println(j +" is not a prime number");
		}

	}

}
