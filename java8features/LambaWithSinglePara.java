package java8features;

@FunctionalInterface
interface Sayable1{
	public String sayHello(String str);
}
public class LambaWithSinglePara {

	public static void main(String[] args) {
	 Sayable1 s1 =(name) -> {
		 return "Hello" +name;
	 };
	 System.out.println(s1.sayHello("Pankaj"));
	}

}
