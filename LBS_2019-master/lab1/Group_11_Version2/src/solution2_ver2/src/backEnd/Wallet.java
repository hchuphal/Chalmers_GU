package backEnd;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

// version 2
import java.util.Scanner;
import java.nio.channels.FileLock;


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
    	FileLock l1 = file.getChannel().lock();
    	int balance = readBalance();
    	l1.release(); // release the lock
    	return balance;
    }

    /**
     * Sets a new balance in the wallet
     *
     * @param  newBalance          new balance to write in the wallet
     */
    private void setBalance(int newBalance) throws Exception {
    	 FileLock l2 = file.getChannel().lock();
         writeBalance(newBalance);
         l2.release();  // release the lock
    }
    
    /**
     * Reads the balance from wallet.txt
     *
     */
    private int readBalance() throws IOException {
        this.file.seek(0);
        return Integer.parseInt(this.file.readLine());
    }

    /**
     * Sets a new balance in the wallet
     *
     * @param  newBalance          new balance to write in the wallet
     */
    private void writeBalance(int newBalance) throws IOException {
        this.file.setLength(0);
        String str = Integer.toString(newBalance) + '\n';
        this.file.writeBytes(str);
    }
    
    /**
     * Withdraws the amount from the wallet
     *
     * @param  amtWithdraw          amount in the wallet
     */
    public void SafeWithdraw(int amtWithdraw) throws Exception {
    	  FileLock l3 = file.getChannel().lock();
          int balance = readBalance();
          if (balance - amtWithdraw < 0) 
          {
        	  // version_2
              throw new Exception("\nSafeWithdrawal: sorry, insufficient funds in the wallet!!");
          }
          writeBalance(balance - amtWithdraw);
          l3.release(); // release the lock
      }

    /**
     * Closes the RandomAccessFile in this.file
     */
    public void close() throws Exception {
	this.file.close();
    }
}
