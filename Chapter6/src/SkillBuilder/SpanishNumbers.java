package SkillBuilder;
import java.util.*;
public class SpanishNumbers {

	public static void SpanishNumbers() {
		System.out.println(" 1 uno");
		System.out.println(" 2 dos");
		System.out.println(" 3 tres");
		System.out.println(" 4 cuatro");
		System.out.println(" 5 cinco");
		System.out.println(" 6 sies");
		System.out.println(" 7 siete");
		System.out.println(" 8 ocho");
		System.out.println(" 9 nueve");
		System.out.println(" 10 diez");
		
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		SpanishNumbers();
		System.out.print("Enter a number from 1 to 10: ");
		int user = userinput.nextInt();
		
		switch (user) {
		case 1: 
			for (int i = 0; i<10; i++) {
				System.out.println("Uno");
			}
			break;
		case 2:
			for (int i = 0; i<10; i++) {
				System.out.println("Dos");
			}
			break;
		case 3:
			for (int i = 0; i<10; i++) {
				System.out.println("Tres");
			}
			break;
		case 4:
			for (int i = 0; i<10; i++) {
				System.out.println("Cuatro");
			}
			break;
		case 5:
			for (int i = 0; i<10; i++) {
				System.out.println("Cinco");
			}
			break;
		case 6:
			for (int i = 0; i<10; i++) {
				System.out.println("Sies");
			}
			break;
		case 7:
			for (int i = 0; i<10; i++) {
				System.out.println("Siete");
			}
			break;
		case 8:
			for (int i = 0; i<10; i++) {
				System.out.println("Ocho");
			}
			break;
		case 9: 
			for (int i = 0; i<10; i++) {
				System.out.println("Nueve");
			}
			break;
		case 10:
			for (int i = 0; i<10; i++) {
				System.out.println("Diez");
			}
			break;
		default:
			System.out.print("Invalid| Enter a number from 1 to 10");
		}
	}}

