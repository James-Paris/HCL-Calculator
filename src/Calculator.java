import java.util.Scanner;
/*
 * @author: James Paris
 * Date: 12/22/2020
 */
public class Calculator {

	//Constant value to control number of allowed input numbers
	public static final int NUM_OPERANDS = 2; 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculatorOperations calcOp = new CalculatorOperations();
		/*System.out.println("Give me a number please: "); */
		int choiceRoute = displayOptions();
		
		int[] params = new int[NUM_OPERANDS];
		switch(choiceRoute) {
			case 1: //Addition
				params = getNumbers();
				calcOp.add(params[0], params[1]);
				break;
			case 2: //Subtraction
				params = getNumbers();
				break;
			case 3: //multi
				params = getNumbers();
				break;
			case 4: //div
				params = getNumbers();
				break;
			case 5: //exit
				System.out.println("Thank you for using my calculator.");
				return;
		}
		
	}
	
	//This is called to give our default choice menu to select
	//from our current features
	public static int displayOptions() {
		int choice;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("");
			System.out.println("");
			System.out.println("###########################################################");
			System.out.println(" [ 1 ] Addition");
			System.out.println(" [ 2 ] Subtraction");
			System.out.println(" [ 3 ] Multiplication");
			System.out.println(" [ 4 ] Division");
			System.out.println(" [ 5 ] Exit");
			System.out.println("#################### SELECT A FUNCTION ####################");
			System.out.println("Please select a number 1-5: ");
			
			//grab as a string and convert it to int, in case they entered anything besides numbers.
			choice = Integer.parseInt(scan.nextLine());
		} while(choice > 5 || choice < 1);
		

		return choice;
		
	}
	
	public static int[] getNumbers() {
		Scanner scan = new Scanner(System.in);
		int[] ourNumbers = new int[NUM_OPERANDS]; //This can be resized if we wanted more potential numbers.
		
		//while(ourNumbers[0] == null) {
			System.out.println("Please enter your first number: ");
			ourNumbers[0] = Integer.parseInt(scan.nextLine());
		//}
		
		//while(ourNumbers[1] == 0) {
			System.out.println("Please enter your second number: ");
			ourNumbers[1] = Integer.parseInt(scan.nextLine());
			//could do some checks here for ints vs chars...
			
		//2}
		
		return ourNumbers;
	}
	
}
