package programs;
import java.util.Scanner;

public class CubeOfDigit {

	public static void main(String[] args) {
		int cube,number;
		
		System.out.println("Enter the number to find the cube");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		 int rem;
		while (number != 0) {
			
		    rem = number % 10 ;
			System.out.println(rem);
			number = number / 10 ;
			
			cube = rem * rem * rem ;
			System.out.println(" cube of digit "+rem+" is "+cube);
		}
	
	}

}
