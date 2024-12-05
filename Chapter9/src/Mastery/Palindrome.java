package Mastery;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter the string: "); //Ask user for the String input//
		String userString = userinput.nextLine(); //Get the user String//
		
		userString = userString.replaceAll("\\s+", "").toUpperCase();     //Replace all the space in the string and uppercase for data to synchronous//
		char[] lettersInsideString = userString.toCharArray();        
		int length = userString.length();
		char[] lettersPalindrome = new char[length];      //Create the new array to contain all the reverse characters.//
		
		int lengthofArray = lettersInsideString.length - 1;
		for (int i = 0; i<length; i++ ) {
			lettersPalindrome[i] = lettersInsideString[lengthofArray];
			lengthofArray --;                      //Set the characters from the lettersInsideString array into the lettersPalindrome array but in the opposite order//
		}
		
		String palindrome = String.valueOf(lettersPalindrome);    //Set the lettersPalindrome array back into the String to compare with the user's input String//
		if (userString.equals(palindrome)) {
			System.out.print("Your string is palindrome. ");     //Compare the two Strings together to see if the user's String is palindrome or not //
		}
		else {
			System.out.print("Your string is not palindrome. ");
		}
	}
		
	

}
