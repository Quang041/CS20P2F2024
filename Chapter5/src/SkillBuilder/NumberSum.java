package SkillBuilder;
import java.util.*;
public class NumberSum {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		int TOTAL = 0;
		
		System.out.print("Enter a number: ");
		int Num = userinput.nextInt();
		
		for (int i = 1; i<=Num; i+=1) {
			System.out.println(i);
			TOTAL += i;
		}
	
		System.out.println("Sum of the numbers are "+ TOTAL);
	}

}
