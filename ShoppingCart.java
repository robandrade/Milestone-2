package app;
import java.util.Scanner;

/** 
 * This class is used for the shopping cart and to show the customer the shopping cart
 * @author rohba
 *
 */
public class ShoppingCart {
	// create variables and initiate the quantity
	private int product;
	private int quantity = 1;
	
	// create the arrays with information in them
	String[] weapons = {"Bow", "Assault Rifle"};
	String[] weaponInfo = {"A weapon used for shooting arrows", "A rapid-fire automatic rifle"};
	int[] weaponPrice = {100, 2700};
	
	
	private String [] armor = {"Silver", "Gold",};
	private String [] armorInfo = {"Silver armor that covers 50 damage points", "Gold armor that covers 100 damage points"};
	private int [] armorPrice = {20, 100};
	
	
	// create the arrays with health
	private String[] health = {"Blue Heart", "Purple Heart"};
	private String[] healthInfo = {"Heart that can be taken to increase 50 points", "Heart that can be taken to increaase full health points"};
	private int [] healthPrice = {50, 100};
	
	/**
	 * This constructor to get the parameter for the product chosen and send to setShoppingCart 
	 * @param product
	 */
	public ShoppingCart(int product) {
		this.setShoppingCart(product);
	}
	
	/**
	 * This setter method initializes the product chosen to the variable product
	 * @param product
	 */
	void setShoppingCart(int product){
		this.product = product;
	}
	
	/**
	 * create method to show the customers shopping cart 
	 */
	void customerShoppingCart(   ) {
		
		int armor1 = 0;
		int armor2 = 1;
		int health1 = 0;
		int health2 = 1;
		
		System.out.println("Your shopping cart:\n");
		
		if (product == 0 || product == 1) {
			System.out.println("$"+ weaponPrice[product] + " " +  weapons[product] + "Qty. : " + quantity);
		}
		
		else if (product == 2) {
			System.out.println("$"+ armorPrice[armor1] + " " +  armor[armor1] + "Qty. : " + quantity);
		}
		
		else if (product == 3) {
			System.out.println("$"+ healthPrice[armor2] + " " +  health[armor2] + "Qty. : " + quantity);
		}
		
		else if (product == 4) {
			System.out.println("$"+ healthPrice[health1] + " " +  health[health1] + "Qty. : " + quantity);
		}
		else if (product == 5) {
			System.out.println("$"+ healthPrice[health2] + " " +  health[health2] + "Qty. : " + quantity);
		}
		
		System.out.println("Would you like to cancel your shopping cart?");
		
		Scanner user = new Scanner(System.in);
		
		String answer = user.next();
		
		if (answer.equals("Yes")) {
			System.out.println("There are no items in your shopping cart");
		}
		
		else if (answer.equals("No")) {
			System.out.println("$"+ weaponPrice[product] + " " +  weapons[product] + "Qty. : " + quantity);
		}
				
		System.exit(0);
	}
	
}
