package SkillBuilder;

import java.util.*;

public class RectanglePerimeter {
	
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter your length value: ");
	int length = userInput.nextInt();
	
	System.out.print("Enter your width value: ");
	int width = userInput.nextInt();
	
	
	int area = length * width;
	System.out.print("The area of the rectangle is: "+ area);
}
}