package assignmentPrograms;
import java.util.Scanner;

public class CalculateGrades {
     private String name ;
     private int marks = 0, subjectCount, java, php, html;
     double avg;
      
     Scanner scanner = new Scanner(System.in);
     public void getDetails() {
    	 
    	 System.out.println("Enter Name of Student");
    	 name = scanner.next();
    	 
    	 System.out.println("Enter number of subjects");
    	 subjectCount = scanner.nextInt();
    	 
    	 System.out.println("Enter marks for java");
    	 java = scanner.nextInt();
    	 
    	 System.out.println("Enter marks for php");
    	 php =scanner.nextInt();
    	 
    	 System.out.println("Enter marks for html");
    	 html = scanner.nextInt();
    	 
    	 
     }
     
	public void Calculation() {
		
		marks = java + php +html;
		System.out.println("Your Marks is :"+marks);
		
		float percentage = marks / subjectCount;
		System.out.println("Your percentage is : "+percentage);
		
		if (percentage >80 && percentage <= 100) {
			System.out.println("Grade = A");
		}
		else if (percentage >60 && percentage <= 80) {
			System.out.println("Grade = B");
		}
		else if(percentage >40 && percentage <= 60) {
			System.out.println("Grade = C");
		}
		else if(percentage >20 && percentage <= 40) {
			System.out.println("Grade = D");
		}
	}
	public static void main(String[] args) {
		CalculateGrades cg = new CalculateGrades();
		cg.getDetails();
		cg.Calculation();

	}

}
