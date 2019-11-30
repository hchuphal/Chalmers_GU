public class SimpleRace {
 
	  static int sharedVar;
	  
    public static void main(String[] args) {
        new ThreadRunner() {
            @Override
            public void thread1() {
		synchronized(this) {
                sharedVar++;   } 
            }
            
 
            @Override
            public void thread2() {
		synchronized(this) {
                    sharedVar++; }
     
            }
        };
    }
}
