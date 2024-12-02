package Mastery;
import java.util.*;
import java.text.DecimalFormat;
public class LunchOrder {
	private double total;
	private int hamburger, salad, fries, soda;
	public LunchOrder() {
		total = 0;
	}
	public void setLunchOrder() {
		total = hamburger*1.85+salad*2.00+fries*1.30+soda*0.95;
	}
	public void setHamburger(int h) {
		hamburger += h;
		setLunchOrder();
	}
	public void setSalad(int s) {
		salad += s;
		setLunchOrder();
	}
	public void setFries(int f) {
		fries += f;
		setLunchOrder();
	}
	public void setSoda(int S) {
		soda += S;
		setLunchOrder();
	}
	public double getTotal() {
		return total;
	}
	
	
	public static void main(String[] args) {
		Scanner userinput= new Scanner (System.in);
		LunchOrder order = new LunchOrder();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Item          Price     Fat(g)     Carbohydrates(g)     Fiber(g)");
		System.out.println("hamburger     $1.85       9               33                 1");
		System.out.println("salad         $2.00       1               11                 5");
		System.out.println("french fries  $1.30       11              36                 4");
		System.out.println("soda          $0.95       0               38                 0");
		System.out.print("Enter number of hamburgers: ");
		order.setHamburger(userinput.nextInt());
		System.out.println("Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.");
		System.out.println("  ");
		
		System.out.print("Enter number of salads: ");
		order.setSalad(userinput.nextInt());
		System.out.println("Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.");
		System.out.println("  ");
		
		System.out.print("Enter number of french fries: ");
		order.setFries(userinput.nextInt());
		System.out.println("Each french fries has 11.0g of fat, 36.0g of carbs, and 0.0g of fiber.");
		System.out.println("  ");
		
		System.out.print("Enter number of soda: ");
		order.setSoda(userinput.nextInt());
		System.out.println("Each soda has 0.0g of fat, 38.0 of crabs, and 0.0g of fiber.");
		System.out.println("  ");
		
		System.out.print("Your total is: $"+df.format(order.getTotal()));
		
	}
}
