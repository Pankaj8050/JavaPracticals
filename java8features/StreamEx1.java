package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Annie","Vyankatesh","Pankaj","Shubhendu","Vijay","Shubhamkar","Sonu","Raju");
              
		//creating stream
		Stream<String> allNames = names.stream();
		
		//perform intermediate operation
		Stream<String> longNames = allNames.filter(str ->str.length()>7);
		
		//performing terminal operation
		longNames.forEach(str ->System.out.print(str+" "));
		
	}

}
