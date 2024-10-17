package SkillBuilder;
import java.util.*;
public class OddSum {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		int TOTAL = 0;
		System.out.print("Enter a number: ");
		int Num = userinput.nextInt();
		
		for (int i = 1; i <= Num; i+=2) {
			TOTAL += i;
		}
		System.out.print("The sum of odd numbers from 1 to "+Num+" is "+TOTAL);
	}

}
