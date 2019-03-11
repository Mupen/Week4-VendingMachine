package se.lexicon.daniel.vending_machine.assignment4.controller;
import se.lexicon.daniel.vending_machine.assignment4.data.User;
import se.lexicon.daniel.vending_machine.assignment4.data.VendingMachine;
import se.lexicon.daniel.vending_machine.assignment4.models.Candy;
import se.lexicon.daniel.vending_machine.assignment4.models.Drink;
import se.lexicon.daniel.vending_machine.assignment4.models.Food;
import se.lexicon.daniel.vending_machine.assignment4.models.Product;
import se.lexicon.daniel.vending_machine.assignment4.utils.KeyboardInput;


public class ConsoleMenuController {
	private boolean running;
	private VendingMachine vendingMachineInstance = new VendingMachine();
	private User userInstance = new User();
	private int userInputCashAmount;
	private int userInputProductNumber;
	private int userSwitchInput;
	
	public ConsoleMenuController() {
		System.out.println("");
		System.out.println("|------------------------------------|");
		System.out.println("|    Vending Machine Assignment 4    |");
		System.out.println("|------------------------------------|");
		System.out.println("");
		running = true;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void run() {
		startingUserInterface(); // What action do you want to take?
	}

	public void startingUserInterface() {
		boolean stopLoop = false;
		while(!stopLoop) {
			System.out.println("\n You stand in front of a vending machine \n" +
					" \n [Vending Machine] " + vendingMachineInstance.getBalance() + " kr " +
					" \n [Wallet] " + vendingMachineInstance.getBalance() + " kr " + "\n" +
					" \n [1] Examine the product in the machine. \n" +
					" [2] Insert coin in to the machin. \n" +
					" [3] Purchase a product. \n" +
					" [4] Examine your inventory for coins and products. \n" +
					" [5] Use product. \n" +
					" [6] leave the machine. \n");
			
			userSwitchInput = KeyboardInput.getInt();
			switch (userSwitchInput) {
			case 1:
				System.out.println("");
				System.out.println("|---------------------|");
				System.out.println("| Examine Products... |");
				System.out.println("|---------------------|");
				System.out.println("");
				vendingMachineInstance.examineProduct();
				break;
			case 2:
				System.out.println("");
				System.out.println("|----------------|");
				System.out.println("| Insert Coin... |");
				System.out.println("|----------------|");
				System.out.println("");
				userInputCashAmount = KeyboardInput.getInt();
				vendingMachineInstance.insertCash(userInputCashAmount);
				break; 
			case 3:
				System.out.println("");
				System.out.println("|---------------------|");
				System.out.println("| Purchase Product... |");
				System.out.println("|---------------------|");
				System.out.println("");
				userInputCashAmount = KeyboardInput.getInt();
				userInputProductNumber = KeyboardInput.getInt();
				vendingMachineInstance.purchaseProduct(userInputCashAmount, userInputProductNumber);
				break;
			case 4:
				System.out.println("");
				System.out.println("|-------------------------------------------|");
				System.out.println("| Eamine inventory for product and coins... |");
				System.out.println("|-------------------------------------------|");
				System.out.println("");
				examineInventoryController();
				break;
			case 5:
				System.out.println("");
				System.out.println("|-----------------------------|");
				System.out.println("| Use product in inventory... |");
				System.out.println("|-----------------------------|");
				System.out.println("");
				useProductController();
				break;
			case 6:
				System.out.println("");
				System.out.println("|------------------------------|");
				System.out.println("| leave the vending machine... |");
				System.out.println("|------------------------------|");
				System.out.println("");
				stopLoop = true;
				break;
			default:
				System.out.println("");
				System.out.println("|-------------------|");
				System.out.println("| No such choice... |");
				System.out.println("|-------------------|");
				System.out.println("");
			}
		}
	}
	
	private void useProductController() {
		// TODO Auto-generated method stub
		
	}

	private void examineInventoryController() {
		// TODO Auto-generated method stub
		
	}

	private void purchaseProductController() {
		// TODO Auto-generated method stub
		
	}

	private void insertCoinController() {
		// TODO Auto-generated method stub
		
	}

	private void examineProductController() {
		// TODO Auto-generated method stub
		
	}
}