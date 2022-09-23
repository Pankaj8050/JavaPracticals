package assignmentPrograms;
import java.util.Scanner;

class Pizza {

	private static  String pizzaSize;
	private static  int cheeseToppings;
	private static  int pepperoniToppings;
	private static  int hamToppings;
	
public Pizza() {
	pizzaSize = "small";
	cheeseToppings =0;
	pepperoniToppings = 0;
	hamToppings = 0;
	
}



public double CalcCost() {
	double bill = 0;
	if(pizzaSize.equals("small")) {
		bill = 100 + 20 *(cheeseToppings + pepperoniToppings + hamToppings);
				
	}
	
	else if (pizzaSize .equals("medium")) {
		bill = 120 + 20 *(cheeseToppings + pepperoniToppings + hamToppings);
		
	}
	
	if (pizzaSize.equals("large")) {
		bill = 140 + 20 *(cheeseToppings + pepperoniToppings + hamToppings);
		
	}
	return bill;
		
}
public void getDescription() {
	
	   System.out.println("Pizza size "+pizzaSize);
	   System.out.println("Number of cheese Toppings "+cheeseToppings);
	   System.out.println("Number of pepperoni Toppings "+pepperoniToppings);
	   System.out.println("Number of ham Toppings "+hamToppings);
	   System.out.println("Total bill = Rs."+CalcCost());
}	   
	    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Pizza obj = new Pizza();
		System.out.println("Enter the pizza size");
		pizzaSize =scanner.next();
		
		System.out.println("Enter number of Cheese Toppings");
		cheeseToppings = scanner.nextInt();
	
		System.out.println("Enter number of pepperoni Toppings");
		pepperoniToppings = scanner.nextInt();
		
		System.out.println("Enter number of ham Toppings");
		hamToppings = scanner.nextInt();
		
		System.out.println("Your bill is");
      
		obj.getDescription();
		

	}

}
