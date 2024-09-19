package SkillBuilder;

import java.util.*;

public class Digit {
	public static void main(String[] args) {
		
	Scanner userInput = new Scanner (System.in);
	
	System.out.print("Please enter your two-digit number: ");
	int digitnumber = userInput.nextInt();
	
	int ones = digitnumber % 10;
	int tens = (digitnumber - ones)/10;
	
	
	System.out.println("The tens-place of the 2 digit-number is: " + tens);
	System.out.println("The ones-place of the 2 digit-number is: " + ones);
	
}
}
