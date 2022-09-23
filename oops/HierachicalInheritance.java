package oops;

class Number1{
	
	int fno = 10;
	
}

class Number2 extends Number1{
	int sno = 20 ;
	public void add() {
	System.out.println("fno + sno ="+(fno + sno));
	}
}
class Number3 extends Number1{
	int tno = 30 ;
	public void addition() {
		System.out.println("fno + tno ="+(fno + tno));
	}
			
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		Number2 obj = new Number2();
		Number3 obj1 = new Number3();
	    obj.add();
	    obj1.addition();

	}

}
