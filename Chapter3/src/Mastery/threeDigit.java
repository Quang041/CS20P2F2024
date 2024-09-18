/*
Program: Digit.java          Date: September 17, 2024

Purpose: Modify the Digits application created in a review earlier in this chapter to show the hundreds-place digit of a three digit number

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;

public class threeDigit {
	public static void main(String[] args) {

		Scanner Userinput = new Scanner (System.in);
		
	System.out.print("Enter your three-digit number: ");
	int threedigit = Userinput.nextInt();
	
	int ones = threedigit%10;
	int nhap1 = threedigit/10;
	int tens = nhap1%10;
	int hundreds = (nhap1-tens)/10;
	
	System.out.println("The hundreds place digit is: "+hundreds);
	System.out.println("The tens place digit is: "+tens);
	System.out.println("The ones place digit is: "+ones);
}
}
/* Screen Dump
Enter your three-digit number: 987
The hundreds place digit is: 9
The tens place digit is: 8
The ones place digit is: 7

Enter your three-digit number: 346
The hundreds place digit is: 3
The tens place digit is: 4
The ones place digit is: 6
 */