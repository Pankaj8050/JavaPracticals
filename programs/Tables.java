package programs;
import java.util.Scanner;

class GetNumber{
	
	public void insertValues() {
		int i,k;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to Create table");
	int n= sc.nextInt();
	
       for (i= 1 ;i<=10;i++) {
    	   k = n * i;
    	   System.out.println(k);
       }
	}	
}

public class Tables {

	public static void main(String[] args) {
		GetNumber gt = new GetNumber();
		gt.insertValues(); 

	}

}
