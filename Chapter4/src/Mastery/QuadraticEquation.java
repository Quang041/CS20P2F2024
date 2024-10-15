/*
Program: QuadraticEquation.java          Date: October 15, 2024

Purpose: Create a QuadraticEquation application that gives the solution to any quadratic equation. The application should prompt the user for values for a,b, and c and then display the roots

Author: Quang, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.text.NumberFormat;
import java.util.*;
public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		
		System.out.print("Enter the value of a: ");
		double a = userinput.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = userinput.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = userinput.nextDouble();
		
		
		double root1 = ((-b + (int)Math.sqrt(b*b - 4*a*c))) / (2*a);
		double root2 = ((-b - (int)Math.sqrt(b*b - 4*a*c))) / (2*a);	
		System.out.print("The roots are " + root1 + " and " +root2);
		
	}
}
/* Screen Dump
Enter the value of a: 2
Enter the value of b: 4
Enter the value of c: -30
The roots are 3.0 and -5.0
________________________________
Enter the value of a: 1
Enter the value of b: -3
Enter the value of c: 2
The roots are 2.0 and 1.0
 */