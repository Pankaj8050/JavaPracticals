package java8features;

import java.util.ArrayList;

public class WithStream {

	public static void main(String[] args) {
		 ArrayList <String> list = new ArrayList <String>();
		 list.add("Pankaj");
		 list.add("Vijay");
		 list.add("Ajinkya");
		 list.add("Sushant");
		 list.add("Dipak"); 
		 list.add("Raju");
		 list.add("viju");
		 
		 long count = list.stream().filter(s ->s.length()<5).count();
		
		 System.out.println("there are "+count+" String less than 5");

	}

}
