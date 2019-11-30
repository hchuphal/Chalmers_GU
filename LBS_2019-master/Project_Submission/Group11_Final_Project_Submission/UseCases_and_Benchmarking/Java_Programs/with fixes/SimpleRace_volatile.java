public class SimpleRace {
 
	  static volatile int sharedVar;
	  
    public static void main(String[] args) {
        new ThreadRunner() {
            @Override
            public void thread1() {
                sharedVar++;    
            }
            
 
            @Override
            public void thread2() {
                    sharedVar++;
     
            }
        };
    }
}
