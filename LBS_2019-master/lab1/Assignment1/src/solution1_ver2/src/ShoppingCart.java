import backEnd.*;

import java.util.Scanner;

public class ShoppingCart extends Thread{
	
	public static void main(String[] args) throws Exception 
	{
		int newAmount;
		int productCost;
		int currBal;
		Scanner scan = new Scanner(System.in);
		String item;
		
		Wallet wallet = new Wallet();
	    Pocket pocket = new Pocket();
		// print the current balance of the user
		System.out.println("Your balance: " + wallet.getBalance());
		// print the product list and their prices
		System.out.print(Store.asString());
		// ask user what product they would like to buy??
		//System.out.println("What would you like to to buy?: ");
		item = startShopping(scan);
        while (Store.products.containsKey(item) == false) {
        	System.out.println("Option selected is not available, please choose another option: ");
			System.out.print(Store.asString());
        	item = startShopping(scan);
        }
        System.out.print(item);
        productCost = Store.products.get(item);
     // get the balance
     	currBal = wallet.getBalance();
     	Thread.sleep(4000); // sleep to demonstrate the vulnerable code by running in 2 terminals
     	if(currBal >= productCost)
		{
			newAmount = currBal - productCost;
			// otherwise, withdraw the price of the product from the wallet.
			wallet.setBalance(newAmount);
			// add the name of the product to the pocket file.
			pocket.addProduct(item);
            // New Prints -- print the new amount
            System.out.println("\nYour new balance is: " + wallet.getBalance());
			// print items in pocket
			System.out.println("\ncat pocket.txt");
			pocket.readPocket();
			// print the new balance
			System.out.println("\ncat wallet.txt:\n" + wallet.getBalance());
		} else
		{
			System.out.println("\nNot enough credits in the wallet!!");
			System.exit(1);
		}
		scan.close();
        // close wallet and pocket instances
        wallet.close();
        pocket.close();
		
	 }
	
    private static String startShopping(Scanner scanner) {
    	System.out.print("What do you want to buy?: ");
        return scanner.next();
    }
}
