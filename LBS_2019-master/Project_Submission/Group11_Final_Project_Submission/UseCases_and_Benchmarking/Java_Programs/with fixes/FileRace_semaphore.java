import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;


public class FileRace {
 
	  static  File file;
	  static String text1 = "Hello world1";
	  static String text2 = "Hello world2";
	  static Semaphore semaphore = new Semaphore(1);
	 
      
    public static void main(String[] args) throws IOException {
        new ThreadRunner() {
        	
        
        	
            @Override
            public void thread1() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
            	file= new File("file.txt");
            	BufferedWriter output = null;
				try {
					output = new BufferedWriter(new FileWriter(file));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	try {
					output.write(text1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	semaphore.release();
                 }
            
 
            @Override
            public void thread2() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
            	file= new File("file.txt");
            	BufferedWriter output = null;
				try {
					output = new BufferedWriter(new FileWriter(file));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            	try {
					output.write(text2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	finally {
                    if ( output != null ) {
                      try {
						output.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    }
                  } semaphore.release();  
            }
        };
    }
    
    
}
