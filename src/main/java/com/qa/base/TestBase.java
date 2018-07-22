package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class TestBase {
	
	public Properties prop;
	public Logger log = Logger.getLogger(TestBase.class);
	
	public TestBase() {
		
		
		try {
			FileInputStream fl = new FileInputStream("/Users/Chetanpreet/eclipse-workspace/restapi/src/main/java/com/qa/config/config.properties");
			prop = new Properties();
			prop.load(fl);
			log.info("Properties file have been loaded BY chetan");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
