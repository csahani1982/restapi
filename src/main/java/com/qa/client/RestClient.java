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

public class RestClient {
	
	String url ;
	
	
	
//1. Get Method
	public CloseableHttpResponse get( String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient HttpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse closeablehttpRespons = HttpClient.execute(httpget);
		return closeablehttpRespons;
		
		//a. Status code.

	}
}
