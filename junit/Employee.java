package junit;

public class Employee {

	int salary;
	int yearlySalary;
	int appraisal;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	public int getAppraisal() {
		return appraisal;
	}
	public void setAppraisal(int appraisal) {
		this.appraisal = appraisal;
	}
	
	
	public int calculateYearlySalary() {
	
		return yearlySalary =12 * getSalary();
		
	}
	
	
	public int calculateAppraisal() {
		if(getSalary() >=30000) {
			return appraisal = 2000;
		}
		else {
			return appraisal = 1000;
		}
	}
	
	
	
	
}






















/*1.Create an employee class, add method to calculate yearly salary, calculateYearlySalary(), 
add method calculateAppraisal() : if salary >=30000 appraisal=2000 else appraisal=1000*/

