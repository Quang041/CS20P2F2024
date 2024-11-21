package SkillBuilder;
import java.util.*;
public class CirclePart4of4 {
	private double Radius;
	private double PI=3.14;
	public CirclePart4of4() {
		Radius = 1;
	}
	public CirclePart4of4(double r) {
		Radius = r;
	}
	public void setRadius(double r) {
		Radius = r;
	}
	public double getRadius() {
		return Radius;
	}
	public boolean equals(Object c) {
		CirclePart4of4 testOjb = (CirclePart4of4) c;
		if (testOjb.getRadius()==Radius) {
			return(true);
		}
		else {
			return(false);
		}
	}
	public String toString() {
		String circleString;
		circleString = ("The circle has a radius of "+Radius);
		return circleString;
	}
	public static void main(String[]args) {
		Scanner userinput = new Scanner (System.in);
		CirclePart4of4 spot1 = new CirclePart4of4();
		CirclePart4of4 spot2 = new CirclePart4of4();
		System.out.print("Enter the first circle radius: ");
		spot1.setRadius(userinput.nextDouble());
		System.out.print("Enter the second circle radius: ");
		spot2.setRadius(userinput.nextDouble());
		
		if (spot1.equals(spot2)) {
			System.out.println("Two circle have the same radius");
		}
		else {
			System.out.println("Two circle have different radius");
		}
		System.out.println("Circle 1 "+spot1);
		System.out.println("Circle 2 "+spot2);
	}
}
