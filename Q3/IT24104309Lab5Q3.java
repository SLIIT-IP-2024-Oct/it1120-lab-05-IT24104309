import java.util.Scanner;

public class IT24104309Lab5Q3 {

	public static void main(String[] args) {

		// initiating constants
		final double ROOM_CHARGE = 48000.0;
		final double DISCOUNT_3__4_DAYS = 0.1;
		final double DISCOUNT__5_OR_MORE_DAYS = 0.2;
		
		// initiating variables
		int startDate, endDate, noOfDayReserved;
		double totalAmount, discountRate;
		discountRate = 0;
		
		// creating scanner to get user input
		Scanner input = new Scanner(System.in);

		// getting user input
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
	
		// validation
		if ( startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		if ( startDate >= endDate ) {
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}

		// calculations
		noOfDayReserved = endDate - startDate;
	
		if ( noOfDayReserved >= 3 && noOfDayReserved <= 4) {
			discountRate = DISCOUNT_3__4_DAYS;
		} else if ( noOfDayReserved >= 5) {
			discountRate = DISCOUNT__5_OR_MORE_DAYS;
		}

		totalAmount = ROOM_CHARGE*noOfDayReserved*(1 - discountRate);
	
		// output
		System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
		System.out.println("Number of Days Reserved: " + noOfDayReserved);
		System.out.println("Total Amount to be Paid: " + totalAmount);


	}
	
}