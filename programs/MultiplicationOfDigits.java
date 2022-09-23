package programs;

import java.util.Scanner;

public class MultiplicationOfDigits {

	public static void main(String[] args) {
	 int number ;
	 
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number to multiply digits");
	 number = scanner.nextInt();
	 
	 while (number !=0) {
		 
		int rem = number % 10;
		number = number /10;
		
		int mul = rem * number ;
		System.out.println("The multiplication of digits "+number+"is " +mul);
		
		
	 }
			 
	 
	 

	}

}
