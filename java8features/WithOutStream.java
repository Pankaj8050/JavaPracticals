package java8features;

import java.util.ArrayList;

public class WithOutStream {

	public static void main(String[] args) {
	
		 ArrayList <String> list = new ArrayList <String>();
		 list.add("Pankaj");
		 list.add("Vijay");
		 list.add("Ajinkya");
		 list.add("Sushant");
		 list.add("Dipu"); 
		 list.add("Raju");
		 list.add("Sonu");
		 
		 int count = 0;
		 for(String string : list) {
			 if (string.length()<5) {
				 
				 count++;
			 }
		 }
		 System.out.println("there are "+count+" String less than 5");
	} 

}
