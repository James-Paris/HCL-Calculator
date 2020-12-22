import java.util.Scanner;
/*
 * @author: James Paris
 * Date: 12/22/2020
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Give me a number please: "); */
		int choiceRoute = displayOptions();
		//String choice = scan.nextLine();
		
		//System.out.println("We are now gnna use: " + choiceRoute);
		switch(choiceRoute) {
		case 1: //Addition
			
			break;
		case 2: //Subtraction
			
			break;
		case 3: //multi
			
			break;
		case 4: //div
			
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
	
}
