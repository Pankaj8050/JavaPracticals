package programs;
import java.util.Scanner;

public class Addition {
   private int fno,sno,sum;
   
   public void addition() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number");
	   fno = sc.nextInt();
	   
	   System.out.println("Enter the second number");
	   sno = sc.nextInt();
	   
	   sum = fno + sno;
	   System.out.println("The Sum of number is" + sum);
	   
   }
  
   public static void main(String[] args) {
	   Addition add = new Addition();
	   add.addition();
   }


}
