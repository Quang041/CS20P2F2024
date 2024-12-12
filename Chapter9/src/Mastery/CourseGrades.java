/*
Program: CourseGrades.java          Date: December 11, 2024

Purpose: Simulates a grade book for a class with 12 students that each have 5 test scores.

Author: Quang Nguyen
School: CHHS
Course: Computer Programming 20
*/
package Mastery;
import java.util.*;
public class CourseGrades {
	public int StudentNum = 12;
	public int Quizzes = 5;
	private int[][] grades;
	
	public void getStudent() {
		grades = new  int [StudentNum][Quizzes];
	}
	public int[][] showStudent() {
		return grades;
	}
	public double studentAvg(int stuNum) {
		int sum = 0;
		for (int i = 0; i < grades[0].length; i++) {
			sum += grades[stuNum - 1][i];
		}
		int stuAvg = sum / grades[0].length;
		return stuAvg;
	}
	public double testAvg(int testNum) 
	{
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < grades.length; i++)
		{
			sum += grades[i][testNum - 1];
		}
		avg = (double)sum/grades.length;
		
		return avg;
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		CourseGrades student = new CourseGrades();
		
		
		student.getStudent();
		for (int i = 0; i <student.StudentNum; i++ ) {
			for (int x = 0; x<student.Quizzes; x++) {
				System.out.print("Enter the "+ (i+1) + " student grade: ");
				student.grades[i][x] = userinput.nextInt();
			}
		}
		
		System.out.println("Here is the student grades: ");
		for (int i = 0; i<student.StudentNum; i++) {
			System.out.print("Student number: "+ (i+1)+ " | ");
			for (int x = 0; x <student.Quizzes; x++) {
				System.out.print(student.grades[i][x]+" ");
				}
			System.out.println(" ");
		}
		System.out.println("1. Get the student average.");
		System.out.println("2. Get the test average.");
		int userchoose = userinput.nextInt();
		
		switch (userchoose) {
		case 1:
			System.out.print("Enter the student number you want to find the average: ");
			int stu = userinput.nextInt();
			double average = student.studentAvg(stu);
			System.out.print("The average of the " + stu + "(th) student is: "+ average);
			break;
		case 2:
			System.out.print("Enter the test you want to find the average: ");
			int test = userinput.nextInt();
			average = student.testAvg(test);
			System.out.print("The average of the " + test + "(th) test is: "+ average);
			break;
		}
		
		}	
	}
/* Screen Dump
Enter the 1 student grade: 1
Enter the 1 student grade: 2
Enter the 1 student grade: 3
Enter the 1 student grade: 4
Enter the 1 student grade: 5
Enter the 2 student grade: 6
Enter the 2 student grade: 7
Enter the 2 student grade: 8
Enter the 2 student grade: 9
Enter the 2 student grade: 10
Enter the 3 student grade: 11
Enter the 3 student grade: 12
Enter the 3 student grade: 13
Enter the 3 student grade: 14
Enter the 3 student grade: 15
Here is the student grades: 
Student number: 1 | 1 2 3 4 5  
Student number: 2 | 6 7 8 9 10  
Student number: 3 | 11 12 13 14 15  
1. Get the student average.
2. Get the test average.
1
Enter the student number you want to find the average: 2
The average of the 2(th) student is: 8.0


**Program simulates for a class have 3 students.
 */
		
		
			
	

	
	

