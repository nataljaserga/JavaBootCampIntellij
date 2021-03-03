package activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I {


	//Attributes
	private double salary;
	private String title;

	public Employee_I(String name, int age) {
		super(name, age);
	}

	public Employee_I() {
		super();
	}

	//Behavior - write default constructor. Print 'I'm an Employee_I Constructor'
	
	// write getter for int salary
	public double getSalary() {
		return this.salary;
	}

	
	// write setter for int salary
	public void setSalary(int salary) {
		this.salary = salary;

		}

	
	// write getter for String title
	public String getTitle() {
		return title;
	}
	
	// write setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
}
