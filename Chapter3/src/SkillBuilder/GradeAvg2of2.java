/*
Program: GradeAvg2of2.java          Date: September 16, 2024

Purpose: Modify the GradeAvg application to use the += operator to sum the grades as they are entered by the user. Format the average grade to display as a percentage

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package SkillBuilder;
import java.util.*;
public class GradeAvg2of2 {
	public static void main (String[] args) {
		
		Scanner Userinput = new Scanner (System.in);
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
		
		int total = 0;
		total += first;
		total += second;
		total += third;
		total += forth;
		total += fifth;
		
		double average = (double) total / 5;
		
		System.out.print("The grade average is: "+average+"%");	
}
}
/* Screen Dump
Enter your first grade: 88
Enter your second grade: 77
Enter your third grade: 100
Enter your forth grade: 79
Enter your fifth grade: 55
The grade average is: 79.8%

Enter your first grade: 66
Enter your second grade: 63
Enter your third grade: 89
Enter your forth grade: 100
Enter your fifth grade: 73
The grade average is: 78.2%
 */