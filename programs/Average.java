package programs;
import java.util.Scanner;
class Values{
	private float a,b,c,d,e,avg;
	public void insertValues() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the first number");
	a = sc.nextFloat();
	
	System.out.println("Enter the Second number");
	b = sc.nextFloat();
	
	System.out.println("Enter the third number");
	c = sc.nextFloat();
	
	System.out.println("Enter the fourth number");
	d = sc.nextFloat();
	
	System.out.println("Enter the fifth number");
	e = sc.nextFloat();
	
	avg = a+b+c+d+e / 5 ;
	System.out.println("The average of numberes is"+avg);
   }
}
public class Average {

	public static void main(String[] args) {
	Values obj = new Values();
	obj.insertValues();
	}

}
