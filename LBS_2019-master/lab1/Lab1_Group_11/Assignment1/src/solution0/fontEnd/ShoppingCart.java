package fontEnd;

// backEnd classes
import backEnd.*;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) throws Exception  {

		// Part 0: The scenario and base program
		Wallet wallet = new Wallet();
		Pocket pocket = new Pocket(); 
		int newAmount;
		int productCost;
		int currBal;
		Scanner scan = new Scanner(System.in);

		// print the current balance of the user
		System.out.println("Your balance: " + wallet.getBalance());
		// print the product list and their prices
		System.out.print(Store.asString());
		// ask user what product they would like to buy??
		System.out.print("What would you like to to buy?: ");
		// read user input using scanner library
		String option = scan.next();
		// check if option is in the store 
		while(Store.products.containsKey(option) == false)
		{
			System.out.println("Option selected is not available, please choose another option: ");
			System.out.print(Store.asString());
			option = scan.next();
		}
		// check if the amount of credits is enough, if not stop the execution (4the one)
		productCost = Store.products.get(option);
		// get the balance
		currBal = wallet.getBalance();
		if(currBal >= productCost)
		{
			newAmount = currBal - productCost;
			// otherwise, withdraw the price of the product from the wallet.
			wallet.setBalance(newAmount);
			// add the name of the product to the pocket file.
			pocket.addProduct(option);
			// New Prints -- print the new amount
			System.out.println("Your new balance is: " + newAmount);
			// print items in pocket
			System.out.println("\ncat pocket.txt");
			pocket.readPocket();
			// print the new balance
			System.out.println("\ncat wallet.txt:\n" + newAmount);
		}
		else
		{
			System.out.println("Not enough credits in the wallet!!");
			System.exit(1);
		}
		// close the scanner
		scan.close();
	}

}
