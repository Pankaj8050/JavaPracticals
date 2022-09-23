package programs;
import java.util.Scanner;

public class SumOfEvenDigits {
     
	
	public static void main(String[] args) {
		
	  int number,original = 0,reverseNumber = 0;
	  System.out.println("Enter the number");
	
	  Scanner scanner = new Scanner(System.in);
	  number = scanner.nextInt();
	 original = number;
	  
	  int[] arr = new int[6];
	  int r = 0, i = 0;
	  double a , sum = 0;
	
	  while(number != 0) {
		  
		  arr[i] = number % 10;
		  i++;
		  number = number/10;
				  
	  }
	   for (int j = i-1;i>=10;i--) {
		   a= Math.pow(arr[j],i);
		   sum += a ;
	   }
	  if (sum==original)
		  System.out.println(reverseNumber);
	}

}
