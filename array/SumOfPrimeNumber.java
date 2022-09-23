package array;
import java.util.Scanner;

class GetNumbers{
	
	private int number;
	private int[] numberArray;
	public void getNumbers() {
	
		
	System.out.println("Enter the Numbers");
	Scanner scanner = new Scanner(System.in);
	
	number = scanner.nextInt();
	numberArray = new int[number];
	
	 for (int i=1;i < number;i++) {
		 numberArray[i] = scanner.nextInt();
	 }
	for (int i = 1; i< number; i++) {
		if(numberArray[i] % i == 0)
			System.out.println("The number is prime" + numberArray[i]);
	
	 }

 }
}
public class SumOfPrimeNumber {

	public static void main(String[] args) {
			GetNumbers object = new GetNumbers();
			object.getNumbers();
	}

}
