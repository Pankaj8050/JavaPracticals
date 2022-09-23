package collection; 
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	 
		Stack <String> s = new Stack <String>();
		s.push("Ravi");
		s.push("Pankaj");
		s.push("vijay");
		s.push("Ajinkya");
		s.push("Sushant");
		
		System.out.println(s);
		
		System.out.println("Removing Element : "+s.pop());
		
		System.out.println(s);
		
		System.out.println("Searching Elmement "+s.search("Pankaj"));
		
		System.out.println("Searching Element "+s.search("Ajinkya"));
		
	}

}
