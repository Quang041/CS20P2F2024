package Mastery;
import java.text.NumberFormat;
import java.util.*;
public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		NumberFormat nf = NumberFormat.getPercentInstance();
		
		System.out.print("Enter the value of a: ");
		double a = userinput.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = userinput.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = userinput.nextDouble();
		
		double abc = Math.sqrt(b*b -4*a*c);
		double root1 = ((-b + (int)Math.sqrt(b*b - 4*a*c))) / (2*a);
		double root2 = ((-b - (int)Math.sqrt(b*b - 4*a*c))) / (2*a);
		
		System.out.print(abc);
		System.out.print("The roots are " + nf.format(root1/0.1) + " and " + nf.format(root2/10));
	}

}
