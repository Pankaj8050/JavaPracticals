package programs;
import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number to reverse");
		
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		 
		int rem;
		while(number != 0) {
			rem = number % 10 ;
			System.out.print(rem);
			number = number / 10 ;
		}
		
	}

}
