package java8features;

interface sayable{
	public String sayhello();
}


public class LambdaWithNoPara {

	public static void main(String[] args) {
	   
		sayable s1 = ()->{
			return "hello user";
		};
       System.out.println(s1.sayhello());
	}

}
