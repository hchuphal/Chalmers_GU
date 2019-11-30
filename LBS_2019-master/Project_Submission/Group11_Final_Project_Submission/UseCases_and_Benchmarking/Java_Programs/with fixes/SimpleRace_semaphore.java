import java.util.concurrent.Semaphore;


public class SimpleRace {
 
	  static int sharedVar; 
	  static Semaphore semaphore = new Semaphore(1);
	  
    public static void main(String[] args) {
        new ThreadRunner() {
            @Override
            public void thread1() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                sharedVar++; 
                semaphore.release();    
            }
            
 
            @Override
            public void thread2() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    sharedVar++;
                    semaphore.release();
            }
        };
    }
}
