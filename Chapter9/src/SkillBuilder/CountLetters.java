package SkillBuilder;
import java.util.*;
public class CountLetters {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		final int LOW = 'A';
		final int HIGH = 'Z';
		int[] letters = new int[HIGH-LOW+1];
		
		System.out.print("Enter the string: ");
		String userString = userinput.nextLine();
		userString = userString.toUpperCase();
		char[] lettersInsideString = userString.toCharArray();
		
		for (int i = 0; i<userString.length(); i++) {
			char charinString = lettersInsideString[i];
		if (charinString >= 'A' && charinString <= 'Z') {
			int aaaaa = charinString - LOW;
			letters[aaaaa] += 1;
		}
		}
		
		System.out.println("Letter Count: ");
		for (int i = LOW; i<=HIGH; i++) {
			System.out.println((char)i+": "+letters[i-LOW]);
		}
}}
