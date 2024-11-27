/*
Program: DigitExtractor.java         Date: November 26, 2024

Purpose: An application that prompts the user for an integer and then displays the ones, tens, and hundreds digit of the number.

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class DigitExtractor {
	private int number, wholeNumber, ones, tens, hundreds;
	public DigitExtractor() {
		number = 0;                 //Default number//
	}
	public DigitExtractor(int Num) {
		number = Num;               
	}
	public void setNumber(int Num) {
		number = Num;               //Set the number//
	}
	public int getNumber() {
		return number;    
	}
	public int getOnes() {
		ones = number % 10;        //Calculate the ones place value//
		return ones;
	}
	public int getTens() {
		int NumNOne = (number-ones)/10;
		tens = NumNOne%10;         //Calculate the tens place value//
		return tens;
	}
	public int getHundreds() {
		int NumNOne = (number-ones)/10;
		hundreds = (NumNOne-tens)/10;
		return hundreds;             //Calculate the hundreds place value//
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		DigitExtractor NUM = new DigitExtractor();
		String userChoice;
		String quit;
		do {
		System.out.print("Enter the number: ");
		NUM.setNumber(userinput.nextInt()); 
		
		System.out.println("show (W)hole number: ");
		System.out.println("show (O)nes place number. ");
		System.out.println("show (T)ens place number. ");
		System.out.println("show (H)undreds place number.");
		System.out.println("(Q)uit");
		System.out.print("Enter your choice: ");
		userChoice = userinput.next();      //Prompts user the options//
		
		String whole = "Ww";
		String one = "Oo";
		String ten = "Tt";
		String hundred = "Hh";
		quit = "Qq";
		
		if (whole.contains(userChoice)) {
			System.out.println("This is a whole number: "+NUM.getNumber());
			System.out.println("------------------------------------------------");
		}
		else if (one.contains(userChoice)) {
			System.out.println("Ones place value in the number is: "+NUM.getOnes());
			System.out.println("------------------------------------------------");
		}
		else if (ten.contains(userChoice)) {
			System.out.println("Tens place value in the number is: "+NUM.getTens());
			System.out.println("------------------------------------------------");
		}
		else if (hundred.contains(userChoice)) {
			System.out.println("Hundreds place value in the number is: "+NUM.getHundreds());
			System.out.println("------------------------------------------------");
		}
		}while(!quit.contains(userChoice));
		System.out.print("End of program.");        //Decide what program will do depend on what user choose//
	}}
/* Screen Dump
Enter the number: 123
show (W)hole number: 
show (O)nes place number. 
show (T)ens place number. 
show (H)undreds place number.
(Q)uit
Enter your choice: w
This is a whole number: 123
------------------------------------------------
Enter the number: 123
show (W)hole number: 
show (O)nes place number. 
show (T)ens place number. 
show (H)undreds place number.
(Q)uit
Enter your choice: q
*/


