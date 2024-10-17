/*
Program: PrimeNumber.java          Date: October 17, 2024

Purpose: Create a PrimeNumber application that prompts user for a number and then displays a message indicating whether the number is prime or not

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		int COUNT = 0;
		System.out.print("Enter a number and the program will check if is the number is a prime number or not: ");
		int Prime = userinput.nextInt();
		
		for (int i = 1; i <=Prime; i++) {
			if (Prime%i==0) {
				COUNT += 1;
			}
		}
		if (COUNT==2) {
			System.out.print("Your number is a prime number");
		}
		else {
			System.out.print("Your number is not a prime number");
		}
}}
/* Screen Dump
Enter a number and the program will check if is the number is a prime number or not: 21
Your number is not a prime number
_______________________________________________________________________________________
Enter a number and the program will check if is the number is a prime number or not: 3
Your number is a prime number
 */