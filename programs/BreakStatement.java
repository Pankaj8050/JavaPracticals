package programs;

public class BreakStatement {

	public static void main(String[] args) {
	       
		for (int i = 1; i <= 20; i++) {
		     if (i == 5 || i == 7)
		      break;
		  System.out.println(i);    
	}
 
      System.out.println("\n\n\n");
	
	for (int i = 1; i <= 10; i++) {
		
		if (i == 4 || i == 6)
			continue;
		System.out.println(i);
		
	}
	
  }
 

} 