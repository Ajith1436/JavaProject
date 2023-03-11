package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 40, 50 };
		String[] arr2 = {"Monday","Tuesday","Wednesday", "Thursday","Friday", "Saturday", "Sunday"};

		System.out.println("The Length of array is " + arr1.length);
		System.out.println("The First element in array is " + arr1[0]);
		System.out.println("The Last element in array is " + arr1[arr1.length-1]);
		
		System.out.println("The The Length of Second array is " + arr2.length);
	
	String str= "This is my Java session for Automation learning";
	String[] arr3 =str.split(" ");
	System.out.println("The Length of Third array is "+ arr3.length);
	}

}
