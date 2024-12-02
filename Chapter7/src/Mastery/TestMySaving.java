package Mastery;
import java.text.DecimalFormat;
import java.util.*;
public class TestMySaving {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		mySaving PiggyBank = new mySaving();
		DecimalFormat decimalFormat = new DecimalFormat("$0.00");
		int userChoice;
		do {          
		System.out.println("1. Show total in bank.");
		System.out.println("2. Add a penny.");
		System.out.println("3. Add a nickel.");
		System.out.println("4. Add a dime.");
		System.out.println("5. Add a quarter.");
		System.out.println("6. Take money out of bank.");
		System.out.println("Enter 0 to quit.");
		System.out.print("Enter your choice: ");
		userChoice = userinput.nextInt(); //prompts user about the options//
		
		switch (userChoice) {
		case 1:
			PiggyBank.setTotal();
			System.out.println("Here is your money in your bank account: "+decimalFormat.format(PiggyBank.getTotal()));
			System.out.println("-------------------------------");
			break;
		case 2:
			System.out.print("Enter the amount of pennies: ");
			PiggyBank.setPenny(userinput.nextInt());
			System.out.println("-------------------------------");
			break;
		case 3:
			System.out.print("Enter the amount of nickels: ");
			PiggyBank.setNickel(userinput.nextInt());
			System.out.println("-------------------------------");
			break;
		case 4:
			System.out.print("Enter the amount of dimes: ");
			PiggyBank.setDime(userinput.nextInt());
			System.out.println("-------------------------------");
			break;
		case 5:
			System.out.print("Enter the amount of quarters: ");
			PiggyBank.setQuarter(userinput.nextInt());
			System.out.println("-------------------------------");
			break;
		case 6:
			System.out.print("Enter number of money you want to take out: $");
			double MoneyTakeOut = userinput.nextDouble();
			if (PiggyBank.TakeMoney(MoneyTakeOut)) {
				System.out.println("Now your account remains: $"+PiggyBank.getTotal());
			}
			else {
				System.out.println("Invalid, please try again.");
			}
			System.out.println("-------------------------------");
			break;
		}
		} while(userChoice !=0);
		
		System.out.print("End of Program! Thanks for using."); //End of program//
	}
}
/* Screen Dump
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Here is your money in your bank account: $0.00
-------------------------------
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 2
Enter the amount of pennies: 100
-------------------------------
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 3
Enter the amount of nickels: 211
-------------------------------
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Here is your money in your bank account: $11.55
-------------------------------
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 6
Enter number of money you want to take out: $0.55
Now your account remains: $11.0
-------------------------------
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0
End of Program! Thanks for using.
*/


