/*
Program: GuessingGame.java          Date: October 9, 2024

Purpose: The GuessingGame is a number guessing game played between the computer and one player. 

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		
		System.out.print("Enter a number from 1 to 20: ");
		int UserNum = userinput.nextInt();
		
		int Num = (int)(20 * Math.random() + 1);
	
		System.out.println("Computer's number: "+Num);
		System.out.println("Player's number: "+UserNum);
		
		if (UserNum==Num) {
			System.out.println("You won!");
		}
		else {
			System.out.println("Incorrect. Try again next time!");
		}
	}
}
/* Screen Dump
Enter a number from 1 to 20: 13
Computer's number: 2
Player's number: 13
Incorrect. Try again next time!


Enter a number from 1 to 20: 4
Computer's number: 20
Player's number: 4
Incorrect. Try again next time!
 */
