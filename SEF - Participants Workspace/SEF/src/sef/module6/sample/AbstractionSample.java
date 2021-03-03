package sample;

import activity.Employee_I;

public class AbstractionSample {

	public static void main(String[] args) {
		
		// Person_A is abstract class so cannot be instantiated. Following gives error
		// Person_A p = new Person_A();
		
		Employee_I pE = new Employee_I();
		pE.setAge(21);
		pE.setName("Smith");

		
		Employee_I e = new Employee_I();
		e.setAge(33);
		e.setName("Raju");
		e.setSalary(80000);
		e.setTitle("Programmer");
				

		
		System.out.println("---------------------------");
		System.out.println("Employee Age          : " +pE.getAge());
		System.out.println("Employee Name         : " +pE.getName());

		
		System.out.println("---------------------------");
		System.out.println("Employee Age          : " +e.getAge());
		System.out.println("Employee Name         : " +e.getName());
		System.out.println("Employee Salary       : " +e.getSalary());
		System.out.println("Employee Title        : " +e.getTitle());

		
		
		
		
		
		
	}

}
