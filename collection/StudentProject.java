package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StudentProject {
	
		//using Map and HashMap
		Map<Integer , Data> map = new HashMap<>();
		int num;
		Scanner scanner =new Scanner(System.in);
        
		void insert() {
		 System.out.println("Enter number of records");
		  num = scanner.nextInt();
		  
		  for (int i=1; i<=num; i++) {
			  
			  Data data = new Data();
			  
			  System.out.println("Enter Student roll no : ");
			  rollNo = scanner.nextInt();
			  

					  
			  
		  }

  }
}

