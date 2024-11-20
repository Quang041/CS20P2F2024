package SkillBuilder;
import java.util.*;
public class RectanglePart1of5 {
	private double width, length;
	public RectanglePart1of5() {
		width = 1;
		length = 1;
	}
	public RectanglePart1of5(double w, double l) {
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
	public double Perimeter() {
		double p = 2*length+2*width;
		return p;
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		RectanglePart1of5 aaaa = new RectanglePart1of5();
		System.out.print("Enter the length of the rectangle: ");
		aaaa.setLength(userinput.nextDouble());
		System.out.print("Enter the width of the rectangle: ");
		aaaa.setWidth(userinput.nextDouble());
		
		System.out.println("The length is: "+aaaa.getLength());
		System.out.println("The width is "+aaaa.getWidth());
		System.out.println("The area of the rectangle is: "+aaaa.Area());
		System.out.println("The perimeter of the rectangle is: "+aaaa.Perimeter());
		
		
	}

}
