package SkillBuilder;
import java.util.*;
public class RectanglePart3of5 {
	private double width, length;
	public RectanglePart3of5() {
		width = 1;
		length = 1;
	}
	public RectanglePart3of5(double w, double l) {
		width = w;
		length = l;
	}
	public void setWidth(double w) {
		width = w;
	}
	public void setLength(double l) {
		length = l;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public boolean euquals(Object r) {
		RectanglePart3of5 testObj = (RectanglePart3of5) r;
		if (testObj.getLength()==length && testObj.getWidth()==width) {
			return(true);
		}
		else {
			return(false);
		}	
	}
	public String toString() {
		String myString;
		myString = "The rectangle has the length "+length+" and width "+width;
		return myString;
	}
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		RectanglePart3of5 rectangle1 = new RectanglePart3of5();
		RectanglePart3of5 rectangle2 = new RectanglePart3of5();
		System.out.print("Enter the first rectangle width: ");
		rectangle1.setWidth(userinput.nextDouble());
		System.out.print("Enter the first rectangle length: ");
		rectangle1.setLength(userinput.nextDouble());
		
		System.out.print("Enter the second rectangle width: ");
		rectangle2.setWidth(userinput.nextDouble());
		System.out.print("Enter the second rectngle length: ");
		rectangle2.setLength(userinput.nextDouble());
		
		if (rectangle1.equals(rectangle2)) {
			System.out.println("The rectangles have the same length and width");
		}
		else {
			System.out.println("Two rectangles have a different in lengths and widths");
		}
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
	}

}
