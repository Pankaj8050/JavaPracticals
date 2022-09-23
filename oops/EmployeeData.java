package oops;

import java.util.Scanner;

public class EmployeeData extends Person {

	int employeeId;
	String departmentName;
	double salary;
	
	public void readEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee number");
		employeeId = scanner.nextInt();
		System.out.println("Department name");
		departmentName = scanner.next();
		System.out.println("Enter salary");
		salary = scanner.nextDouble();
	}

	public EmployeeData(int employeeId, String departmentName, double salary) {
		super();
		this.employeeId = employeeId;
		this.departmentName = departmentName;
		this.salary = salary;
	}

	public EmployeeData() {
		super();
		System.out.println("this is Employee Constructor");
	}

	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", departmentName=" + departmentName + ", salary=" + salary
				+ "]";
	}
	
	
}
