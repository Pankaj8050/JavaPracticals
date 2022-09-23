//also applicable for Reverse of a number.
package programs;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number");
		
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		int rem;
		while(number != 0) {
			rem = number % 10;
			System.out.print("   "+rem);5
			number = number / 10;
		}
	}

}
