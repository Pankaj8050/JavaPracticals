package programs;
import java.util.Scanner;

class Table {

	private int num;
	
	public void insertValues() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		System.out.println("Enter the number to finish series");
		int n;
	    n = sc.nextInt();
		for(int i=num;i<=n;i++) {
			
			System.out.println(i);
		}
	}
	
}
	
public class Numbers{
		
	
	public static void main(String[] args) {
	
       Table tb = new Table();
       tb.insertValues();
	}

}
