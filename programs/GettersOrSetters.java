package programs;
import java.util.Scanner;

class Employee{
	private int empNo;
    private String name;
    private String gender;
    private int age;
    private int salary;
    
    Employee(){
    	
    	salary =  20000;
    }
     Employee(int empNo,String name, String gender,int age){
    	 this.empNo = empNo;
    	 this.name = name;
    	 this.gender = gender;
    	 this.age = age;
     }
     public void insertValues() {
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("Enter Employee Number");
    	 empNo = scanner.nextInt();
    	 
    	 System.out.println("Enter Employee Name");
    	 name = scanner.next();
    	 
    	 System.out.println("Enter gender ");
    	 gender = scanner.next();
    	 
    	 System.out.println("Enter age");
    	 age = scanner.nextInt();
    	 
    	 System.out.println("Salary is ="+salary);
     }
     
     public String toString() {
    	 
    	 return "employee no."+empNo+"\n Name"+name+"\n gender"+"\n age"+age+"\n salary"+salary;
     }
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
     
}
public class GettersOrSetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Employee e1 = new Employee();
        e1.insertValues();
    	 
    	
    	 
		

	}

}
