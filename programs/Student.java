package programs;
import java.util.Scanner;
//Use of constructor.

public class Student {

   int rollNo;
   String name;
   int javaMarks;
   int pythonMarks;
   int phpMarks;
   int totalMarks;
   
   Student(){
	   
	  javaMarks = 50;
	  pythonMarks = 35;
	  phpMarks = 30 ;
   }
   void totalMarks() {
	   totalMarks = javaMarks+pythonMarks+phpMarks;
   }
   
   
	public String toString() {
		return "Roll no" +rollNo+ "\nName"+name+" \nJava Marks"+javaMarks+ "\nPhp Marks"+"\nPython Marks"+pythonMarks+"\nTotal Marks"+totalMarks;
			
	}
	
	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("Enter Roll No");
		s1.rollNo = scanner.nextInt();
		
		System.out.println("Enter Name");
        s1.name = scanner.next();
		
        System.out.println("Enter Java Marks");
		s1.javaMarks = scanner.nextInt();
		
		System.out.println("Enter Python Marks");
		s1.pythonMarks = scanner.nextInt();
		
		System.out.println("Enter Php Marks");
		s1.phpMarks = scanner.nextInt();


        s1.totalMarks();

        System.out.println(s1);
	}

}
