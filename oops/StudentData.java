package oops;

import java.util.Scanner;

public class StudentData extends Person {
     int rollNo;
     String name;
     int mathMarks;
     int scienceMarks;
     int engMarks;
     int total;
     
     public void readStudentDetails() {
  
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter student roll no.");
    	 rollNo = scanner.nextInt();
    	 System.out.println("Enter student Name");
    	 name = scanner.next();
    	 System.out.println("Enter science marks");
    	 scienceMarks = scanner.nextInt();
    	 System.out.println("Enter english marks");
    	 engMarks = scanner.nextInt();
    	 System.out.println("Enter math marks");
    	 mathMarks = scanner.nextInt();
    	 
    	 
    	 
     }
     public void TotalMarks() {
    	 
    	 total = mathMarks + scienceMarks + engMarks;
    	 System.out.println("Total of Student :"+total);
     }

	public StudentData(int rollNo, String name, int mathMarks, int scienceMarks, int engMarks, int total) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathMarks = mathMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
		this.total = total;
	}
	

	public StudentData() {
		super();
		System.out.println("this is student constructor");
	}
	public StudentData(String name, String cityName, int age, String gender) {
		super(name, cityName, age, gender);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentData [rollNo=" + rollNo + ", name=" + name + ", mathMarks=" + mathMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + ", total=" + total + "]";
	}

     
}
