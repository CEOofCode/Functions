package Functions;

import java.util.Scanner;

public class FunctionsDemo {
	
	//Methods
	//Class level Scanner
	private Scanner s = new Scanner(System.in);
	
	//Class level Variable
	private String name = "";
	
		// Signature: public/private, return type, name(param)
	public void hello() {
		System.out.println("What is your name");
		name = s.nextLine();
		System.out.println("How old are you?");
		int age = s.nextInt();
		ageCheck(age);
		//Check over/under 18 no return
		
		System.out.println("Add two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = add(a, b);
		System.out.println(c);
		

		System.out.println("Add two doubles");
		double a1 = s.nextDouble();
		double b1 = s.nextDouble();
		double c1 = add(a1, b1);
		System.out.println(c1);
	}
	
	//Check over/under 18 (no return)
	public void ageCheck( int userAge) {
		
		System.out.println("Hello, " + name);
		
		if (userAge > 18) {
			System.out.println("You can vote in a general election");
		}
		else
		{
			System.out.println("You can't vote in the general election");
		}
		
	}
	
	public int add(int num1, int num2) {
		int result  = num1 + num2;
		return result;
	}
	
	public double add(double num1, double num2) {
		double result  = num1 + num2;
		return result;
	}
}
