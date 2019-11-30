package backEnd;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

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
     * Amtount withdraw wallet
     *
     * @param  amtWithdraw          new balance to write in the wallet
     */
    public void Amtwithdraw(int amtWithdraw) throws Exception {
        int amtBalance = getBalance() - amtWithdraw;
        if (amtBalance < 0) {
            throw new Exception("Sorry, Insufficient funds!");
        }

        setBalance(amtBalance);
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
