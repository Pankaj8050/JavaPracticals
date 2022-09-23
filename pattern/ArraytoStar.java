package pattern;

import java.util.Scanner;

public class ArraytoStar {
    
	public static void main(String [] args) {
		
		int i,j , row = 0, column = 0 ;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the matrix format");
		row = scanner.nextInt();
		column =  scanner.nextInt();
		
		int array[][]= new int[row][column];
		
	    for(i = 0; i<row; i++) {
			for (j = 0; j<column ; j++) {
				
				System.out.print(" * ");
			}
			System.out.print("\n");
		}
	}
}
