package org.graphwalker.restful;

import com.sun.jersey.api.core.ResourceConfig;
import org.graphwalker.java.test.TestExecutionException;

public class Adapter {

    private RestServer restServer = new RestServer();


   public void startServer(ResourceConfig rc ) throws Exception{
       try {
           restServer.startRestServer(rc);
       } catch (TestExecutionException e) {
           System.err.println(e.getStackTrace());
       }
    }

    public void stopServer(){
        try {
            restServer.stopRestServer();
        } catch (TestExecutionException e) {
            System.err.println(e.getStackTrace());
        }
    }

    public void init() {
        System.out.println("Adapter: init REST-Json SUT");
    }

    public void reset() {
        System.out.println("Adapter: reset REST-Json SUT");
    }


}
