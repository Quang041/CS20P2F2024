/*

Program: GradeAvg.java          Date: September 16, 2024

Purpose:
* Create a GradeAvg application that prompts the user for five grade and then displays the average of the grades.
Author: Quang Nguyen
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilder;

import java.util.*;
public class GradeAvg {
	public static void main(String[] args) {
		
		Scanner Userinput = new Scanner (System.in);
		// userinput
		System.out.print("Enter your first grade: ");
		int first = Userinput.nextInt();
		
		System.out.print("Enter your second grade: ");
		int second = Userinput.nextInt();
		
		System.out.print("Enter your third grade: ");
		int third = Userinput.nextInt();
		
		System.out.print("Enter your forth grade: ");
		int forth = Userinput.nextInt();
		
		System.out.print("Enter your fifth grade: ");
		int fifth = Userinput.nextInt();
		// calculate the average
		int total = first+second+third+forth+fifth;
		double avg = (double) total / 5;
		
		System.out.println("Your grade average is: "+avg);
}
}

/* Screen Dump
Enter your first grade: 55
Enter your second grade: 65
Enter your third grade: 63
Enter your forth grade: 78
Enter your fifth grade: 77
Your grade average is: 67.6
 
 
 */
