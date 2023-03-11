package test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		while (num < 12) {
			System.out.println(num);
			num = num + 1;
		}
		System.out.println("ENd of First While loop");

		int num1 = 12;

		while (num > 0) {
			System.out.println(" " + num);
			num--;
		}
		System.out.println("ENd of Second While loop in Reverse");

		int num3 = 10;

		while (num3 > 0) {
			if(num3==5)
			{
				System.out.println("Skip");
				num3--;
				continue;
			}
			System.out.println(" " + num3);
			num3--;
		}
		System.out.println("Skipping of number in a Loop");
		int num4 = 10;

		while (num4 > 0) {
			if(num4==7)
			{
				System.out.println("Stop");
				num4--;
				break;
			}
			System.out.println(" " + num4);
			num4--;
		}
		System.out.println("Loop ended after finding the value ");

	}

}
