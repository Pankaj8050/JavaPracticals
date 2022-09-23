package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testcalcalcuteSalary() {
		Employee emp = new Employee();
		emp.setSalary(30000);
		int s = emp.calculateYearlySalary();
	    
		assertEquals(360000,s);
	}
	
	@Test
	public void testCalculateAppraisal() {
	 	Employee emp1 = new Employee();
	 	emp1.setSalary(15000);
	 	int a = emp1.calculateAppraisal();
	 	
	 	assertEquals(1000,a);
		
	}
	
	
	
	
}
