package edu.albany.csi405.finalproj.employee;

public abstract class Employee<T extends Number> {

	static int count = 0;
	private int id;
	private String name;
	private T salary;
	
	public Employee(String name, T salary) {
		setName(name);
		setSalary(salary);
		this.id = count + 1;
		count++;
	}

	public void getPaid() {
		System.out.println(name + " paid salary of $" + salary + ".");
	}
	
	public static int getCount() {return count;}
	public static void setCount(int count) {Employee.count = count;}
	public int getId() {return id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public T getSalary() {return salary;}
	public void setSalary(T salary) {this.salary = salary;}
	
	
}
