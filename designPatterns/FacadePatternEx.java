package designPatterns;

import java.util.Scanner;

interface MobileShop{
	public void modelNo();
	public void price();
}

  class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("Iphone 6");
		
	}

	@Override
	public void price() {
		System.out.println("Rs.65000");
		
	}
  }	
  class Samsung implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.47000");
	}
	
}
	
class Blackberry implements MobileShop{

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		System.out.println("Blackberry z10");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.35000");
	}
	
}
class ShopKeeper{
	private MobileShop iphone , samsung , blackberry;
	
	public ShopKeeper() {
		
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}


    public void iphonesale() {
      	iphone.modelNo();
    	iphone.price();
 }
   public void samsungSale() {
	   samsung.modelNo();
	   samsung.price();
  }

    public void blackberrySale() {
	   blackberry.modelNo();
	   blackberry.price();
   }
}   
public class FacadePatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner scanner = new Scanner(System.in);

		
		ShopKeeper shopKeeper = new ShopKeeper();
		
		do {
			System.out.println("Enter Your Choice. Press \n1.Iphone \n2.Samsung \n3.Blackberry \4.Exit");
			choice = scanner.nextInt();
			switch(choice) {
			case 1 : shopKeeper.iphonesale();
			    break;
			case 2 : shopKeeper.samsungSale();
			    break;
			case 3 : shopKeeper.blackberrySale();
			   break;
			
			default : System.out.println("Other than this no other phones are avilable");
			  }
			}while(choice!=4);
			
	}

  }


