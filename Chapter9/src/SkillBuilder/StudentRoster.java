package SkillBuilder;
import java.util.*;
public class StudentRoster {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("How many students are there in your class: ");
		int StudentNumber = userinput.nextInt();
		
		String[] StudentName = new String[StudentNumber];
		
		for (int i = 0; i<StudentNumber; i++) {
			System.out.print("Enter the student name: ");
			StudentName[i] = userinput.next();
		}
		
		
		System.out.println("Student Roster: ");
		for (int i = 0; i<StudentNumber; i++) {
			System.out.println(StudentName[i]);
		}

	}

}
