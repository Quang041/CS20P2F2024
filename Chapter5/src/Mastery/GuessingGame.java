/*
Program: GuessingGame.java          Date: October 18, 2024

Purpose: The GuessingGame application would be more fun if users could make as many guesses as necessary to guess the secret number. So that modify the algorithm 
to allow for as many guesses as needed.

Author: Quang Nguyen
School: CHHS
Course: Computer Programming 20
*/

package Mastery;
import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		int Snum = (int) (20 * Math.random()+1);
		int guess = 0;
		
		do {
			System.out.print("Enter a number from 1 to 20: ");
			guess = userinput.nextInt();
			
			if (guess == Snum) {
				System.out.println("You won");
			}
			else {
				System.out.println("Try again");
			}
		}
		while (Snum!=guess);
	}}
/* Screen Dump
Enter a number from 1 to 20: 3
Try again
Enter a number from 1 to 20: 5
Try again
Enter a number from 1 to 20: 11
Try again
Enter a number from 1 to 20: 
_______________________________
Enter a number from 1 to 20: 12
Try again
Enter a number from 1 to 20: 2
Try again
Enter a number from 1 to 20: 3
Try again
Enter a number from 1 to 20: 
 */