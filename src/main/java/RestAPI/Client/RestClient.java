package RestAPI.Client;

import io.restassured.response.Response;
//import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestClient {


    //Get Method
   /* public void get(String url) throws IOException {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet hget=new HttpGet(url);//http get request
        CloseableHttpResponse hresponse= httpClient.execute(hget);//hit the get url
        int responseCode=hresponse.getStatusLine().getStatusCode();
        System.out.println("status code is:"+responseCode);
        String responseBody= EntityUtils.toString(hresponse.getEntity(),"UTF8");
        JSONObject jobj=new JSONObject(responseBody);
        System.out.println("status body is:"+jobj);
        Header[] headerArrya= hresponse.getAllHeaders();

        HashMap<String,String> hmap=new HashMap<String,String>();

        for(Header header:headerArrya)
        {
            hmap.put(header.getName(),header.getValue());
        }
        System.out.println("Headers are:************"+hmap);


    }*/

    public void get(String url)
    {


        given().
               get(url).
        then().statusCode(200).
                body("data[0].id",equalTo(1)).
                body("data[1].first_name",equalTo("Janet"));

    }




}
