package programs;

import java.util.Scanner;

class ArithmeticOperations {

	private int fno, sno, result;

	public void insertValues() {

		System.out.println("Enter the Numbers");
		Scanner sc = new Scanner(System.in);
		fno = sc.nextInt();
		sno = sc.nextInt();
	}

	public void addition() {

		result = fno + sno;
		System.out.println("the addition of two number is " + result);
	}

	public void multiplication() {
		result = fno * sno;
		System.out.println("The multiplication of two number is" + result);
	}

	public void substraction() {

		result = fno - sno;
		System.out.println("the substraction of numbers is" + result);
	}

	public void division() {
		result = fno / sno;
		System.out.println("the division of numbers is" + result);

	}
}

public class Calculator {

	public static void main(String[] args) {
		ArithmeticOperations op = new ArithmeticOperations();

		op.insertValues();
		op.addition();
		op.substraction();
		op.multiplication();
		op.division();

	}
}
