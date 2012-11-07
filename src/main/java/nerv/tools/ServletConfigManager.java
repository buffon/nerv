package main.java.nerv.tools;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class ServletConfigManager {
	
	public static Map<String ,Class<?>> servletMap = new HashMap<String ,Class<?>> ();
	
	public static void servletConfigParse(HttpServletRequest req){

		SAXReader sr = new SAXReader();

		try {
			
			InputStream is =ServletConfigManager.class.getResourceAsStream("/servlet-config.xml");
			Document dt = sr.read(is);
			Element config = dt.getRootElement();
			List<?> list = config.elements("servlet");
			for(Object o : list){
				Element element = (Element) o;
				String name = element.attributeValue("name");
				Class<?> clazz = Class.forName(element.attributeValue("class"));
				servletMap.put(name, clazz);
			}

		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		
	}

}
