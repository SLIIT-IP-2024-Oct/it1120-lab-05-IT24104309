import java.util.Scanner;

public class IT24104309Lab5Q1 {

	public static void main (String[] args) {

		// declare variables
		int num1, num2, num3, smallestNum, largestNum;

		// scanner to read user input
		Scanner input = new Scanner(System.in);
	
		// get user inputs
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();

		// calculations
		smallestNum = num1;
		largestNum = num1;
	
		if (num2 > largestNum) {
			largestNum = num2;
		}
		
		if (num2 < smallestNum) {
			smallestNum = num2;
		}

		if (num3 > largestNum) {
			largestNum = num3;
		} 
	
		if (num3 < smallestNum) {
			smallestNum = num3;
		}

		// system output
		System.out.println();
		System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
		System.out.println("The Smallest number is: " + smallestNum);
		System.out.println("The Largest number is: " + largestNum);

	}

}