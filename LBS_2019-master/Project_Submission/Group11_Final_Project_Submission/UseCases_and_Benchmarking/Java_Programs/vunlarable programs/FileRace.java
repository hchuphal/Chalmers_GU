import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileRace {
 
	  static File file;
	  static String text1 = "Hello world1";
	  static String text2 = "Hello world2";
	 
      
    public static void main(String[] args) throws IOException {
        new ThreadRunner() {
        	
        
        	
            @Override
            public void thread1() {
            	
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
            	
                 }
            
 
            @Override
            public void thread2() {
            	
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
                  }  
            }
        };
    }
    
    
}

