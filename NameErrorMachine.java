import java.util.Scanner;
import java.util.Random;

// This program takes a string given by the user and deletes/omits a randomly chosen char from it. Finally the new String is returned.
// The program ends after the "SENTINEL" is inputed.
class NameErrorMachine {
	
	private static final String SENTINEL = "Stop";		// Sentinel = ending keyword
	static Scanner userInput = new Scanner(System.in);		// Take input from user
	static Random randomizer = new Random();		// implement randomizer object into class
	CheckName checkName = new CheckName();
	
	public static void main(String[] args) {		// main method
		String word = null;							// Declare a string with a blank value
		System.out.println("How do you spell your name?");		// Ask user how to spell their name
		while(word != SENTINEL) {			// Continue code in lines until keyword is typed
			word = userInput.nextLine();			// Take input of user's name
			System.out.println("Oh, hello " + CheckName.missingChar(word) + "\n Did I get your name right?"); 	// Print out modified name
			char answer = userInput.nextLine().toLowerCase().charAt(0);				// Take input of yes/no answer from user
			if(answer == 'n') {			// If condition is met(no is said)
				System.out.println("Really? I'm sorry, May you please repeat your name to me?");		// Then apologize and try again
			} else {				// Otherwise...
				System.out.println("Alright " + CheckName.missingChar(word) + ", have a great day!");			// Great user and thank them with ironic mispronunciation again
				break;			// Exception - break out of the loop
			}
		}
	}
}