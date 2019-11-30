
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;


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
		
		
		public class Pocket {
		    /**
		     * The RandomAccessFile of the pocket file
		     */
		    private RandomAccessFile file;

		    /**
		     * Creates a Pocket object
		     * 
		     * A Pocket object interfaces with the pocket RandomAccessFile.
		     */
		    public Pocket () throws Exception {
		        this.file = new RandomAccessFile(new File("pocket.txt"), "rw");
		    }

		    /**
		     * Adds a product to the pocket. 
		     *
		     * @param  product           product name to add to the pocket (e.g. "car")
		     */
		    public void addProduct(String product) throws Exception {
		        this.file.seek(this.file.length());
		        this.file.writeBytes(product+'\n'); 
		    }

		    /**
		     * Closes the RandomAccessFile in this.file
		     */
		    public void close() throws Exception {
		        this.file.close();
		    }
		public  void readPocket() throws IOException{
				this.file.seek(0);
				String l1 = null;
				while ((l1 = this.file.readLine()) != null) {
					System.out.println(l1);
				}

			}
		}
		public static class Store {
		    /**
		     * Store.products is a HashMap with the products and their prices.
		     * You can access them as:
		     *      Integer price = Store.getProductPrice("book");
		     */
		    public final static Map<String,Integer> products= new HashMap<String,Integer>();
				
		    static {
		        products.put("candies", 1);
		        products.put("car", 30000);
		        products.put("pen", 40);
		        products.put("book", 100);
		    }

		    /**
		     * Returns the product list as a String. 
		     *
		     * @return    product list
		     */
		    public static String asString(){
		        String res = "";
		        for (String p : products.keySet()) {
		            res += p + "\t" + products.get(p) + "\n";
		        }
		        return res;
		    }

		    /**
		     * Returns the product list as a String. 
		     *
		     * @param     product          product name to get the price of (e.g. "car")
		     * @return    product list
		     */
		    public static Integer getProductPrice(String product) {
		        if(products.containsKey(product)) {
		            return products.get(product);
		        }

		        throw new IllegalArgumentException("Product " + product + " is not in store");
		    }
		}

		public class Wallet {
		    /**
		     * The RandomAccessFile of the wallet file
		     */  
		    private RandomAccessFile file;

		    /**
		     * Creates a Wallet object
		     *
		     * A Wallet object interfaces with the wallet RandomAccessFile
		     */
		    public Wallet () throws Exception {
			this.file = new RandomAccessFile(new File("wallet.txt"), "rw");
		    }

		    /**
		     * Gets the wallet balance. 
		     *
		     * @return                   The content of the wallet file as an integer
		     */
		    public int getBalance() throws IOException {
			this.file.seek(0);
			return Integer.parseInt(this.file.readLine());
		    }

		    /**
		     * Sets a new balance in the wallet
		     *
		     * @param  newBalance          new balance to write in the wallet
		     */
		    public void setBalance(int newBalance) throws Exception {
			this.file.setLength(0);
			String str = Integer.valueOf(newBalance).toString()+'\n'; 
			this.file.writeBytes(str); 
		    }

		    /**
		     * Closes the RandomAccessFile in this.file
		     */
		    public void close() throws Exception {
			this.file.close();
		    }
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
