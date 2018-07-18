package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	public TestBase() {
		
		
		try {
			FileInputStream fl = new FileInputStream("/Users/Chetanpreet/eclipse-workspace/restapi/src/main/java/com/qa/config/config.properties");
			prop = new Properties();
			prop.load(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
