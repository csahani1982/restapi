package com.qa.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.qa.base.TestBase;
import com.qa.client.RestClient;


public class GetAPITest extends TestBase {
	
	TestBase testbase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeablehttpresponse;
	@BeforeMethod
	public void setUp() {
		testbase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		url=serviceUrl+apiUrl;
		System.out.println(url);
	}
	
	
	@Test
	public void checkAPIStatusTest() throws ClientProtocolException, IOException {
		
		restClient = new RestClient();
		closeablehttpresponse = restClient.get(url);
		
		int StatusCode = closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("status code  --> " + StatusCode);

		Assert.assertEquals(StatusCode, 201, "Status code is not 201");

	}
	
	@Test
	public void getAPIJSONBodyTest() throws ClientProtocolException, IOException {

		
			String respnseString= EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
		
		//b. JSON string
				JSONObject responseJSON = new JSONObject(respnseString);
				System.out.println("Response  JSON --> " + responseJSON);
		
	}
	
	@Test
	public void getAPIHeaderTest() throws ClientProtocolException, IOException {

		
			
		
		//c. All Headers
		Header[] headarrayArray = closeablehttpresponse.getAllHeaders();
		HashMap<String, String> allheaders = new HashMap<String, String>();
		
		for(Header header : headarrayArray) {
			allheaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers Array ----> " +  allheaders);
		
		
		
 	}
	
	}
	

