package ArithmeticApp;
import java.util.Scanner;

public class ArithmeticOperation {
         
	    private static int fno;
	    private static int sno;
	    
	    
	
	  public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the First Number");
		  fno = scanner.nextInt();
		  System.out.println("Enter the Second number");
		  sno = scanner.nextInt();
			 
		ArithmeticInterface calc = new ArithmeticImpl();
        
		calc.add(fno, sno);
		calc.substraction(fno,sno);
		calc.multiplication(fno,sno);
		calc.division(fno,sno);
	}

}
