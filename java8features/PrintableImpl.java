package java8features;

public class PrintableImpl implements Printable  {

	public static void main(String[] args) {
		
		PrintableImpl p = new PrintableImpl();
		p.print();
		Printable.square(5);
		int c = p.cube(5);
		System.out.println("Cube :"+c);
		
		

	}

	@Override
	public void print() {
		float r = 10;
		float a = PI * r *r ;
		System.out.println("Area of Circle :"+a);
		
	}

}
