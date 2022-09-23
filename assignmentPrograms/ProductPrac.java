package assignmentPrograms;

import java.util.Scanner;

public class ProductPrac {
	int temp = 1;
	public int divisibleByThreeFive(int num) {
		while(num>0) {
			int rem = num %10;
			temp = temp * rem ;
			num/=10;
		}
		
		return temp;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = scanner.nextInt();
		
		if(num<0) {
		 
			System.out.println("Not a Valid number");
			System.exit(0);
			
		}
		ProductPrac product = new ProductPrac();
		int number = product.divisibleByThreeFive(num);
		
		if(number%3==0 || number % 5==0) {
			
			System.out.println("Yes");
		}
		else {
			System.out.println("false");
		}

	}

}



/*.
Write a program to find whether the given number is a 3/5 Number.
 
A number is a 3/5 Number if the product of the digits in the number is divisible by 3 or 5.
 
Include a function named divisibleByThreeFive that accepts an integer argument and returns an integer. The function returns
1.	1 if it is a 3/5 Number
2.	0 if it is not a 3/5 Number
3.	-1 if it is a negative number
 
Input and Output Format:
Input consists of a single integer.
Output consists of a string.
Refer sample output for formatting specifications.
 
Sample Input 1:
251
 
Sample Output 1:
yes
 
Sample Input 2:
241
 
Sample Output 2:
no
 
Sample Input 3:
-9
*/