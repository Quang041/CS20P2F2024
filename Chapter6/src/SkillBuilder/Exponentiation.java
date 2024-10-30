package SkillBuilder;
import java.util.*;
public class Exponentiation {

	public static void powerOf() {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your first number: ");
		int Firstparameter = userinput.nextInt();
		System.out.print("Enter your second number: ");
		int Secondparameter = userinput.nextInt();
		
		int answer = 1;
		while (Secondparameter >= 1) {
			answer *= Firstparameter;
			Secondparameter--;
		}
		System.out.print(answer);
	}
	public static void main(String[] args) {
		int abc = 1;
		if (abc == 1) {
			powerOf();
		}

	}

}
