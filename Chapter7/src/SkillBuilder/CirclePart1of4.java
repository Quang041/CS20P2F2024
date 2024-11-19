package SkillBuilder;
import java.util.*;
public class CirclePart1of4 {
	private double radius;
	private static double PI = 3.14;
	public CirclePart1of4()
	{
		radius = 1; //default radius
	}
	public  CirclePart1of4(double r)
	{
		radius = r;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double Circumference() 
	{
		double Circumference = 2 * PI * radius;
		return Circumference;
	}

	public static void main(String[] arg) {
		CirclePart1of4 spot = new CirclePart1of4();
		
		spot.setRadius(3);
		System.out.println("The radius is "+spot.getRadius());
		System.out.println("The circumference is "+spot.Circumference());
	}}
