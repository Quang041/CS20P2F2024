package SkillBuilder;
import java.util.*;
public class PerfectSquare {
		public static void main(String[] args) {
			Scanner userinput = new Scanner (System.in);
			
	System.out.println("You will enter an integer and then the program will check if that is a perfect square or not");
	System.out.println("--------------------------------------------------------------------------------------------");
	System.out.println("    ");
	System.out.print("Please enter your number: ");
	int input = userinput.nextInt();
	
	double squareroot = Math.sqrt(input);
	
	int square = ((int) Math.pow((int)squareroot, 2));
	
	if (input == square) {
		System.out.print("Your number is the perfect square");
	}
	else {
		System.out.print("Your number is not the perfect square");
	}	
}
}