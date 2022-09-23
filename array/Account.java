package array;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
	    int arraySize[];
		int i;
		int array[];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size to enter account number");
		
	    i = scanner.nextInt();
	    arraySize = new int[i];
	    
	    if (i < 0) {
	    	
	    	System.out.println("Invalid input");
	    	System.exit(i);
	    	
	    }
	    
	    
	   }

}
