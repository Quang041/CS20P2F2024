package SkillBuilder;
import java.util.*;
public class TimeConverter {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);

		System.out.println("Hours to Minutes - Press 1");
		System.out.println("Days to Hours - Press 2");
		System.out.println("Minutes to Hours - Press 3");
		System.out.println("Hours to Days - Press 4");
		System.out.print("Please choose what you want to convert: ");
		int user = userinput.nextInt();
		
		switch (user) {
		case 1:
			System.out.print("Enter the hours you want to convert: ");
			double hour = userinput.nextDouble();
			double minute = hour*60;
			System.out.print("There are "+minute+" minute(s) in "+hour+" hour(s)");
			break;
		case 2:
			System.out.print("Enter the days you want to convert: ");
			double day = userinput.nextDouble();
			hour = day*24;
			System.out.print("There are "+hour+" hour(s) in "+day+" day(s)");
			break;
		case 3:
			System.out.print("Enter the minutes you want to convert: ");
			minute = userinput.nextDouble();
			hour = minute/60;
			System.out.print("There are "+hour+" hour(s) in "+minute+" mintue(s)");
			break;
		case 4:
			System.out.print("Enter the hours you want to covert: ");
			hour = userinput.nextDouble();
			day = hour/24;
			System.out.print("There are "+day+" day(s) in "+hour+" hour(s)");
			break;
		}
		
	}

}
