import java.util.Scanner;

public class CalculatorOperations {

	Scanner scan = new Scanner(System.in);
	
	public void add(double arg1, double arg2) {
		double result = arg1+arg2;
		System.out.println("You asked to add " + arg1 + " and " + arg2 +".");
		System.out.println("The result is: " + result);
		
		System.out.print("Press any key to continue. . .");
		scan.nextLine();
	}
	
	public void subtract(double arg1, double arg2) {
		double result = arg1-arg2;
		System.out.println("You asked to subtract " + arg1 + " and " + arg2 +".");
		System.out.println("The result is: " + result);
		
		System.out.print("Press any key to continue. . .");
		scan.nextLine();
	}
	
	public void multiply(double arg1, double arg2) {
		double result = arg1*arg2;
		System.out.println("You asked to multiply " + arg1 + " and " + arg2 +".");
		System.out.println("The result is: " + result);
		
		System.out.print("Press any key to continue. . .");
		scan.nextLine();
	}
	
	public void divide(double arg1, double arg2) {
		double result = arg1/arg2;
		System.out.println("You asked to divide " + arg1 + " and " + arg2 +".");
		System.out.println("The result is: " + result);
		
		System.out.print("Press any key to continue. . .");
		scan.nextLine();
	}
	
}
