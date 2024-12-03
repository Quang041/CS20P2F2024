package SkillBuilder;
import java.util.*;
public class Squares {
	public static void main(String[] args) {
		final int arrayElement = 5;
		
		int [] squares = new int[arrayElement];
		
		for (int i = 0; i < arrayElement; i++) {
			squares[i] = i*i;
		}
		
		
		System.out.println("Squares value: ");
		for (int i = 0; i < arrayElement; i++) {
			System.out.println("Index: "+i+" ==> Squared value: "+squares[i]);
		}
	}
}
