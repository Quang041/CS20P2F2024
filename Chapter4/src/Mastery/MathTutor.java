/*
Program: MathTutor.java          Date: October 7, 2024

Purpose: Create a MathTutor application that displays math problems by randomly generating two numbers, 1 through 10 and an operator (*,+,-,/), and then
prompts the user for an answer. The application should check the answer, display a message, and the correct answer, if necessary. 

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class MathTutor {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		Random Ran = new Random();
		
		
		System.out.println("We will randomly generating the math questions and your task is to answer it");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("*Round your answer into a whole number place if needed.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(" ");
		
		int question= 0;
		int firstNum = (int)(10 * Math.random()+1);
		int secondNum = (int)(10 * Math.random()+1);
		
		System.out.println("What operator do you wish to do: ");
		System.out.println("1) +");
		System.out.println("2) -");
		System.out.println("3) x");
		System.out.println("4) :");
		System.out.print("Your operator: ");
		int operator = userinput.nextInt();
		String operator1 = " ";
		switch (operator) {
			case 1: 
				question = firstNum + secondNum;
				operator1 = "+";
				break;
			case 2:
				question = firstNum - secondNum;
				operator1 = "-";
				break;
			case 3:
				question = firstNum * secondNum;
				operator1 = "x";
				break;
			case 4:
				question = firstNum / secondNum;
				operator1 = "/";
				break;			
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("What is " + firstNum + " " + operator1  + " " + secondNum + " = ?");
		System.out.print("Your answer: ");
		int answer = userinput.nextInt();
			
		if (answer == question) {
			System.out.println(" ");
			System.out.print("Correct. Congratulations");
		}
			else  {
				System.out.println(" ");
				System.out.print("Incorrect. Try again with another question");
		}
}}
/* Screen Dump
We will randomly generating the math questions and your task is to answer it
----------------------------------------------------------------------------
*Round your answer into a whole number place if needed.
----------------------------------------------------------------------------
 
What operator do you wish to do: 
1) +
2) -
3) x
4) :
Your operator: 3
 
 
What is 9 x 9 = ?
Your answer: 81
 
Correct. Congratulations
____________________________________________________________________________

We will randomly generating the math questions and your task is to answer it
----------------------------------------------------------------------------
*Round your answer into a whole number place if needed.
----------------------------------------------------------------------------
 
What operator do you wish to do: 
1) +
2) -
3) x
4) :
Your operator: 1
 
 
What is 8 + 1 = ?
Your answer: 54
Incorrect. Try again with another question
 */
