import java.util.Scanner;
/*
 * @author: James Paris
 * Date: 12/22/2020
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Give me a number please: "); */
		
		displayOptions();
		//String choice = scan.nextLine();
		
		
		
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
