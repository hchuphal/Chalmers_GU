import java.util.concurrent.Semaphore;

public class DoubleCheckedLocking {
 
	static Semaphore semaphore = new Semaphore(1);
	
    static class Helper {
       Object data;
       
        Helper() {
            data = new Object();
        }
    }
 
    public static void main(String[] args) {
        new ThreadRunner() {
 
        	
            private Helper helper;
 
            private Helper getHelper() {
                if (helper == null) {
                	
                        if (helper == null) {
                            helper = new Helper();
                        }
                       
                }
                return helper;
            }
 
            @Override
            public void thread1() {
            	try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                getHelper();
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
                getHelper();
                semaphore.release();
            }
        };
    }
}
