package array;
import java.util.Scanner;

public class FirstArray {

	public static void main(String[] args) {
	
		System.out.println("Enter the array size");
	    Scanner sc = new Scanner(System.in);
	   
	    int number = sc.nextInt();
		int arr[] = new int[number];
	    
	    for(int i = 0 ;i< number; i++)
	    	arr[i] = sc.nextInt();
	    
	    for(int i = 0 ;i< number; i++)
	    	System.out.println(arr[i]);
	      
		
	}

}
