package backEnd;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

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
        FileLock l1 = file.getChannel().lock();
        this.file.seek(this.file.length());
        this.file.writeBytes(product + '\n');
        l1.release();
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
