package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Collection <Integer> arrayList = new ArrayList();
		int number = 0 , i = 0;
		Integer element = 0;
		System.out.println("Enter number of element");
		number = scanner.nextInt();
		
		for(;i < number ; i++) {
		 try {
		   element = scanner.nextInt(); 
		 }		  
		 catch (Exception e){
			
			 System.out.println("Invalid Input");
			 break;
		 }
		    arrayList.add(element);
		}
		
           Iterator <Integer> it = arrayList.iterator();
           while (it.hasNext()) {
        	   System.out.println(it.next());
           }
	}

}
