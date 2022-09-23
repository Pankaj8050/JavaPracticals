package oops;

import java.util.Scanner;

public class Person {

	private String name;
	private String cityName;
	private int age;
	private String gender;
	
	Person(){
		System.out.println("This is person Constructor");
	}
	public Person(String name, String cityName, int age, String gender) {
		super();
		this.name = name;
		this.cityName = cityName;
		this.age = age;
		this.gender = gender;
	}
	
	
	public void readPersonDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person name");
		name = scanner.next();
	
		System.out.println("Enter city name");
		cityName = scanner.next();

		System.out.println("Enter age");
		age = scanner.nextInt();
		
		System.out.println("Enter gender");
		gender = scanner.next();


	}
}
