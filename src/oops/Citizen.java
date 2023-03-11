package oops;

public class Citizen extends Person {
	public int SSN;
	
	public Citizen(){
		System.out.println("Inside default constructor of Citizen");
		
	}
	
	public Citizen(String Name1, int Age1, String CountryName, int SSN) {
		System.out.println("In Parameterized constructor of Citizen");
		this.Name1 = Name1;
		this.Age1 = Age1;
		this.CountryName = CountryName;
		this.SSN = SSN;
		System.out.println(" In Param-Cons of Citizen, Name is "+Name1);
	}
	public void print() {
		System.out.println("The SSN ID is "+SSN);
	}
	
}
