package SkillBuilder;
import java.util.*;
public class CirclePart2of4 {
	private double radius;
	private double PI = 3.14;
	public CirclePart2of4() {
		radius = 1;//default//		
	}
	public CirclePart2of4(double r) {
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double Circumference() {
		double circumference = radius*2*PI;
		return circumference;
	}
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		CirclePart2of4 spot = new CirclePart2of4();
		spot.setRadius(userinput.nextDouble());
		
		System.out.println("The radius is "+spot.getRadius());
		System.out.println("The circumference is "+spot.Circumference());

	}

}
