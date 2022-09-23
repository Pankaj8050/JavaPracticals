package oops;

class First{
	int a = 25;
	public void display() {
		
		System.out.println("Property of a ="+a);
	}
}
class Second extends First{
	int b = 30;
	public void addition(){
		System.out.println("Propert of b ="+b);
		System.out.println(a+b);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Second s = new Second();
		s.display();
		s.addition();
	}

}
