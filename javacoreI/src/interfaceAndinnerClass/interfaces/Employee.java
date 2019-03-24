package interfaceAndinnerClass.interfaces;

import java.util.Date;

public class Employee implements Comparable<Employee> ,Cloneable{
	
	private String name;
	private Date hireDate;
	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	private double salary;
	
	public Employee(){}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, Date hireDate, double salary) {
		super();
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException{
		Employee clone = (Employee)super.clone();
		clone.hireDate = (Date)hireDate.clone();
		return clone;
	}

}
