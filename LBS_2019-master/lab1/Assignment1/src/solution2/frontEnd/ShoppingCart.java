package frontEnd;

// backEnd classes
import backEnd.*;

import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.Writer;


public class ShoppingCart extends Thread{
	int newAmount;
	int productCost;
	int currBal;
	String option;
	Scanner scan = new Scanner(System.in);
	// Part 1 from backend
	Wallet wallet;
	Pocket pocket;

	public ShoppingCart(String threadID, String option) throws Exception
	{
		super(threadID);
		wallet = new Wallet(); // new wallet
		pocket = new Pocket(); // new pocket
		// options to buy
		this.option = option;
		// print the current balance of the user
		System.out.println("Your balance: " + wallet.getBalance());
		// print the product list and their prices
		System.out.print(Store.asString());
		// ask user what product they would like to buy??
		System.out.println("What would you like to to buy?: "+ option);
		// start the thread to start shopping
		start();
	}
		
		public void run() {
			try {
				startShopping(option);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void startShopping(String option) throws Exception
		{
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
			Thread.currentThread();
			Thread.sleep(2000);
			try
			{
				wallet.safeWithdraw(productCost);  // new safeWithdraw in Wallet.java
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
			catch (Exception e) {
				//System.out.println("Not enough credits in the wallet!!");
				e.printStackTrace();
			}
			// close the scanner
			scan.close();
		}
			
	public static void main(String[] args) throws Exception 
	{
		try (Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("pocket.txt"), "utf-8"))) {
			writer1.write("book\n"); // original pocket
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try (Writer writer2 = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("wallet.txt"), "utf-8"))) {
			writer2.write("30000\n"); // original wallet
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		// enforcing interleaving
		// Buy car and book -- both try to access shared resource wallet at the same time
		new ShoppingCart("ProductShopCart_1","car");
		Thread.currentThread();
		Thread.sleep(1000);
		new ShoppingCart("ProductShopCart_2","pen");

	}

}
