package javapractice;

import java.util.Scanner;

public class ReplaceCharApp {

	public static void main(String[] args) {

		System.out.println("Please enter a word:");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();

		ReplaceChar rc = new ReplaceChar(word);
		
		System.out.println("Which letter in the word would you like to replace?");
		Scanner input2 = new Scanner(System.in);
		String oldLetter = input2.nextLine();
		System.out.println("Which letter do you want to replace it with?");
		Scanner input3 = new Scanner(System.in);
		String newLetter = input3.nextLine();
		
		String x = rc.replace(oldLetter, newLetter);

		System.out.println("Your new word is: " + x);
		
		System.out.println("Of the word above, please select the letter to replace, note the first letter of the word is 0");
		Scanner input4 = new Scanner(System.in);
		int indexPosition = input4.nextInt();
		System.out.println("What would you like to replace the letter with?");
		Scanner input5 = new Scanner(System.in);
		String indexNewLetter = input5.nextLine();
		
		String y = rc.replaceIndex(indexPosition, indexNewLetter);
		
		System.out.println("Your new word is: " + y);
	}

}
