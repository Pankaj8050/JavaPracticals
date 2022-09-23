package programs;
import java.util.Scanner;

class Salary{
	
	private int salary,shifts,saving;

	
	public void getValues() {
	
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter the Salary");
	 salary = sc.nextInt();
	
	 System.out.println("Enter the shift");
	 shifts = sc.nextInt();
	 
	 if (salary > 8000)
		 System.out.println("Salary too large");
	 else if (shifts < 0)
		 System.out.println("Shift too small");
	 else if (salary < 0)
		 System.out.println("Salary too small");
		 else 
		 {
			 saving = (int) ((salary * 0.5) + (salary * 0.02 * shifts));
			 System.out.println("%.of" +saving);
		 }
	}	
	
}

public class SalaryProfit {

	public static void main(String[] args) {
	
        Salary sal = new Salary();
        sal.getValues();
        
	}

}
