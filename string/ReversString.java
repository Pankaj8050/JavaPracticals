package string;
import java.util.Scanner;
public class ReversString{

	private String str ;
	private String reverseStr;
	
	   public void reversString() {
		   System.out.println("Enter the string");
		   Scanner sc = new Scanner(System.in);
		   str = sc.next();
		   
		   char[] array = new char[str.length()];
		   array = str.toCharArray();
		   
		   for(int i = str.length()-1; i >=0; i--)
		   {
			   reverseStr = reverseStr + array[i];
		   }
		   
		   System.out.println(reverseStr);
	   }
	
	
	
	public static void main(String[] args) {
	
	   ReversString rs = new ReversString();
	   rs.reversString();
	   
	   
		

	}

}
