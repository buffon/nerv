package test.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class PropertiesReadTest {

	public static Logger logger = Logger.getLogger(PropertiesReadTest.class);
	
	public static void main(String args[]){
		InputStream is = PropertiesReadTest.class.getResourceAsStream("/MySqlConfig.properties");
		Properties pros = new Properties();
		try {
			pros.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.info("className:"+pros.getProperty("className"));
		logger.info("url:"+pros.getProperty("url"));
	}
}
