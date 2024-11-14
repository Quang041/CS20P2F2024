/*
Program: AddCoin.java          Date: November 7, 2024

Purpose: 

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
import java.text.DecimalFormat;
public class AddCoin {

	public static void getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
		double DollarAmount = pennies*0.01 + nickels*0.05 + dimes*0.10 + quarters*0.25;
		DecimalFormat decimalFormat = new DecimalFormat("$0.00");
		System.out.print(decimalFormat.format(DollarAmount));
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("Enter your total coins: ");
		System.out.println("");
		System.out.print("Quarters: ");
		int quarters = userinput.nextInt();		
		System.out.print("Dimes: ");
		int dimes = userinput.nextInt();
		System.out.print("Nickels: ");
		int nickels = userinput.nextInt();
		System.out.print("Pennies: ");
		int pennies = userinput.nextInt();
		
		System.out.print("Total Value: ");
		getDollarAmount(quarters,dimes,nickels,pennies);
	}
}
/* Screen Dump
Enter your total coins: 

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 4
Total Value: $1.23
___________________________
Enter your total coins: 

Quarters: 2
Dimes: 3
Nickels: 41
Pennies: 3
Total Value: $5.02
*/