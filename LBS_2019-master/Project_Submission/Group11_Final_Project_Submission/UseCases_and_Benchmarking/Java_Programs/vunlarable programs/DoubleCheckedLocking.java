public class DoubleCheckedLocking {
 
	
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
                getHelper();
            }
 
            @Override
            public void thread2() {
                getHelper();
            }
        };
    }
}
