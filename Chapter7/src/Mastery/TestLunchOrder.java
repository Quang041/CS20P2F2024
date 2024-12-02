package Mastery;
import java.text.DecimalFormat;
import java.util.*;
public class TestLunchOrder {
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
/* Screen Dump
Item          Price     Fat(g)     Carbohydrates(g)     Fiber(g)
hamburger     $1.85       9               33                 1
salad         $2.00       1               11                 5
french fries  $1.30       11              36                 4
soda          $0.95       0               38                 0
Enter number of hamburgers: 1
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.
  
Enter number of salads: 1
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.
  
Enter number of french fries: 1
Each french fries has 11.0g of fat, 36.0g of carbs, and 0.0g of fiber.
  
Enter number of soda: 1
Each soda has 0.0g of fat, 38.0 of crabs, and 0.0g of fiber.
  */