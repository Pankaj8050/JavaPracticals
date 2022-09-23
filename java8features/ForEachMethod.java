package java8features;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
		
		list.add("Pankaj");
		list.add("Vijay");
		list.add("Ajinkya");
		list.add("Sushant");
		list.add("Dipak");
		
		list.forEach(str -> System.out.println(str));
		
	}
}
