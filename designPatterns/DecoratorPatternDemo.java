package designPatterns;
import java.util.Scanner;

interface Food{
	public String preaperFood();
	public double foodPrice();
	
}

class VegFood implements Food{

	@Override
	public String preaperFood() {//for complimetary 
		// TODO Auto-generated method stub
		return "Complimentary :Onions and Pickle";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

abstract class FoodDecorator implements Food{
	
	private Food newFood ;

	public FoodDecorator(Food newFood) {
		super();
		this.newFood = newFood;
	}

	@Override
	public String preaperFood() {
		// TODO Auto-generated method stub
		return newFood.preaperFood();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}
}

class NonvegFood extends FoodDecorator{

	public NonvegFood(Food newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String preaperFood() {
		// TODO Auto-generated method stub
		return super.preaperFood()+"Roasted Chicken";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice()+250;
	}
}
	
class ChineaseFood extends FoodDecorator{

		public ChineaseFood(Food newFood) {
			super(newFood);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String preaperFood() {
			// TODO Auto-generated method stub
			return super.preaperFood()+"Fried Rice and Manchurian";
		}

		@Override
		public double foodPrice() {
			// TODO Auto-generated method stub
			return super.foodPrice()+170;
		}
	}
	
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scanner = new Scanner (System.in);
		do {
			
			System.out.println("---------Food Menu------------");
			System.out.println("Enter Your choice ");
			System.out.println("1.veg \n2.Non-veg \n3.Chinease \n4.Exit");
			choice =scanner.nextInt();
		 
		switch(choice)
		{
		 case 1 :
			 VegFood vegFood = new VegFood();
			 System.out.println("Selected Food :"+vegFood.preaperFood());
			 System.out.println("Price:"+vegFood.foodPrice());
			 break;
		 case 2 :
			 Food food1 = new NonvegFood(new VegFood());
			 System.out.println("Selected Food :"+food1.preaperFood());
			 System.out.println("Price :"+food1.foodPrice());
			 break;
		 case 3:
			 Food food2 = new ChineaseFood(new VegFood());
			 System.out.println("Selected Food :"+food2.preaperFood());
			 System.out.println("Price :"+food2.foodPrice());
			 break;
			
			default : System.out.println("Other than this no food is available"); 
		}
		
		
		}while(choice!=4);
	}
  }

