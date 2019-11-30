public class BrokenSpinningLoop {
 
    static int sharedVar;
 
    static volatile boolean condition = false;
    
 
    public static void main(String[] args) {
        new ThreadRunner() {
            @Override
            public void thread1() {
            	
                sharedVar = 1;
                condition = true;}
            
 
            @Override
            public void thread2() {
            	
                while (!condition) {
                    Thread.yield();
                
                if (sharedVar != 1) {
                    throw new RuntimeException("How is this possible!?");
                }
            }}
        };
    }
}
