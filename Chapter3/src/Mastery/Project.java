/*
Program: Project.java          Date: September 23, 2024
Purpose: Create a Project application to help analyze the time taken for a Java project. The application should prompt you for the time spent designing,
coding, debugging, and testing, and then display a table showing the percentage of time taken for each part.

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.text.NumberFormat;
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
		System.out.println("The percentage of time you spent on designing is:     "+nf.format(DesignP/100));
		System.out.println("The percentage of time you spent on coding is:        "+nf.format(CodeP/100));
		System.out.println("The percentage of time you spent on debugging is:     "+nf.format(DebugP/100));
		System.out.println("The percentage of time you spent on testing is:       "+nf.format(TestP/100));
	}
}
/* Screen Dump
How many minutes you spent on Designing the program: 34
How many minutes you spent on Coding the program: 34
How many minutes you spent on Debugging the program: 100
How many minutes you spent on Testing the program: 2
 
 
Task                                                  % Time
The percentage of time you spent on designing is:     20%
The percentage of time you spent on coding is:        20%
The percentage of time you spent on debugging is:     59%
The percentage of time you spent on testing is:       1%
________________________________________________________________________
How many minutes you spent on Designing the program: 55
How many minutes you spent on Coding the program: 12
How many minutes you spent on Debugging the program: 34
How many minutes you spent on Testing the program: 76
 
 
Task                                                  % Time
The percentage of time you spent on designing is:     31%
The percentage of time you spent on coding is:        7%
The percentage of time you spent on debugging is:     19%
The percentage of time you spent on testing is:       43%

<<<<<<< HEAD
 */
=======
 */
>>>>>>> branch 'master' of https://github.com/Quang041/CS20P2F2024.git
