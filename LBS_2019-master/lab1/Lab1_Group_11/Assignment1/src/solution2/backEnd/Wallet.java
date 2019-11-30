package backEnd;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


// part 2 solution 
import java.nio.channels.FileLock;

public class Wallet {
    /**
     * The RandomAccessFile of the wallet file
     */  
	int walletBalance;
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
    	
    FileLock fl1 = file.getChannel().lock(); // acquire the lock
	this.file.seek(0);
	walletBalance = Integer.parseInt(this.file.readLine());	
	fl1.release();  // releasing the lock
	
	return walletBalance;
    }

    /**
     * Sets a new balance in the wallet
     *
     * @param  newBalance          new balance to write in the wallet
     */
    public void setBalance(int newBalance) throws Exception {
    FileLock fl2 = file.getChannel().lock();
	this.file.setLength(0);
	String str = Integer.valueOf(newBalance).toString()+'\n'; 
	this.file.writeBytes(str); 
	fl2.release(); // release the lock
    }

    /**
     * Closes the RandomAccessFile in this.file
     */
    public void close() throws Exception {
	this.file.close();
    }
    
    // Part 2: Fix the API
    // public void safeWithdraw(int valueToWithdraw) throws Exception
    /**
     * Safe withdraw methods with locks on the shared resource
     *
     * @param  valueToWithdraw        amount value to withdraw
     */
    public void safeWithdraw(int valueToWithdraw) throws Exception {
    	System.out.println("\nSafeWithdraw Execution.....");
    	int curBal, walletBalance;
        FileLock fl3 = file.getChannel().lock();  // acquire the lock
    	this.file.seek(0);
    	curBal = Integer.parseInt(this.file.readLine());
        if (curBal < valueToWithdraw) {
            //throw new Exception("Not Sufficient funds in the wallet!");
        	System.out.println("Not enough credits in the wallet, Exiting....");
        	System.exit(1);
        }  
        walletBalance = curBal - valueToWithdraw;
    	this.file.setLength(0);
    	String str = new Integer(walletBalance).toString()+'\n'; 
    	this.file.writeBytes(str);
    	fl3.release(); // Finally releasing the lock 
    }
}
