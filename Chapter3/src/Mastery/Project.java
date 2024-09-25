/*
Program: Project.java          Date: September 23, 2024
Purpose: Create a Project application to help analyze the time taken for a Java project. The application should prompt you for the time spent designing,
coding, debugging, and testing, and then display a table showing the percentage of time taken for each part.

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class Project {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getPercentInstance();
		Scanner userinput = new Scanner (System.in);
		System.out.print("How many minutes you spent on Designing the program: ");
		double Designing = userinput.nextDouble();
		System.out.print("How many minutes you spent on Coding the program: ");
		double Coding = userinput.nextDouble();
		System.out.print("How many minutes you spent on Debugging the program: ");
		double Debugging = userinput.nextDouble();
		System.out.print("How many minutes you spent on Testing the program: ");
		double Testing = userinput.nextDouble();
		double TotalTime = Designing+Coding+Debugging+Testing;
		
		
		double DesignP =  (Designing/TotalTime)*100;
		double CodeP = (Coding/TotalTime)*100;
		double DebugP = (Debugging/TotalTime)*100;
		double TestP = (Testing/TotalTime)*100;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Task                                                  % Time");
		System.out.println("The percentage of time you spent on designing is:     "+nf.format(PercentageDesignP/100));
		System.out.println("The percentage of time you spent on coding is:        "+nf.format(PercentageCodeP/100));
		System.out.println("The percentage of time you spent on debugging is:     "+nf.format(PercentageDebugP/100));
		System.out.println("The percentage of time you spent on testing is:       "+nf.format(PercentageTestP/100));
	}
}
/* Screen Dump
How many minutes you spent on Designing the program: 120
How many minutes you spent on Coding the program: 240
How many minutes you spent on Debugging the program: 30
How many minutes you spent on Testing the program: 30
 
 
Task                                                  % Time
The percentage of time you spent on designing is:     28.57142857142857%
The percentage of time you spent on coding is:        57.14285714285714%
The percentage of time you spent on debugging is:     7.142857142857142%
The percentage of time you spent on testing is:       7.142857142857142%
________________________________________________________________________
How many minutes you spent on Designing the program: 150
How many minutes you spent on Coding the program: 100
How many minutes you spent on Debugging the program: 300
How many minutes you spent on Testing the program: 200
 
 
Task                                                  % Time
The percentage of time you spent on designing is:     20.0%
The percentage of time you spent on coding is:        13.333333333333334%
The percentage of time you spent on debugging is:     40.0%
The percentage of time you spent on testing is:       26.666666666666668%
 */
