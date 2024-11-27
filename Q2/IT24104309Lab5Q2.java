import java.util.Scanner;

public class IT24104309Lab5Q2 {

	public static void main (String[] args) {

		// declare variables
		int noOfNew;

		// get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of new members introduced: ");
		noOfNew = input.nextInt();
		System.out.println();

		// calculations

		switch(noOfNew) {

			case 0: System.out.println("No Prize");
				break;
		
			case 1: System.out.println("Prize is a : Pen");
				break;

			case 2: System.out.println("Prize is an : Umbrella");
				break;

			case 3: System.out.println("Prize is a : Bag");
				break;
	
			case 4: System.out.println("Prize is a : Travelling Chair");
				break;

			case 5: System.out.println("Prize is a : Headphone");
				break;

			default:
				if (noOfNew < 0) {
					System.out.println("Input must be a number 0 or greater");
				}

				if (noOfNew > 5) {
					System.out.println("Prize is a : Headphone");
				}
		} 

	}

}