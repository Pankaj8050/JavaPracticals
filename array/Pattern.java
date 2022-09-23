package array;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	    
		int i , j ,row = 0,column = 0;
		System.out.println("Enter the number to create pattern in matrix");
        Scanner scanner = new Scanner(System.in);
        
        row = scanner.nextInt();
        column = scanner.nextInt();
        
        int array[][] = new int[row][column];
        
        for (i=0;i<row ;i ++) {
        	
        	for (j = 0;j<column;j++){
        		if(i == 0 || i == row-1 ||  j == 0  ||  j == column-1)
    				System.out.print("* "); 
    				else
    					System.out.print("  ");
    			}
        	System.out.print("\n");
        	}
        }
        
	}

