package oops;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StudentData sd = new StudentData();
         EmployeeData ed = new EmployeeData();
         
         sd.readPersonDetails();
         sd.readStudentDetails();
         sd.TotalMarks();
         ed.readEmployeeDetails();
         
	}

}
