package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee emp1 = new Employee();
		emp1.Name = "Ajith";
		emp1.empID = 127;
		emp1.DisplayName();

		Employee emp2 = new Employee("Saneer", 128);
		emp2.DisplayName();

		Employee.DisplaySalary();*/
		
		Citizen ct1 = new Citizen();
		ct1.Name1 = "Ajith";
		ct1.Age1 = 12;
		ct1.SSN = 55544;
		ct1.CountryName = "INDIA";
		ct1.print();
		
		System.out.println(" ");
		
		Citizen ct2 = new Citizen("Rahul", 15, "INDIA", 54434);
		ct2.print();
		
		Insurance obj1 =  new Insurance();
		obj1.InsuanceID = 44500;
		obj1.SSN = 55545;
		obj1.print();
		obj1.print("Over Riding function");
		
	}

}