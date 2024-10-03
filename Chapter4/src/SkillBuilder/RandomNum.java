package SkillBuilder;
import java.util.*;
public class RandomNum {
	 public static void main(String[] args) {
		 Scanner userinput = new Scanner (System.in);
		 
		 System.out.print("Enter your first number as a minimum value: ");
		 int minvalue = userinput.nextInt();
		 System.out.print("Enter your second number as a maximum value: ");
		 int maxvalue = userinput.nextInt();
		 
		 
		 System.out.print("The integer value between " + minvalue + " and " + maxvalue + " is: ");
		 System.out.print((int) ((maxvalue-minvalue+1) * Math.random() + minvalue));
		 
		 
}
}
