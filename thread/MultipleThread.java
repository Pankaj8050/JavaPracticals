package thread;

 class MyThread implements Runnable{
	
	 String name;
	 Thread thread;
	 
	MyThread (String threadName){
		
		name = threadName;
		thread = new Thread(this,name);
		thread.start();
		
	}

	@Override
	public void run() {
	 try {
		 
		for(int i = 0;i < 5 ; i++) {
			System.out.println("The "+name + " is running");
		}
	 }
		catch (Exception e ){
			 System.out.println(name + "Interrupted");
		}
	 
		
	}
	
}
public class MultipleThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		MyThread t3 = new MyThread("Third Thread");
		Thread t = new Thread(t3);
		
		t.setPriority(10);
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Main Thread interrrupted");
		}
	}

}
