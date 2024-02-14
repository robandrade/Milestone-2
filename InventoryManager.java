package app;
import java.util.Scanner;
/**
 * This class is used for Inventory and the class that shows the customer the products 
 * and allows them to chose a product
 * 
 * @author rohba
 *
 */
public class InventoryManager {
	private int answer;
	private int add;
	
	String[] weapons = {"Bow", "Assault Rifle"};
	String[] weaponInfo = {"A weapon used for shooting arrows", "A rapid-fire automatic rifle"};
	int[] weaponPrice = {100, 2700};
	int[] weaponQuantity = {800, 200};
	
	private String [] armor = {"Silver", "Gold",};
	private String [] armorInfo = {"Silver armor that covers 50 damage points", "Gold armor that covers 100 damage points"};
	private int [] armorPrice = {20, 100};
	private int [] armorQuantity = {1000,1000};
	
	// create the arrays with health
	private String[] health = {"Blue Heart", "Purple Heart"};
	private String[] healthInfo = {"Heart that can be taken to increase 50 points", "Heart that can be taken to increaase full health points"};
	private int [] healthPrice = {50, 100};
	private int [] healthQuantity = {1000,1000};
	
	/**
	 * This constructor gets the answer of the first question, I just use it to create a relationship 
	 * between the store front and the inventory class
	 * @param answer
	 */
	public InventoryManager(int answer) {
		this.answer = answer;
	}

	/**
	 * This method is used to show the products to the customer and allow them to chose a weapon to add 
	 * to the shopping cart
	 */
	void productToStoreFront() {
		
		int i = 2;
		int j = 4;
		
		for (int n = 0; n < 2; n++) {
			System.out.println("Press " + n + " for " + weapons[n] + ": " + weaponInfo[n] + ": $"+ weaponPrice[n]);
		}
		for (int n = 0; n < 2; n++) {
			System.out.println("Press " + i + " for " + armor[n] + ": " + armorInfo[n] + ": $" + armorPrice[n]);
			i++;
		}
		for (int n = 0; n < 2; n++) {
			System.out.println("Press " + j + " for " + health[n] + ": " + healthInfo[n] + ": $" + healthPrice[n]);
			j++;
		}
		
		
		
		System.out.println("\nWhat would you like to purhcase?");
		
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		
		switch(choice) {
			case 0:
				System.out.println("You've chosen the " + weapons[0]);
				break;
			case 1:
				System.out.println("You've chosen the " + weapons[1]);
				break;
			case 2:
				System.out.println("You've chosen the " + armor[0]);
				break;
			case 3:
				System.out.println("You've chosen the " + armor[1]);
				break;
			case 4:
				System.out.println("You've chosen the " + health[0]);
				break;
			case 5:
				System.out.println("You've chosen the " + health[1]);
				break;
		}
		
		ShoppingCart cart = new ShoppingCart(choice);
		
		
		System.out.println("\nWould you like to purchase another item? If 'No' it will open the Shopping Cart");
		
		String anotherItem = userInput.next();
		
		if (anotherItem.equals("Yes")) {
			productToStoreFront();
		}
		else if(anotherItem.equals("No")) {
			cart.customerShoppingCart();
		}
		
		
		
	}
	

}
