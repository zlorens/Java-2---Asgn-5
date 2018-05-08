/* Zeke Lorens
 * Java 2 - Recursion Problem
 * Assignment #5
 * Help by Zac
 */

import java.util.Scanner;

public class Recursion3 {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		String exitMessage = "G o o d b y e - S a y o n a r a - A u f  W i e d e r s e h e n";
		String exitMessage1 = "G o o d b y e";
		String exitMessage2 = " - S a y o n a r a";
		String exitMessage3 = " - A u f  W i e d e r s e h e n";
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("\nPlease enter a number (from 1 to 20): ");
			int n = console.nextInt();
			// check if number is within range
			if(n >= 1 && n <= 20) {
				for (int counter = 1; counter <= n; counter++) {
					System.out.print("writeChars(" + counter +")");
					System.out.println (";  " + writeChars(counter));
				} // end for loop
			} else if(n < 1 || n > 20) {
				System.out.println("Incorrect entry");
			} // end if-else loop	
			
			System.out.print("\nTest again? (y/n): ");
			choice = console.next();
		}//end of while loop
		
		System.out.println("\n" + exitMessage1 + exitMessage2 + exitMessage3);
		console.close();
		
	} // end main method
	
	// display "*" in different formats
	public static String writeChars(int input) {
		String oneStar = "*";
		String twoStars = "**";
		String Left = "<";
		String Right = ">";
		if (input < 0) {
			throw new IllegalArgumentException();
		} else if (input == 1) {
				return oneStar;
			} else if (input == 2) {
				return twoStars;				
			} else {
				// recursive function
				return Left + writeChars (input - 2) + Right;
			} // end inner if-else
	} // end writeChars method
} // end Recursion3 class
