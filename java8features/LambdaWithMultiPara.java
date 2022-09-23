package java8features;

@FunctionalInterface 
interface Addable{
	int add(int a, int b);
	
}

public class LambdaWithMultiPara {

	public static void main(String[] args) {
	 Addable addable1 =  (x,y)->  x + y;
	 
	 Addable addable2 = (p,q)->{
		 return p + q;
	 };
	 System.out.println("Add :"+addable1.add(10, 30));
	 System.out.println("Add :"+addable2.add(150, 350));
	 
	}

}
