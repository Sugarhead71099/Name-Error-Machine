import java.util.Random;

public class CheckName {
	
	static Random randomizer = new Random();
	
	// Omit random character from given string
	public static String missingChar(String str) {
		int luckyChar = randomizer.nextInt(str.length());			// Choose a random number within the range of the given String
		String start = str.substring(0, luckyChar);			// Get the characters up until the chosen character to omit
		String end = str.substring(luckyChar + 1, str.length());			// Get all the characters after the omitted character
		return start + end;			// Return the combined Strings to create the word with the randomly chosen omitted character
	}
}
