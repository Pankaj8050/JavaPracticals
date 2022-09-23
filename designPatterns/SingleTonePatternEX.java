package designPatterns;

class SingleObject{
	
	//create object 
	private static SingleObject instance = new SingleObject();
	
	//make private constuctor so that this class can not be instantiate 
	private SingleObject() {
		
	}
	
	//get the only object available
	public static SingleObject getInstance() {
		return instance;
		
	}
	public void show()
	{
		System.out.println("accessing method using singletone object");
	}
}



public class SingleTonePatternEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		SingleObject obj = SingleObject.getInstance();
		obj.show();
	}

}
