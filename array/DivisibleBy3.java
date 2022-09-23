package array;

import java.util.Scanner;

class GetNumber{
	 
	 private int number;
	 private int[] numberArray;
	  
	  public void getNumber() {
		  
		System.out.println ("Enter the Array number");
		 
		Scanner scanner = new Scanner(System.in); 
		
		number = scanner.nextInt();
		numberArray = new int[number];
		 
		for (int i = 0; i < number; i++) {
			numberArray[i] = scanner.nextInt();
		}
		for (int i = 0; i < number; i++) {
			
			if (numberArray[i] % 3 ==0 ) {
				System.out.println(numberArray[i]+ " is divisible by 3");
			}
			else {
				System.out.println(numberArray[i]+ " is not divisible by 3");
			}
				
	  }
  }
}
public class DivisibleBy3 {
   
	public static void main(String[] args) {
	
		GetNumber object = new GetNumber();
		object.getNumber();
	}

}
