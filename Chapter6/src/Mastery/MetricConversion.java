/*
Program: MetricConversion.java          Date: October 30, 2024

Purpose: Create a MetricConversion application that displays a menu of conversion choices and then prompts the user to choose a conversion.

Author: Quang Nguyen, 
School: CHHS
Course: Computer Programming 20
*/package Mastery;
import java.util.*;
public class MetricConversion {

	public static void InchetoCen () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Inch = userinput.nextDouble();
		double Centimeter = Inch*2.54;
		System.out.print(Inch + " inches equals " + Centimeter + " centimeters.");
	}
	public static void FeettoCen () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Feet = userinput.nextDouble();
		double Centimeter = Feet*30;
		System.out.print(Feet + " feets equals " + Centimeter + " centimeters.");
	}
	public static void YardtoMeter () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Yard = userinput.nextDouble();
		double Meter = Yard*0.91;
		System.out.print(Yard + " yards equals " + Meter + " meters.");
	}
	public static void MiletoKilometer () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Mile = userinput.nextDouble();
		double Kilometer = Mile*1.6;
		System.out.print(Mile + " miles equals " + Kilometer + " kilometers.");
	}
	public static void CentoInch () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Centimeter = userinput.nextDouble();
		double Inch = Centimeter/2.54;
		System.out.print(Centimeter + " centimeters equals " + Inch + " inches.");
	}
	public static void CentoFeet () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Centimeter = userinput.nextDouble();
		double Feet = Centimeter/30;
		System.out.print(Centimeter + " centimeters equals " + Feet + " feet.");
	}
	public static void MetertoYard () {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Meter = userinput.nextDouble();
		double Yard = Meter/0.91;
		System.out.print(Meter+ " meters equals " + Yard + " yards.");
	}
	public static void KilometertoMile() {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter your number: ");
		double Kilometer = userinput.nextDouble();
		double Mile = Kilometer/1.6;
		System.out.print(Kilometer + "kilometers equals " + Mile + " miles.");
	}
	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("Convert:            ");
		System.out.println("1. Inches to Centimeters       5. Centimeters to Inches");
		System.out.println("2. Feet to Centimeters         6. Centimeters to Feet");
		System.out.println("3. Yards to Meters             7. Meters to Yards");
		System.out.println("4. Miles to Kilometers         8. Kilometers to Miles");

		System.out.print ("Enter your choice: ");
		int n = userinput.nextInt();
		
		switch (n) {
		case 1:
			InchetoCen ();
			break;
		case 2:
			FeettoCen ();
			break;
		case 3:
			YardtoMeter ();
			break;
		case 4: 
			MiletoKilometer();
			break;
		case 5: 
			CentoInch ();
			break;
		case 6: 
			CentoFeet ();
			break;
		case 7:
			MetertoYard ();
			break;
		case 8:
			KilometertoMile();
			break;
		}
	}

}
/* Screen Dump
Convert:            
1. Inches to Centimeters       5. Centimeters to Inches
2. Feet to Centimeters         6. Centimeters to Feet
3. Yards to Meters             7. Meters to Yards
4. Miles to Kilometers         8. Kilometers to Miles
Enter your choice: 3
Enter your number: 23
23.0 yards equals 20.93 meters.
___________________________________________________________
Convert:            
1. Inches to Centimeters       5. Centimeters to Inches
2. Feet to Centimeters         6. Centimeters to Feet
3. Yards to Meters             7. Meters to Yards
4. Miles to Kilometers         8. Kilometers to Miles
Enter your choice: 6
Enter your number: 12
12.0 centimeters equals 0.4 feet.
 */
