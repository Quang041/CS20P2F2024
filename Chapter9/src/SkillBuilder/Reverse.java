package SkillBuilder;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		
		final int arrayNumber = 10;
		
		int [] number = new int[arrayNumber];
		
		for (int i = 0; i<arrayNumber; i++) {
			number[i] = i;
		}
		
		System.out.println("COUNTDOWN: ");
		for (int i = arrayNumber-1; i>=0; i--) {
			System.out.println(number[i]);
		}
	}

}
