package oops;

public class Insurance extends Citizen {
	
	public Insurance(){
		System.out.println("Inside default constructor of Insurance Class");
		
	}

	public int InsuanceID;
	public void print() {
		super.print();
		System.out.println("The Insurance ID is "+InsuanceID);
	}
	public void print(String msg1) {
		System.out.println("This message is " + msg1);
	}
	
	
}
