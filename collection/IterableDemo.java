package collection;

import java.util.ArrayList;

class Employee{
	int empNo;
	String name;
	double salary;
	
	public Employee(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}


public class IterableDemo {


	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Pankaj",5000);
		Employee e2 = new Employee(2,"viraj",6000);
		
		ArrayList <Employee> list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		
		System.out.println(list);

	}

}
