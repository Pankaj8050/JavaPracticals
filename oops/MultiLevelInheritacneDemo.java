package oops;

class A {
	int fno = 10;
}
class B extends A{
	
	int sno = 20;
	public void add() {
		System.out.println(fno + sno);
	}
}

class C extends B{
	
	int tno = 30;
	public void addition() {
	  System.out.println("fno + sno + tno "  +(fno + sno +tno));	
	}
}
public class MultiLevelInheritacneDemo {

	public static void main(String[] args) {
		C obj = new C();
		obj.addition();
	}

}
