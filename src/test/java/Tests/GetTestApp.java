package Tests;

import RestAPI.BaseClass.TestBase;
import RestAPI.Client.RestClient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetTestApp extends TestBase {
   TestBase testBase;
    String url;
    String serviceappurl;
    String getURI;
    RestClient rc;

    @BeforeMethod
    public void setup()  {
        testBase=new TestBase();
       url=pro.getProperty("BaseUrl");
       System.out.println("BaseURL is**********"+url);
         serviceappurl=pro.getProperty("ServiceURL");
        System.out.println("ServiceURL is**********"+serviceappurl);
        getURI=url+serviceappurl;
        System.out.println("URI is**********"+getURI);
    }
    @Test
    public void getAPITest()throws IOException
    {
        rc=new RestClient();
        rc.get(getURI);
    }
}
