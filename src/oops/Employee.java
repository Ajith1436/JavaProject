package oops;

public class Employee {

	public String Name;
	public int empID;
	private static int Salary=5000;
	
	public Employee() {
		System.out.println("This is default constructor");
	}
	public Employee(String var1, int var2) {
		System.out.println("This is parametrized constructor");
		Name = var1;
		empID = var2;
	}
	public void DisplayName() {
		System.out.println("Employee Name is "+ Name);
	}
	public static void DisplaySalary()
	{
		System.out.println("Employee Salary is " + Salary);
	}
}
