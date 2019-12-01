package org.graphwalker.restful;

import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.io.common.ResourceUtils;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestExecutionException;
import org.graphwalker.java.test.TestExecutor;
import org.graphwalker.restjson.RestJson;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import java.io.IOException;
import static org.hamcrest.core.Is.is;



@GraphWalker(value = "random(edge_coverage(100))", start = "v_REST_Listener")
public class RestJsonModel extends ExecutionContext implements RestJson {
  private Adapter restJsonAdapter = new Adapter();
  private final String REST_URL = "http://localhost:5001/graphwalker/";
  Restful rest;
  HttpResponse response;


  @BeforeExecution
  public void startRestServer() throws Exception {
      restJsonAdapter.init();
      ResourceConfig rc = new DefaultResourceConfig();
      rest = new Restful(null, true, true);
      rc.getSingletons().add(rest);
      restJsonAdapter.startServer(rc);
  }

  @AfterExecution
  public void stopRestServer() {
    restJsonAdapter.reset();
    restJsonAdapter.stopServer();
  }

  @Test
  public void RESTApiBasicTest() throws IOException {
    TestExecutor testExecutor = new TestExecutor(getClass());
    try {
      testExecutor.execute(false);
    } catch (TestExecutionException e) {
          System.err.println(e.getStackTrace());
    }
  }

  private CloseableHttpResponse httpExecute(HttpRequestBase request) {
    try {
      return HttpClientBuilder.create().build().execute(request);
    } catch (IOException e) {
      Assert.fail(e.getMessage());
    }
    return null;
  }

