package lab6;

import java.util.Scanner;

public class TranslatePigLatin {

	static int charLocation;
	static String[] parts;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("Enter a line to be translated: ");
		String userString = input.nextLine();
		input.close();
		
		parts = splitString(userString);

		for (int i = 0; i < parts.length; i++) {
			charLocation = testWord(parts[i]);
			translateWord(parts[i], charLocation);
		}
	}
	
	public static void translateWord(String word, int charIndex) {
		if (charIndex == 0) {
			System.out.print(word + "way ");
		} else {
			System.out.print(word.substring(charIndex));
			System.out.print(word.substring(0, charIndex));
			System.out.print("ay ");
		}
	}
	
	public static int testWord(String word) {
		char testChar;
		for (int i = 0; i < word.length(); i++) {
			testChar = word.charAt(i);
			if (testChar == 'a' || testChar == 'e' || testChar == 'i' || testChar == 'o' || testChar == 'u') {
				charLocation = i;
				break;
			} 
		}
		return charLocation;
	}
	
	public static String[] splitString(String input){
		input = input.toLowerCase();
		String[] parts = input.split(" ");
		return parts;
	}
	
}
