/*
Program: PrimeNumber.java          Date: November 5, 2024

Purpose: Modify the PrimeNumber application created in Chapter 5 Exercise 1 to include a method named isPrime(). This isPrime() method should require one parameter and return a Boolean value

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class PrimeNumber {

	public static Boolean isPrime(int count) {
		
	if (count==2) {
		System.out.print("This is a prime number.");
		return (true);
	}
	else {
		System.out.print("This is not a prime number.");
		return (false);
	}
}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		int number = userinput.nextInt();
		
		int count = 0;
		for (int i = 1; i<=number;i++) {
			if (number%i==0) {
				count += 1;
			}
		}
		isPrime(count);		
	}
}
/* Screen Dump
Enter your number: 34
This is not a prime number.
___________________________
Enter your number: 222
This is not a prime number.
*/