package main.java.nerv.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


public class BaseRequest extends HttpServletRequestWrapper {

	//public static Logger logger = Logger.getLogger(BaseRequest.class);
	
	public BaseRequest(HttpServletRequest request) {
		super(request);
	}

	/*
	 * get object from request
	 */
	public <T extends BaseBean> T getObject(Class<T> clazz,BaseRequest request){
	//	logger.info("obey an object!");
		T object = null;
		try {
			object = (T)clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for(Field field:fields){
				if(request.getParameter(field.getName()) != null){
					String str = "set"+field.getName().substring(0,1).toUpperCase() + field.getName().substring(1);
					Method method = clazz.getMethod(str, String.class);
					method.invoke(object,request.getParameter(field.getName()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return object;
	}
	
	/*put object to page*/
    public void putParams(BaseRequest request,String key,Object object){
    	request.setAttribute(key, object);
	}
    
    /*put something  common in a session*/
    public void sessionPut(BaseRequest request,String key,Object object){
    	request.getSession().setAttribute(key, object);
    }
    
    public Object sessionGet(BaseRequest request,String key){
    	return request.getSession().getAttribute(key);
    }
    
    public void cookiePut(BaseRequest request,String key,Object object){
    	Cookie[] cookies = request.getCookies();
    	//cookies[cookies.length].
    }
    
    public Object cookieGet(BaseRequest request,String key){
    	return request.getSession().getAttribute(key);
    }
}
