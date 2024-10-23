/*
Program: GroupAssignment.java          Date: October 22, 2024

Purpose: Create a GroupAssignment application that prompts the user for his or her name and then display a group assignment. The group assignment
depends on the first letter of the student's last name. Last names beginning with A through I are assigned to Group 1, J through S are assigned to Group 
2, T through Z are assigned to Group 3.

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class GroupAssignment {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your first name: ");
		String firstname = userinput.next();
		System.out.print("Enter your last name: ");
		String lastname = userinput.next();
		
		char lastnameFirstLetter = lastname.charAt(0);
		String lastnameFirstLetter1 = String.valueOf(lastnameFirstLetter);
		
		String group1 = "ABCDEFGHI";
		String group2 = "JKLMNOPQRS";
		String group3 = "TUVWXYZ";
		
		if (group1.toUpperCase().contains(lastnameFirstLetter1.toUpperCase())) {
			System.out.print(firstname+" "+lastname+" is assigned to Group 1");
		}
		if (group2.toUpperCase().contains(lastnameFirstLetter1.toUpperCase())) {
			System.out.print(firstname+" "+lastname+" is assigned to Group 2");
		}
		if (group3.toUpperCase().contains(lastnameFirstLetter1.toUpperCase())) {
			System.out.print(firstname+" "+lastname+" is assigned to Group 3");
		}
		}
	}
/* Screen Dump
Enter your first name: Quang
Enter your last name: Nguyen
Quang Nguyen is assigned to Group 2


Enter your first name: Danny
Enter your last name: James
Danny James is assigned to Group 2 */

