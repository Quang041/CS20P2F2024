package SkillBuilder;
import java.util.*;
public class RectanglePart2of5 {
	private double width, length;
	public RectanglePart2of5() {
		width = 1;
		length = 1;
	}
	public RectanglePart2of5(double w, double l) {
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
	public double Area() {
		double a = length*width;
		return a;
	}
	public static void rectangleAreaFormula() {
		System.out.println("The rectangle area formula is: Area = width*length");
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		RectanglePart2of5 aaaa = new RectanglePart2of5();
		System.out.print("Enter the length of the rectangle: ");
		aaaa.setLength(userinput.nextDouble());
		System.out.print("Enter the width of the rectangle: ");
		aaaa.setWidth(userinput.nextDouble());
		
		System.out.println("The length is "+aaaa.getLength());
		System.out.println("The width is "+aaaa.getWidth());
		rectangleAreaFormula();
		System.out.println("The area of the rectangle is "+aaaa.Area());
		

	}

}
