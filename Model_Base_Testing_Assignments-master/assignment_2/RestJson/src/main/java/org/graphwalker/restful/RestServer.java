package org.graphwalker.restful;


import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.ResourceConfig;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClientBuilder;
import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.Assert;

import java.io.IOException;

public class RestServer {
    HttpServer server;
    HttpResponse response;

    public void startRestServer(ResourceConfig rc ) throws Exception {
        String restUrl = "http://127.0.0.1:" + 5001;
        server = GrizzlyServerFactory.createHttpServer(restUrl, rc);
        System.out.println("Starting: REST Web Services....");
        server.start();
    }

    private CloseableHttpResponse httpExecute(HttpRequestBase request) {
        try {
            return HttpClientBuilder.create().build().execute(request);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        return null;
    }

    public void stopRestServer() {
        System.out.println("Stopping: REST Web Services!");
        server.stop();
    }

}
