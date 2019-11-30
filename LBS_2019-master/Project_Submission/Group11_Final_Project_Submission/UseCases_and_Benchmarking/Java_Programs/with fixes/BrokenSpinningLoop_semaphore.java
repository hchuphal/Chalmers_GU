import java.util.concurrent.Semaphore;

public class BrokenSpinningLoop {
 
    static int sharedVar;
 
    static boolean condition = false;
    static Semaphore semaphore = new Semaphore(1);
 
    public static void main(String[] args) {
        new ThreadRunner() {
            @Override
            public void thread1() {
            	
                sharedVar = 1;
                try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                condition = true;
                semaphore.release();}
            
 
            @Override
            public void thread2() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                while (!condition) {
                    Thread.yield();
                
                if (sharedVar != 1) {
                    throw new RuntimeException("How is this possible!?");
                }
            } semaphore.release();
                }
        };
    }
}
