package SkillBuilder;
import java.util.*;
public class CirclePart3of4 {
	private double radius;
	private double PI = 3.14;
	public CirclePart3of4() {
		radius=1;
	}
	public CirclePart3of4(double r) {
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double Area() {
		double a = PI*radius*radius;
		return a;
	}
	public static void displayAreaFormula() {
		System.out.println("The circle area formula is: Area = PI*radius*radius");
	}
	public static void main(String[]arg) {
		Scanner userinput = new Scanner(System.in);
		CirclePart3of4 spot = new CirclePart3of4();
		System.out.print("Enter the circle radius: ");
		spot.setRadius(userinput.nextDouble());
		System.out.println("The radius is "+spot.getRadius());
		displayAreaFormula();
		System.out.println("The area of the circle is "+spot.Area());
	}
	

}
