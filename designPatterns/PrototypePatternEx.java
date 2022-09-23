package designPatterns;

import java.util.Scanner;

interface Prototype{
	public Prototype getClone();
}

class Employee implements Prototype{

	private int id;
	String empName, address;
	private double salary;
	
	
	public Employee(int id, String empName, String address, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + ", salary=" + salary + "]";
	}


	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(id,empName,address,salary);
	}

	
}

public class PrototypePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner (System.in);
      System.out.println("enter employee name , address");
      String empName = scanner.next();
      String address = scanner.next();
      System.out.println("Enter emp id ");
      int id = scanner.nextInt();
      System.out.println("Enter the salary");
      double salary = scanner.nextDouble();
      
      Employee emp1 = new Employee (id ,empName ,address,salary);
      System.out.println("Employee e1 : "+emp1);
      
      Employee emp2 = (Employee)emp1.getClone();
      System.out.println("Employee e1 : "+emp2);
      
      
	}

}
