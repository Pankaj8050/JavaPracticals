package string;
import java.util.Scanner;

public class HackerRank {
	 public static void main(String[] args) {
	     
	      Scanner scanner = new Scanner(System.in);    
	       int fno;
	       double number;
	       String name;
	            
	       fno = scanner.nextInt();
	       number = scanner.nextDouble();
	       name = scanner.nextLine();
	       
	       System.out.println("String: "+name);
	       System.out.println("Doble: "+number);
	       System.out.println("int: "+fno);
	    }
}