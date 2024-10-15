package SkillBuilder;
import java.util.*;
public class Delivery {
	public static void main(String[] args) {
			
			Scanner userinput = new Scanner (System.in);
			
	System.out.println("Enter your length, width, height value and round to 2 decimal places if needed.");
	System.out.println(" ");
	System.out.print("Enter the length value: ");
	double length = userinput.nextDouble();
	System.out.print("Enter the width value: ");
	double width = userinput.nextDouble();
	System.out.print("Enter the height value: ");
	double height = userinput.nextDouble();
	
	
	System.out.println(" ");
	if ((length>10) || (width>10) || (height>10)) { 
		System.out.println("Reject");
		System.out.print("Check again your length, width, height if there is any dimension is greater than 10");
		
	}
	else if ((length<=10) && (width<=10) && (height<=10)) {
		System.out.println("Accept");
		System.out.print("Your delivery is good to go");
	}
	}
}
