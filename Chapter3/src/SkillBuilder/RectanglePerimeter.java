package SkillBuilder;

import java.util.*;

public class RectanglePerimeter {
	
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter your length value: ");
	int length = userInput.nextInt();
	
	System.out.print("Enter your width value: ");
	int width = userInput.nextInt();
	
	
	int perimeter = (length + width) * 2;
	System.out.print("The perimeter of the rectangle is: "+ perimeter);
}
}