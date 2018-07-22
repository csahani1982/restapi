package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.log4testng.Logger;

public class RestClient {
	
	String url ;
	Logger log = Logger.getLogger(RestClient.class);
	
	
//1. Get Method
	public CloseableHttpResponse get( String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		log.info("GETTING the IRL : By CHETAN");
		CloseableHttpResponse closeablehttpRespons = HttpClient.execute(httpget);
		return closeablehttpRespons;
		
		//a. Status code.

	}
}