  private String getResonseBody() {
        try {
            return new BasicResponseHandler().handleResponse(response);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        return null;
    }

  @Override
  public void v_REST_Listener() {
    Assert.assertNull(rest.getContexts());
    Assert.assertNull(rest.getMachine());
  }

  @Override
  public void e_GETJsonResponse() {
      //The call getStatistics will fetch the current statistics of the session
    response = httpExecute(new HttpGet
            (REST_URL+"getStatistics"));
  }


  @Override
  public void e_Reset() {
      //The call restart will reset currently load model(s) to it’s initial states.
    response = httpExecute(new HttpPut
            (REST_URL+"restart"));
  }

  @Override
  public void v_RESTServices() {
    Assert.assertThat(response.getStatusLine().getStatusCode(), is(200));
    String body = getResonseBody();
    System.out.println(body);
    Assert.assertThat(body, is("{\"result\":\"ok\"}"));
    Assert.assertNotNull(rest.getContexts());
    Assert.assertNotNull(rest.getMachine());

    response = httpExecute(new HttpGet(REST_URL+"getStatistics"));
    Assert.assertThat(response.getStatusLine().getStatusCode(), is(200));
    body = getResonseBody();
    //logger.debug(body);
    System.out.println(body);
    JSONObject responseJSON = new JSONObject(body);
    JSONAssert.assertEquals("Wrong number of edge coverage", "{edgeCoverage:0}", responseJSON, false);
    JSONAssert.assertEquals("Result should be ok", "{result:\"ok\"}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of total visited edges", "{totalNumberOfVisitedEdges:0}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of total number of visited vertices", "{totalNumberOfVisitedVertices:0}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of vertices", "{totalNumberOfVertices:7}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of edges", "{totalNumberOfEdges:12}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of unvisited vertices", "{totalNumberOfUnvisitedVertices:7}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of vertex coverage", "{vertexCoverage:0}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of unvisited edges", "{totalNumberOfUnvisitedEdges:12}", responseJSON, false);
  }

  @Override
  public void e_POST() {
      //The Rest call load uploads model(s) in JSON format
      // and resets GraphWalker with the new test.
    HttpPost request = new HttpPost
            (REST_URL+"load");
    FileEntity fileEntity = new FileEntity(ResourceUtils.getResourceAsFile
            ("Shopping_Data/group1.json"), ContentType.TEXT_PLAIN);
    request.setEntity(fileEntity);
    response = httpExecute(request);
  }

  @Override
  public void e_GET() {
      //The Rest call hasNext queries the service if there is anymore elements to fetch.
      // If yes, then the fulfilment of the stop conditions has not yet been reached.
    HttpGet request = new HttpGet
            (REST_URL +"hasNext");
    response = httpExecute(request);
  }

  @Override
  public void v_GetJson() {
      //{
      //  "result":"ok",
      //  "hasNext":"true"
      //}
    Assert.assertThat(response.getStatusLine().getStatusCode(),
            is(200));
    String body = getResonseBody();
    System.out.println(body);
    Assert.assertThat(body, is("{\"result\":\"ok\",\"hasNext\":\"true\"}"));
    Assert.assertNotNull(rest.getContexts());
    Assert.assertNotNull(rest.getMachine());
  }

  @Override
    public void e_GETNext() {
        //The getNext is used to get the next element from the path generation.
        response = httpExecute(new HttpGet
                (REST_URL+"getNext"));
  }

    @Override
    public void v_GETNext() {
        //{
        //  "result":"ok",
        //  "currentElementName":"<The name of the element>"
        //}
        Assert.assertThat(response.getStatusLine().getStatusCode(),
                is(200));
        String JsonData = getResonseBody();
        System.out.println(JsonData);
        JSONObject responseJSON = new JSONObject(JsonData);
        JSONAssert.assertEquals("Wrong number of elements", "{numberOfElements:19}", responseJSON, false);
        JSONAssert.assertEquals("Result should be ok", "{result:\"ok\"}", responseJSON, false);
        JSONAssert.assertEquals("Wrong model name", "{modelName:\"MBT_Assignment1\"}", responseJSON, false);
        JSONAssert.assertEquals("Wrong current element id", "{currentElementID:\"e0\"}", responseJSON, false);
        JSONAssert.assertEquals("Wrong current element name", "{currentElementName:\"e_init\"}", responseJSON, false);
        JSONAssert.assertEquals("Wrong data", "{data:[{num_of_books:\"0\"},{MAX_BOOKS:\"5\"}]}", responseJSON, false);
        JSONAssert.assertEquals("Wrong number of unvisited elements", "{numberOfUnvisitedElements:18}", responseJSON, false);
        Assert.assertNotNull(rest.getContexts());
        Assert.assertNotNull(rest.getMachine());
    }

    @Override
    public void e_GETCurrentData() {
        //The call getData is used to ask GraphWalker for the current data values of the current model.
        response = httpExecute(new HttpGet
                (REST_URL+"getData"));
    }

    @Override
  public void v_GETCurrentData() {
    Assert.assertThat(response.getStatusLine().getStatusCode(),
            is(200));
    //{
        //  "result":"ok",
        //  "data":
        //  {
        //    "num_of_books":"0",
        //    "MAX_BOOKS":"5"
        //  }
        //}
    String JsonData = getResonseBody();
    System.out.println(JsonData);
    JSONObject responseJSON = new JSONObject(JsonData);
    JSONAssert.assertEquals("Result should be ok", "{result:\"ok\"}", responseJSON, false);
    JSONAssert.assertEquals("Wrong value of num_of_books", "{data:{num_of_books:\"0\"}}", responseJSON, false);
    JSONAssert.assertEquals("Wrong value of MAX_BOOKS", "{data:{MAX_BOOKS:\"5\"}}", responseJSON, false);
    Assert.assertNotNull(rest.getContexts());
    Assert.assertNotNull(rest.getMachine());
  }

    @Override
    public void e_PUT() {
        //The call setData is used to set data in the current model.
        response = httpExecute(new HttpPut
                (REST_URL+"setData/MAX_BOOKS=6;"));
    }

    @Override
    public void v_PUTData() {
        Assert.assertThat(response.getStatusLine().getStatusCode(),
                is(200));
        String JsonData = getResonseBody();
        System.out.println(JsonData);
        Assert.assertThat(JsonData,
                is("{\"result\":\"ok\"}"));
        Assert.assertNotNull(rest.getContexts());
        Assert.assertNotNull(rest.getMachine());
    }

  @Override
  public void v_GETJsonResponse() {
      //The call getStatistics will fetch the current statistics of the session
    Assert.assertThat(response.getStatusLine().getStatusCode(),
            is(200));
    //curl http://localhost:8887/graphwalker/getStatistics
      //{"result":"ok","vertexCoverage":85,"totalNumberOfEdges":12,"totalNumberOfVisitedVertices":6,"totalNumberOfUnvisitedVertices":1,"totalNumberOfVisitedEdges":6,"edgeCoverage":50,"totalNumberOfVertices":7,"totalNumberOfUnvisitedEdges":6}
    String JsonData = getResonseBody();
    System.out.println(JsonData);
    JSONObject responseJSON = new JSONObject(JsonData);
    JSONAssert.assertEquals("Wrong number of edge coverage", "{edgeCoverage:8}", responseJSON, false);
    JSONAssert.assertEquals("Result should be ok", "{result:\"ok\"}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of total visited edges", "{totalNumberOfVisitedEdges:1}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of total number of visited vertices", "{totalNumberOfVisitedVertices:0}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of vertices", "{totalNumberOfVertices:7}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of edges", "{totalNumberOfEdges:12}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of unvisited vertices", "{totalNumberOfUnvisitedVertices:7}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of vertex coverage", "{vertexCoverage:0}", responseJSON, false);
    JSONAssert.assertEquals("Wrong number of unvisited edges", "{totalNumberOfUnvisitedEdges:11}", responseJSON, false);
    Assert.assertNotNull(rest.getContexts());
    Assert.assertNotNull(rest.getMachine());
  }
}
